package com.ingenio.gestion_logistica.model;

public class Zonas {
	
	Integer ZON_ID;
	String ZON_NOMBRE;
	String ZON_DESCRIPCION;

	
	public Zonas() {
	}


	public Zonas(Integer zON_ID, String zON_NOMBRE, String zON_DESCRIPCION) {
		super();
		ZON_ID = zON_ID;
		ZON_NOMBRE = zON_NOMBRE;
		ZON_DESCRIPCION = zON_DESCRIPCION;
	}


	public Integer getZON_ID() {
		return ZON_ID;
	}


	public void setZON_ID(Integer zON_ID) {
		ZON_ID = zON_ID;
	}


	public String getZON_NOMBRE() {
		return ZON_NOMBRE;
	}


	public void setZON_NOMBRE(String zON_NOMBRE) {
		ZON_NOMBRE = zON_NOMBRE;
	}


	public String getZON_DESCRIPCION() {
		return ZON_DESCRIPCION;
	}


	public void setZON_DESCRIPCION(String zON_DESCRIPCION) {
		ZON_DESCRIPCION = zON_DESCRIPCION;
	}


	@Override
	public String toString() {
		return "Zonas [ZON_ID=" + ZON_ID + ", ZON_NOMBRE=" + ZON_NOMBRE + ", ZON_DESCRIPCION=" + ZON_DESCRIPCION + "]";
	}

	
	
	
}
