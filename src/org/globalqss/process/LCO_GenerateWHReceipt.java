package org.globalqss.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.globalqss.model.X_LCO_WithholdingReceipt;

public class LCO_GenerateWHReceipt extends SvrProcess{

	/** The Record						*/
	private int		p_Record_ID = 0;
	private String     p_WHReceipt ="";
	
	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("LCO_WithholdingReceipt_ID"))
				p_WHReceipt =  para[i].getParameterAsString();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_Record_ID = getRecord_ID();
		
	}

	@Override
	protected String doIt() throws Exception {
		int oldReceipt;
		int NoReceipt;
		int ncomp=0;
		String sql = "select iw.C_Invoice_ID, iw.LCO_InvoiceWithholding_ID, iw.C_Tax_ID, \n"
				+ "iw.taxamt, iw.taxbaseamt, \n"
				+ "ct.taxindicator,\n"
				+ "dt.name || ' de la Factura  ' || i.documentno, dt.c_doctype_id, i.dateacct, ct2.taxindicator as alic, i.c_bpartner_id,   \n"
				+ "currencyconvert(iw.taxamt, i.c_currency_id, (select c_currency_id from "
				+ "C_AcctSchema where C_AcctSchema.isdefault ='Y' and C_AcctSchema.ad_client_id =i.ad_client_id limit 1), i.dateinvoiced, null,i.ad_client_id, null) as convertamount, "
				+ "iw.c_bpartner_id as alterpartner \n"
				+ "from lco_invoicewithholding iw\n"
				+ "inner join c_invoice i on i.c_invoice_id = iw.c_invoice_id\n"
				+ "inner join c_tax ct on ct.c_tax_id = iw.c_tax_id\n"
				+ "left join c_tax ct2 on ct2.c_tax_id = ct.c_tax_source_id \n"
				+ "inner join lco_withholdingtype wt on wt.lco_withholdingtype_id = iw.lco_withholdingtype_id \n"
				+ "inner join c_doctype dt on dt.c_doctype_id = wt.c_doctype_id \n"
				+ "where iw.c_invoice_id ="+ p_Record_ID;
		PreparedStatement pstmt = DB.prepareStatement (sql, null);
		ResultSet rs;
		rs = pstmt.executeQuery();
		while (rs.next ())
		     {	 // seek exist comprobant 
			     //
			     oldReceipt = DB.getSQLValue(getTrx_Name(), "select LCO_WithholdingReceipt_ID from LCO_WithholdingReceipt where c_invoice_id="+p_Record_ID+" and c_tax_id="+rs.getInt(3));
			     if (oldReceipt > 0)   //si existe
			    	 NoReceipt = oldReceipt;
			     else
			    	 NoReceipt=0;
			     X_LCO_WithholdingReceipt receipt = new X_LCO_WithholdingReceipt (getCtx(), NoReceipt,getTrx_Name());
			     receipt.setC_Invoice_ID(p_Record_ID);
			     receipt.setName(rs.getString(7));
			     receipt.setTaxBaseAmt(rs.getBigDecimal(5));
			     if (rs.getInt(13) > 0)
			    	 receipt.setC_BPartner_ID(rs.getInt(13));
			     else
			         receipt.setC_BPartner_ID(rs.getInt(11));
			     receipt.setLCO_InvoiceWithholding_ID(rs.getInt(2));
			     receipt.setC_Tax_ID(rs.getInt(3));
			     receipt.setTaxAmt(rs.getBigDecimal(4));
			     receipt.setWithholdingAmt(rs.getBigDecimal(4));
			     receipt.setAliquot(rs.getString(10));
			     receipt.setC_DocType_ID(rs.getInt(8));
			     receipt.setDateTrx(rs.getTimestamp(9));
			     receipt.setWithholdingPercent(rs.getString(6));
			     receipt.setAmtConvert(rs.getBigDecimal(12));
			     receipt.save();
			     ncomp++;
			     
		     }
		
		
		return "Comprobantes Generados " + ncomp;
	}

	private String getTrx_Name() {
		// TODO Auto-generated method stub
		return null;
	}

}
