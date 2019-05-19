/**
 * CResultadoModal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CResultadoModal  implements java.io.Serializable {
    private org.tempuri.CModal[] servicosModal;

    public CResultadoModal() {
    }

    public CResultadoModal(
           org.tempuri.CModal[] servicosModal) {
           this.servicosModal = servicosModal;
    }


    /**
     * Gets the servicosModal value for this CResultadoModal.
     * 
     * @return servicosModal
     */
    public org.tempuri.CModal[] getServicosModal() {
        return servicosModal;
    }


    /**
     * Sets the servicosModal value for this CResultadoModal.
     * 
     * @param servicosModal
     */
    public void setServicosModal(org.tempuri.CModal[] servicosModal) {
        this.servicosModal = servicosModal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CResultadoModal)) return false;
        CResultadoModal other = (CResultadoModal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicosModal==null && other.getServicosModal()==null) || 
             (this.servicosModal!=null &&
              java.util.Arrays.equals(this.servicosModal, other.getServicosModal())));
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
        if (getServicosModal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicosModal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicosModal(), i);
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
        new org.apache.axis.description.TypeDesc(CResultadoModal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "cResultadoModal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicosModal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ServicosModal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "cModal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "cModal"));
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
