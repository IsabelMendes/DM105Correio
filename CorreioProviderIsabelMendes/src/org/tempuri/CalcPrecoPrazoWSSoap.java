/**
 * CalcPrecoPrazoWSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface CalcPrecoPrazoWSSoap extends java.rmi.Remote {

    /**
     * Calcula o preço e o prazo com a data atual
     */
    public org.tempuri.CResultado calcPrecoPrazo(java.lang.String nCdEmpresa, java.lang.String sDsSenha, java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String nVlPeso, int nCdFormato, java.math.BigDecimal nVlComprimento, java.math.BigDecimal nVlAltura, java.math.BigDecimal nVlLargura, java.math.BigDecimal nVlDiametro, java.lang.String sCdMaoPropria, java.math.BigDecimal nVlValorDeclarado, java.lang.String sCdAvisoRecebimento) throws java.rmi.RemoteException;

    /**
     * Calcula o preço e o prazo com uma data especificada
     */
    public org.tempuri.CResultado calcPrecoPrazoData(java.lang.String nCdEmpresa, java.lang.String sDsSenha, java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String nVlPeso, int nCdFormato, java.math.BigDecimal nVlComprimento, java.math.BigDecimal nVlAltura, java.math.BigDecimal nVlLargura, java.math.BigDecimal nVlDiametro, java.lang.String sCdMaoPropria, java.math.BigDecimal nVlValorDeclarado, java.lang.String sCdAvisoRecebimento, java.lang.String sDtCalculo) throws java.rmi.RemoteException;

    /**
     * Calcula o preço e o prazo considerando as restrições de entrega
     */
    public org.tempuri.CResultado calcPrecoPrazoRestricao(java.lang.String nCdEmpresa, java.lang.String sDsSenha, java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String nVlPeso, int nCdFormato, java.math.BigDecimal nVlComprimento, java.math.BigDecimal nVlAltura, java.math.BigDecimal nVlLargura, java.math.BigDecimal nVlDiametro, java.lang.String sCdMaoPropria, java.math.BigDecimal nVlValorDeclarado, java.lang.String sCdAvisoRecebimento, java.lang.String sDtCalculo) throws java.rmi.RemoteException;

    /**
     * Calcula somente o preço com a data atual
     */
    public org.tempuri.CResultado calcPreco(java.lang.String nCdEmpresa, java.lang.String sDsSenha, java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String nVlPeso, int nCdFormato, java.math.BigDecimal nVlComprimento, java.math.BigDecimal nVlAltura, java.math.BigDecimal nVlLargura, java.math.BigDecimal nVlDiametro, java.lang.String sCdMaoPropria, java.math.BigDecimal nVlValorDeclarado, java.lang.String sCdAvisoRecebimento) throws java.rmi.RemoteException;

    /**
     * Calcula somente o preço com uma data especificada
     */
    public org.tempuri.CResultado calcPrecoData(java.lang.String nCdEmpresa, java.lang.String sDsSenha, java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String nVlPeso, int nCdFormato, java.math.BigDecimal nVlComprimento, java.math.BigDecimal nVlAltura, java.math.BigDecimal nVlLargura, java.math.BigDecimal nVlDiametro, java.lang.String sCdMaoPropria, java.math.BigDecimal nVlValorDeclarado, java.lang.String sCdAvisoRecebimento, java.lang.String sDtCalculo) throws java.rmi.RemoteException;

    /**
     * Calcula somente o prazo com a data atual
     */
    public org.tempuri.CResultado calcPrazo(java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino) throws java.rmi.RemoteException;

    /**
     * Calcula somente o prazo com uma data especificada
     */
    public org.tempuri.CResultado calcPrazoData(java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String sDtCalculo) throws java.rmi.RemoteException;

    /**
     * Calcula o prazo considerando restrição de entrega
     */
    public org.tempuri.CResultado calcPrazoRestricao(java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String sDtCalculo) throws java.rmi.RemoteException;

    /**
     * Calcula os preços dos serviços FAC
     */
    public org.tempuri.CResultado calcPrecoFAC(java.lang.String nCdServico, java.lang.String nVlPeso, java.lang.String strDataCalculo) throws java.rmi.RemoteException;

    /**
     * Calcula a data máxima de entrega de determinado objeto
     */
    public org.tempuri.CResultadoObjeto calcDataMaxima(java.lang.String codigoObjeto) throws java.rmi.RemoteException;

    /**
     * Lista os serviços que estão disponíveis para cálculo de preço
     * e/ou prazo
     */
    public org.tempuri.CResultadoServicos listaServicos() throws java.rmi.RemoteException;

    /**
     * Lista os serviços que são calculados pelo STAR
     */
    public org.tempuri.CResultadoServicos listaServicosSTAR() throws java.rmi.RemoteException;

    /**
     * Método para mostrar se o trecho consultado utiliza modal aéreo
     * ou terrestre
     */
    public org.tempuri.CResultadoModal verificaModal(java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino) throws java.rmi.RemoteException;

    /**
     * Retorna a versão atual do componente
     */
    public org.tempuri.Versao getVersao() throws java.rmi.RemoteException;
}
