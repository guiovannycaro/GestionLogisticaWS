package com.ingenio.gestion_logistica.model;

public class Usuarios {
	
	Integer USU_ID;
	
	String USU_NOMBRES;
	
	String USU_DIRECCION;
	
	String USU_TELEFONO;
	
	String USU_CORREO;
	
	String USU_NUMDOCUMENTO;
	
	String USU_PASSWORD;
	
	Integer USU_TDOC_ID;
	
	Integer USU_ROL_ID;

	public Usuarios() {
	}

	public Usuarios(Integer uSU_ID, String uSU_NOMBRES, String uSU_DIRECCION, String uSU_TELEFONO, String uSU_CORREO,
			String uSU_NUMDOCUMENTO, String uSU_PASSWORD, Integer uSU_TDOC_ID, Integer uSU_ROL_ID) {
		USU_ID = uSU_ID;
		USU_NOMBRES = uSU_NOMBRES;
		USU_DIRECCION = uSU_DIRECCION;
		USU_TELEFONO = uSU_TELEFONO;
		USU_CORREO = uSU_CORREO;
		USU_NUMDOCUMENTO = uSU_NUMDOCUMENTO;
		USU_PASSWORD = uSU_PASSWORD;
		USU_TDOC_ID = uSU_TDOC_ID;
		USU_ROL_ID = uSU_ROL_ID;
	}

	public Integer getUSU_ID() {
		return USU_ID;
	}

	public void setUSU_ID(Integer uSU_ID) {
		USU_ID = uSU_ID;
	}

	public String getUSU_NOMBRES() {
		return USU_NOMBRES;
	}

	public void setUSU_NOMBRES(String uSU_NOMBRES) {
		USU_NOMBRES = uSU_NOMBRES;
	}

	public String getUSU_DIRECCION() {
		return USU_DIRECCION;
	}

	public void setUSU_DIRECCION(String uSU_DIRECCION) {
		USU_DIRECCION = uSU_DIRECCION;
	}

	public String getUSU_TELEFONO() {
		return USU_TELEFONO;
	}

	public void setUSU_TELEFONO(String uSU_TELEFONO) {
		USU_TELEFONO = uSU_TELEFONO;
	}

	public String getUSU_CORREO() {
		return USU_CORREO;
	}

	public void setUSU_CORREO(String uSU_CORREO) {
		USU_CORREO = uSU_CORREO;
	}

	public String getUSU_NUMDOCUMENTO() {
		return USU_NUMDOCUMENTO;
	}

	public void setUSU_NUMDOCUMENTO(String uSU_NUMDOCUMENTO) {
		USU_NUMDOCUMENTO = uSU_NUMDOCUMENTO;
	}

	public String getUSU_PASSWORD() {
		return USU_PASSWORD;
	}

	public void setUSU_PASSWORD(String uSU_PASSWORD) {
		USU_PASSWORD = uSU_PASSWORD;
	}

	public Integer getUSU_TDOC_ID() {
		return USU_TDOC_ID;
	}

	public void setUSU_TDOC_ID(Integer uSU_TDOC_ID) {
		USU_TDOC_ID = uSU_TDOC_ID;
	}

	public Integer getUSU_ROL_ID() {
		return USU_ROL_ID;
	}

	public void setUSU_ROL_ID(Integer uSU_ROL_ID) {
		USU_ROL_ID = uSU_ROL_ID;
	}

	@Override
	public String toString() {
		return "Usuarios [USU_ID=" + USU_ID + ", USU_NOMBRES=" + USU_NOMBRES + ", USU_DIRECCION=" + USU_DIRECCION
				+ ", USU_TELEFONO=" + USU_TELEFONO + ", USU_CORREO=" + USU_CORREO + ", USU_NUMDOCUMENTO="
				+ USU_NUMDOCUMENTO + ", USU_PASSWORD=" + USU_PASSWORD + ", USU_TDOC_ID=" + USU_TDOC_ID + ", USU_ROL_ID="
				+ USU_ROL_ID + "]";
	}
	
	
	
	
	
	
	

}
