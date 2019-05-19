/**
 * CServicosCalculo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CServicosCalculo  implements java.io.Serializable {
    private java.lang.String codigo;

    private java.lang.String descricao;

    private java.lang.String calcula_preco;

    private java.lang.String calcula_prazo;

    private java.lang.String erro;

    private java.lang.String msgErro;

    public CServicosCalculo() {
    }

    public CServicosCalculo(
           java.lang.String codigo,
           java.lang.String descricao,
           java.lang.String calcula_preco,
           java.lang.String calcula_prazo,
           java.lang.String erro,
           java.lang.String msgErro) {
           this.codigo = codigo;
           this.descricao = descricao;
           this.calcula_preco = calcula_preco;
           this.calcula_prazo = calcula_prazo;
           this.erro = erro;
           this.msgErro = msgErro;
    }


    /**
     * Gets the codigo value for this CServicosCalculo.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this CServicosCalculo.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the descricao value for this CServicosCalculo.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this CServicosCalculo.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the calcula_preco value for this CServicosCalculo.
     * 
     * @return calcula_preco
     */
    public java.lang.String getCalcula_preco() {
        return calcula_preco;
    }


    /**
     * Sets the calcula_preco value for this CServicosCalculo.
     * 
     * @param calcula_preco
     */
    public void setCalcula_preco(java.lang.String calcula_preco) {
        this.calcula_preco = calcula_preco;
    }


    /**
     * Gets the calcula_prazo value for this CServicosCalculo.
     * 
     * @return calcula_prazo
     */
    public java.lang.String getCalcula_prazo() {
        return calcula_prazo;
    }


    /**
     * Sets the calcula_prazo value for this CServicosCalculo.
     * 
     * @param calcula_prazo
     */
    public void setCalcula_prazo(java.lang.String calcula_prazo) {
        this.calcula_prazo = calcula_prazo;
    }


    /**
     * Gets the erro value for this CServicosCalculo.
     * 
     * @return erro
     */
    public java.lang.String getErro() {
        return erro;
    }


    /**
     * Sets the erro value for this CServicosCalculo.
     * 
     * @param erro
     */
    public void setErro(java.lang.String erro) {
        this.erro = erro;
    }


    /**
     * Gets the msgErro value for this CServicosCalculo.
     * 
     * @return msgErro
     */
    public java.lang.String getMsgErro() {
        return msgErro;
    }


    /**
     * Sets the msgErro value for this CServicosCalculo.
     * 
     * @param msgErro
     */
    public void setMsgErro(java.lang.String msgErro) {
        this.msgErro = msgErro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CServicosCalculo)) return false;
        CServicosCalculo other = (CServicosCalculo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.calcula_preco==null && other.getCalcula_preco()==null) || 
             (this.calcula_preco!=null &&
              this.calcula_preco.equals(other.getCalcula_preco()))) &&
            ((this.calcula_prazo==null && other.getCalcula_prazo()==null) || 
             (this.calcula_prazo!=null &&
              this.calcula_prazo.equals(other.getCalcula_prazo()))) &&
            ((this.erro==null && other.getErro()==null) || 
             (this.erro!=null &&
              this.erro.equals(other.getErro()))) &&
            ((this.msgErro==null && other.getMsgErro()==null) || 
             (this.msgErro!=null &&
              this.msgErro.equals(other.getMsgErro())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getCalcula_preco() != null) {
            _hashCode += getCalcula_preco().hashCode();
        }
        if (getCalcula_prazo() != null) {
            _hashCode += getCalcula_prazo().hashCode();
        }
        if (getErro() != null) {
            _hashCode += getErro().hashCode();
        }
        if (getMsgErro() != null) {
            _hashCode += getMsgErro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CServicosCalculo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "cServicosCalculo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calcula_preco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "calcula_preco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calcula_prazo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "calcula_prazo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "erro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgErro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "msgErro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
