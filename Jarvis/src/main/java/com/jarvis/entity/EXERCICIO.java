package com.jarvis.entity;

import java.io.Serializable;


public class EXERCICIO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int CD_REGISTRO;
	private String DT_REGISTRO;
	private String NM_HORA;
	private String INTENSIDADE;
	private int DURACAO;
	private int CALORIAS;
	private String OBSERVACAO;
	private int CD_USUARIO;
	private int CD_TIPO_USUARIO;
	private String NM_USUARIO;
	
	
	
	
	
	
	
	public int getCD_REGISTRO() {
		return CD_REGISTRO;
	}

	public void setCD_REGISTRO(int cD_REGISTRO) {
		CD_REGISTRO = cD_REGISTRO;
	}

	public String getDT_REGISTRO() {
		return DT_REGISTRO;
	}

	public void setDT_REGISTRO(String dT_REGISTRO) {
		DT_REGISTRO = dT_REGISTRO;
	}

	public String getNM_HORA() {
		return NM_HORA;
	}

	public void setNM_HORA(String nM_HORA) {
		NM_HORA = nM_HORA;
	}

	public String getINTENSIDADE() {
		return INTENSIDADE;
	}

	public void setINTENSIDADE(String iNTENSIDADE) {
		INTENSIDADE = iNTENSIDADE;
	}

	public int getDURACAO() {
		return DURACAO;
	}

	public void setDURACAO(int dURACAO) {
		DURACAO = dURACAO;
	}

	public int getCALORIAS() {
		return CALORIAS;
	}

	public void setCALORIAS(int cALORIAS) {
		CALORIAS = cALORIAS;
	}

	public String getOBSERVACAO() {
		return OBSERVACAO;
	}

	public void setOBSERVACAO(String oBSERVACAO) {
		OBSERVACAO = oBSERVACAO;
	}

	public int getCD_USUARIO() {
		return CD_USUARIO;
	}

	public void setCD_USUARIO(int cD_USUARIO) {
		CD_USUARIO = cD_USUARIO;
	}
	
	public int getCD_TIPO_USUARIO() {
		return CD_TIPO_USUARIO;
	}

	public void setCD_TIPO_USUARIO(int cD_TIPO_USUARIO) {
		CD_TIPO_USUARIO = cD_TIPO_USUARIO;
	}
	
	public String getNM_USUARIO() {
		return NM_USUARIO;
	}

	public void setNM_USUARIO(String nM_USUARIO) {
		NM_USUARIO = nM_USUARIO;
	}




	

	public EXERCICIO() {}

	public EXERCICIO(int cD_REGISTRO, String dT_REGISTRO, String nM_HORA, String iNTENSIDADE, int dURACAO, int cALORIAS,
			String oBSERVACAO, int cD_USUARIO, int cD_TIPO_USUARIO) {
		super();
		CD_REGISTRO = cD_REGISTRO;
		DT_REGISTRO = dT_REGISTRO;
		NM_HORA = nM_HORA;
		INTENSIDADE = iNTENSIDADE;
		DURACAO = dURACAO;
		CALORIAS = cALORIAS;
		OBSERVACAO = oBSERVACAO;
		CD_USUARIO = cD_USUARIO;
		
	}

	@Override
	public String toString() {
		return "USUARIO [DT_REGISTRO=" + DT_REGISTRO + ", NM_HORA=" + NM_HORA
				+ ", INTENSIDADE=" + INTENSIDADE + ", DURACAO=" + DURACAO + ", CALORIAS=" + CALORIAS + ", OBSERVACAO="
				+ OBSERVACAO + "]";
	}







	


	
	
	
	
	
}

