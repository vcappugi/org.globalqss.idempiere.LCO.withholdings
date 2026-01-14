/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.globalqss.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for LCO_WithholdingReceipt
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="LCO_WithholdingReceipt")
public class X_LCO_WithholdingReceipt extends PO implements I_LCO_WithholdingReceipt, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20240508L;

    /** Standard Constructor */
    public X_LCO_WithholdingReceipt (Properties ctx, int LCO_WithholdingReceipt_ID, String trxName)
    {
      super (ctx, LCO_WithholdingReceipt_ID, trxName);
      /** if (LCO_WithholdingReceipt_ID == 0)
        {
			setLCO_WithholdingReceipt_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_LCO_WithholdingReceipt (Properties ctx, int LCO_WithholdingReceipt_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, LCO_WithholdingReceipt_ID, trxName, virtualColumns);
      /** if (LCO_WithholdingReceipt_ID == 0)
        {
			setLCO_WithholdingReceipt_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_LCO_WithholdingReceipt (Properties ctx, String LCO_WithholdingReceipt_UU, String trxName)
    {
      super (ctx, LCO_WithholdingReceipt_UU, trxName);
      /** if (LCO_WithholdingReceipt_UU == null)
        {
			setLCO_WithholdingReceipt_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_LCO_WithholdingReceipt (Properties ctx, String LCO_WithholdingReceipt_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, LCO_WithholdingReceipt_UU, trxName, virtualColumns);
      /** if (LCO_WithholdingReceipt_UU == null)
        {
			setLCO_WithholdingReceipt_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_LCO_WithholdingReceipt (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_LCO_WithholdingReceipt[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Aliquot.
		@param Aliquot Aliquot
	*/
	public void setAliquot (String Aliquot)
	{
		set_Value (COLUMNNAME_Aliquot, Aliquot);
	}

	/** Get Aliquot.
		@return Aliquot	  */
	public String getAliquot()
	{
		return (String)get_Value(COLUMNNAME_Aliquot);
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
	{
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_ID)
			.getPO(getC_DocType_ID(), get_TrxName());
	}

	/** Set Document Type.
		@param C_DocType_ID Document type or rules
	*/
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0)
			set_ValueNoCheck (COLUMNNAME_C_DocType_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException
	{
		return (org.compiere.model.I_C_Invoice)MTable.get(getCtx(), org.compiere.model.I_C_Invoice.Table_ID)
			.getPO(getC_Invoice_ID(), get_TrxName());
	}

	/** Set Invoice.
		@param C_Invoice_ID Invoice Identifier
	*/
	public void setC_Invoice_ID (int C_Invoice_ID)
	{
		if (C_Invoice_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
	}

	/** Get Invoice.
		@return Invoice Identifier
	  */
	public int getC_Invoice_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Payment getC_Payment() throws RuntimeException
	{
		return (org.compiere.model.I_C_Payment)MTable.get(getCtx(), org.compiere.model.I_C_Payment.Table_ID)
			.getPO(getC_Payment_ID(), get_TrxName());
	}

	/** Set Payment.
		@param C_Payment_ID Payment identifier
	*/
	public void setC_Payment_ID (int C_Payment_ID)
	{
		if (C_Payment_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Payment_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
	}

	/** Get Payment.
		@return Payment identifier
	  */
	public int getC_Payment_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Tax getC_Tax() throws RuntimeException
	{
		return (org.compiere.model.I_C_Tax)MTable.get(getCtx(), org.compiere.model.I_C_Tax.Table_ID)
			.getPO(getC_Tax_ID(), get_TrxName());
	}

	/** Set Tax.
		@param C_Tax_ID Tax identifier
	*/
	public void setC_Tax_ID (int C_Tax_ID)
	{
		if (C_Tax_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Tax_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
	}

	/** Get Tax.
		@return Tax identifier
	  */
	public int getC_Tax_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Transaction Date.
		@param DateTrx Transaction Date
	*/
	public void setDateTrx (Timestamp DateTrx)
	{
		set_Value (COLUMNNAME_DateTrx, DateTrx);
	}

	/** Get Transaction Date.
		@return Transaction Date
	  */
	public Timestamp getDateTrx()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTrx);
	}

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Document No.
		@param DocumentNo Document sequence number of the document
	*/
	public void setDocumentNo (String DocumentNo)
	{
		set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set ExemptAmt.
		@param ExemptAmt ExemptAmt
	*/
	public void setExemptAmt (BigDecimal ExemptAmt)
	{
		set_Value (COLUMNNAME_ExemptAmt, ExemptAmt);
	}

	/** Get ExemptAmt.
		@return ExemptAmt	  */
	public BigDecimal getExemptAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ExemptAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Comment/Help.
		@param Help Comment or Hint
	*/
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp()
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	public org.globalqss.model.I_LCO_InvoiceWithholding getLCO_InvoiceWithholding() throws RuntimeException
	{
		return (org.globalqss.model.I_LCO_InvoiceWithholding)MTable.get(getCtx(), org.globalqss.model.I_LCO_InvoiceWithholding.Table_ID)
			.getPO(getLCO_InvoiceWithholding_ID(), get_TrxName());
	}

	/** Set Invoice Withholding.
		@param LCO_InvoiceWithholding_ID Invoice Withholding
	*/
	public void setLCO_InvoiceWithholding_ID (int LCO_InvoiceWithholding_ID)
	{
		if (LCO_InvoiceWithholding_ID < 1)
			set_ValueNoCheck (COLUMNNAME_LCO_InvoiceWithholding_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_LCO_InvoiceWithholding_ID, Integer.valueOf(LCO_InvoiceWithholding_ID));
	}

	/** Get Invoice Withholding.
		@return Invoice Withholding	  */
	public int getLCO_InvoiceWithholding_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LCO_InvoiceWithholding_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set WithholdingReceipt.
		@param LCO_WithholdingReceipt_ID WithholdingReceipt
	*/
	public void setLCO_WithholdingReceipt_ID (int LCO_WithholdingReceipt_ID)
	{
		if (LCO_WithholdingReceipt_ID < 1)
			set_ValueNoCheck (COLUMNNAME_LCO_WithholdingReceipt_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_LCO_WithholdingReceipt_ID, Integer.valueOf(LCO_WithholdingReceipt_ID));
	}

	/** Get WithholdingReceipt.
		@return WithholdingReceipt	  */
	public int getLCO_WithholdingReceipt_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LCO_WithholdingReceipt_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LCO_WithholdingReceipt_UU.
		@param LCO_WithholdingReceipt_UU LCO_WithholdingReceipt_UU
	*/
	public void setLCO_WithholdingReceipt_UU (String LCO_WithholdingReceipt_UU)
	{
		set_Value (COLUMNNAME_LCO_WithholdingReceipt_UU, LCO_WithholdingReceipt_UU);
	}

	/** Get LCO_WithholdingReceipt_UU.
		@return LCO_WithholdingReceipt_UU	  */
	public String getLCO_WithholdingReceipt_UU()
	{
		return (String)get_Value(COLUMNNAME_LCO_WithholdingReceipt_UU);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Payment amount.
		@param PayAmt Amount being paid
	*/
	public void setPayAmt (BigDecimal PayAmt)
	{
		set_ValueNoCheck (COLUMNNAME_PayAmt, PayAmt);
	}

	/** Get Payment amount.
		@return Amount being paid
	  */
	public BigDecimal getPayAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PayAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Tax Amount.
		@param TaxAmt Tax Amount for a document
	*/
	public void setTaxAmt (BigDecimal TaxAmt)
	{
		set_ValueNoCheck (COLUMNNAME_TaxAmt, TaxAmt);
	}

	/** Get Tax Amount.
		@return Tax Amount for a document
	  */
	public BigDecimal getTaxAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Tax base Amount.
		@param TaxBaseAmt Base for calculating the tax amount
	*/
	public void setTaxBaseAmt (BigDecimal TaxBaseAmt)
	{
		set_ValueNoCheck (COLUMNNAME_TaxBaseAmt, TaxBaseAmt);
	}

	/** Get Tax base Amount.
		@return Base for calculating the tax amount
	  */
	public BigDecimal getTaxBaseAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxBaseAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set Withholding Amount.
		@param WithholdingAmt Withholding Amount
	*/
	public void setWithholdingAmt (BigDecimal WithholdingAmt)
	{
		set_Value (COLUMNNAME_WithholdingAmt, WithholdingAmt);
	}

	/** Get Withholding Amount.
		@return Withholding Amount	  */
	public BigDecimal getWithholdingAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WithholdingAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set WithholdingPercent.
		@param WithholdingPercent WithholdingPercent
	*/
	public void setWithholdingPercent (String WithholdingPercent)
	{
		set_Value (COLUMNNAME_WithholdingPercent, WithholdingPercent);
	}

	/** Get WithholdingPercent.
		@return WithholdingPercent	  */
	public String  getWithholdingPercent()
	{
		return (String)get_Value(COLUMNNAME_WithholdingPercent);
	}

	@Override
	public void setAmtConvert(BigDecimal AmtConvert) {
		set_ValueNoCheck (COLUMNNAME_AmtConvert, AmtConvert);
		
	}

	@Override
	public BigDecimal getAmtConvert() {
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtConvert);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}