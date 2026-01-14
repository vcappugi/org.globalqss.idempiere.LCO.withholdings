-14/01/2026 -
Plugins especial derivado de globalqss LCO. Esta version tiene ajustes para venezuela:
a. Ajustar la CIUU (actividad Comercial) por producto, incluyendo en el modelo del producto esta relacion
b. Añade al metodo recalcWithholdings de la clace extendida LCO_Minvoice los calculos para que sea generada la retencion por:
  1. Actividad comercial del producto
  2. Incluir tio de persona (TaxIDType)
  3. Region (AD_Region) del tercero
c. Modelo nuevo para el tipo de documetno comprobante de retencion
e. Relacion del tipo de retencion con el tipo de documento, para establecer el comprobante de retencion correspondiente
---------------------
Probado con Idempiere 12, Java 21, maven 3.9.12, 

