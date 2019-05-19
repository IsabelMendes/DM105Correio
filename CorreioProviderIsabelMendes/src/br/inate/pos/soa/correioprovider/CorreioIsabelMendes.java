package br.inate.pos.soa.correioprovider;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.tempuri.CResultado;
import org.tempuri.CalcPrecoPrazoWSLocator;
import org.tempuri.CalcPrecoPrazoWSSoap;

public class CorreioIsabelMendes {
	
	private static final String PAC = "04510";
	private static final String SEDEX = "04014";

	public String calcPrecoPrazo(String sCepOrigem, String sCepDestino, String nVlPeso, int nCdFormato, BigDecimal nVlComprimento, BigDecimal nVlAltura, BigDecimal nVlLargura, BigDecimal nVlDiametro, String sCdMaoPropria, BigDecimal nVlValorDeclarado, String sCdAvisoRecebimento) throws ServiceException, RemoteException {
		CalcPrecoPrazoWSSoap soap = new CalcPrecoPrazoWSLocator().getCalcPrecoPrazoWSSoap();
		CResultado resultado = soap.calcPrecoPrazo("", "", PAC, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento);	
		int prazoPAC = Integer.parseInt(resultado.getServicos()[0].getPrazoEntrega());
		
		System.out.println("Erro: " + resultado.getServicos()[0].getErro());
		System.out.println("Mensagem de erro: " + resultado.getServicos()[0].getMsgErro());
		System.out.println("Prazo de entrega: " + prazoPAC +" dias");
		System.out.println("Valor: R$ " + resultado.getServicos()[0].getValor());
		
		if(prazoPAC > 3) {
			resultado = soap.calcPrecoPrazo("", "", SEDEX, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento);	
			int prazoSEDEX = Integer.parseInt(resultado.getServicos()[0].getPrazoEntrega());

			return "Prazo inviável = " + prazoPAC + " dias. Aconselhamos usar o serviço SEDEX = " + prazoSEDEX + " dias.";
			
			
		} else {
			return "Prazo viável: " + prazoPAC +" dias";
			
		}
		
		
	}
	

}
