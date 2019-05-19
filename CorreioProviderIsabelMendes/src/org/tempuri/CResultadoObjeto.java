/**
 * CResultadoObjeto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CResultadoObjeto  implements java.io.Serializable {
    private org.tempuri.CObjeto[] objetos;

    public CResultadoObjeto() {
    }

    public CResultadoObjeto(
           org.tempuri.CObjeto[] objetos) {
           this.objetos = objetos;
    }


    /**
     * Gets the objetos value for this CResultadoObjeto.
     * 
     * @return objetos
     */
    public org.tempuri.CObjeto[] getObjetos() {
        return objetos;
    }


    /**
     * Sets the objetos value for this CResultadoObjeto.
     * 
     * @param objetos
     */
    public void setObjetos(org.tempuri.CObjeto[] objetos) {
        this.objetos = objetos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CResultadoObjeto)) return false;
        CResultadoObjeto other = (CResultadoObjeto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objetos==null && other.getObjetos()==null) || 
             (this.objetos!=null &&
              java.util.Arrays.equals(this.objetos, other.getObjetos())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getObjetos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjetos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjetos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CResultadoObjeto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "cResultadoObjeto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objetos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Objetos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "cObjeto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "cObjeto"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
