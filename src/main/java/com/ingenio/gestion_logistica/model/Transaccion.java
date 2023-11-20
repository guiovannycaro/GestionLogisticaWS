package com.ingenio.gestion_logistica.model;

import java.util.Date;

public class Transaccion {

	Integer ENV_ID;
	
	Integer ENV_CLIE_ID;
	
	String ENV_TELEFONO;
	
	Date ENV_FECHA_ENVIO;
	
	Integer ENV_BOD_ID;
	
	Integer ENV_PUER_ID;
	Integer ENV_TRAS_ID;
	
	Date ENV_FECHA_ENTREGA;
	
	Integer ENV_CIU_ID;
	
	Integer ENVD_ID;

	Integer  ENVD_PROD_ID;

	 double ENVD_CANTIDAD;
	 
	 double ENVD_PRECIO;
	 
	 double ENVD_SUBTOTAL;
	 
	 double ENVD_IVA;
	 
	 double ENVD_TOTAL;
	 
	 double ENVD_DESCUENTO;
	 
	 Integer  ENVD_ENV_ID;
	 
		public Transaccion() {
		}

		public Transaccion(Integer eNV_ID, Integer eNV_CLIE_ID, String eNV_TELEFONO, Date eNV_FECHA_ENVIO,
				Integer eNV_BOD_ID, Integer eNV_PUER_ID, Integer eNV_TRAS_ID, Date eNV_FECHA_ENTREGA,
				Integer eNV_CIU_ID, Integer eNVD_ID, Integer eNVD_PROD_ID, double eNVD_CANTIDAD, double eNVD_PRECIO,
				double eNVD_SUBTOTAL, double eNVD_IVA, double eNVD_TOTAL, double eNVD_DESCUENTO, Integer eNVD_ENV_ID) {
			ENV_ID = eNV_ID;
			ENV_CLIE_ID = eNV_CLIE_ID;
			ENV_TELEFONO = eNV_TELEFONO;
			ENV_FECHA_ENVIO = eNV_FECHA_ENVIO;
			ENV_BOD_ID = eNV_BOD_ID;
			ENV_PUER_ID = eNV_PUER_ID;
			ENV_TRAS_ID = eNV_TRAS_ID;
			ENV_FECHA_ENTREGA = eNV_FECHA_ENTREGA;
			ENV_CIU_ID = eNV_CIU_ID;
			ENVD_ID = eNVD_ID;
			ENVD_PROD_ID = eNVD_PROD_ID;
			ENVD_CANTIDAD = eNVD_CANTIDAD;
			ENVD_PRECIO = eNVD_PRECIO;
			ENVD_SUBTOTAL = eNVD_SUBTOTAL;
			ENVD_IVA = eNVD_IVA;
			ENVD_TOTAL = eNVD_TOTAL;
			ENVD_DESCUENTO = eNVD_DESCUENTO;
			ENVD_ENV_ID = eNVD_ENV_ID;
		}




		public Integer getENV_ID() {
			return ENV_ID;
		}

		public void setENV_ID(Integer eNV_ID) {
			ENV_ID = eNV_ID;
		}

		public Integer getENV_CLIE_ID() {
			return ENV_CLIE_ID;
		}

		public void setENV_CLIE_ID(Integer eNV_CLIE_ID) {
			ENV_CLIE_ID = eNV_CLIE_ID;
		}

		public String getENV_TELEFONO() {
			return ENV_TELEFONO;
		}

		public void setENV_TELEFONO(String eNV_TELEFONO) {
			ENV_TELEFONO = eNV_TELEFONO;
		}

		public Date getENV_FECHA_ENVIO() {
			return ENV_FECHA_ENVIO;
		}

		public void setENV_FECHA_ENVIO(Date eNV_FECHA_ENVIO) {
			ENV_FECHA_ENVIO = eNV_FECHA_ENVIO;
		}

		public Integer getENV_BOD_ID() {
			return ENV_BOD_ID;
		}

		public void setENV_BOD_ID(Integer eNV_BOD_ID) {
			ENV_BOD_ID = eNV_BOD_ID;
		}

		public Integer getENV_PUER_ID() {
			return ENV_PUER_ID;
		}

		public void setENV_PUER_ID(Integer eNV_PUER_ID) {
			ENV_PUER_ID = eNV_PUER_ID;
		}

		public Integer getENV_TRAS_ID() {
			return ENV_TRAS_ID;
		}

		public void setENV_TRAS_ID(Integer eNV_TRAS_ID) {
			ENV_TRAS_ID = eNV_TRAS_ID;
		}

		public Date getENV_FECHA_ENTREGA() {
			return ENV_FECHA_ENTREGA;
		}

		public void setENV_FECHA_ENTREGA(Date eNV_FECHA_ENTREGA) {
			ENV_FECHA_ENTREGA = eNV_FECHA_ENTREGA;
		}

		public Integer getENV_CIU_ID() {
			return ENV_CIU_ID;
		}

		public void setENV_CIU_ID(Integer eNV_CIU_ID) {
			ENV_CIU_ID = eNV_CIU_ID;
		}

		public Integer getENVD_ID() {
			return ENVD_ID;
		}

		public void setENVD_ID(Integer eNVD_ID) {
			ENVD_ID = eNVD_ID;
		}

		public Integer getENVD_PROD_ID() {
			return ENVD_PROD_ID;
		}

		public void setENVD_PROD_ID(Integer eNVD_PROD_ID) {
			ENVD_PROD_ID = eNVD_PROD_ID;
		}

		public double getENVD_CANTIDAD() {
			return ENVD_CANTIDAD;
		}

		public void setENVD_CANTIDAD(double eNVD_CANTIDAD) {
			ENVD_CANTIDAD = eNVD_CANTIDAD;
		}

		public double getENVD_PRECIO() {
			return ENVD_PRECIO;
		}

		public void setENVD_PRECIO(double eNVD_PRECIO) {
			ENVD_PRECIO = eNVD_PRECIO;
		}

		public double getENVD_SUBTOTAL() {
			return ENVD_SUBTOTAL;
		}

		public void setENVD_SUBTOTAL(double eNVD_SUBTOTAL) {
			ENVD_SUBTOTAL = eNVD_SUBTOTAL;
		}

		public double getENVD_IVA() {
			return ENVD_IVA;
		}

		public void setENVD_IVA(double eNVD_IVA) {
			ENVD_IVA = eNVD_IVA;
		}

		public double getENVD_TOTAL() {
			return ENVD_TOTAL;
		}

		public void setENVD_TOTAL(double eNVD_TOTAL) {
			ENVD_TOTAL = eNVD_TOTAL;
		}

		public double getENVD_DESCUENTO() {
			return ENVD_DESCUENTO;
		}

		public void setENVD_DESCUENTO(double eNVD_DESCUENTO) {
			ENVD_DESCUENTO = eNVD_DESCUENTO;
		}

		public Integer getENVD_ENV_ID() {
			return ENVD_ENV_ID;
		}

		public void setENVD_ENV_ID(Integer eNVD_ENV_ID) {
			ENVD_ENV_ID = eNVD_ENV_ID;
		}

		@Override
		public String toString() {
			return "Transaccion [ENV_ID=" + ENV_ID + ", ENV_CLIE_ID=" + ENV_CLIE_ID + ", ENV_TELEFONO=" + ENV_TELEFONO
					+ ", ENV_FECHA_ENVIO=" + ENV_FECHA_ENVIO + ", ENV_BOD_ID=" + ENV_BOD_ID + ", ENV_PUER_ID="
					+ ENV_PUER_ID + ", ENV_TRAS_ID=" + ENV_TRAS_ID + ", ENV_FECHA_ENTREGA=" + ENV_FECHA_ENTREGA
					+ ", ENV_CIU_ID=" + ENV_CIU_ID + ", ENVD_ID=" + ENVD_ID + ", ENVD_PROD_ID=" + ENVD_PROD_ID
					+ ", ENVD_CANTIDAD=" + ENVD_CANTIDAD + ", ENVD_PRECIO=" + ENVD_PRECIO + ", ENVD_SUBTOTAL="
					+ ENVD_SUBTOTAL + ", ENVD_IVA=" + ENVD_IVA + ", ENVD_TOTAL=" + ENVD_TOTAL + ", ENVD_DESCUENTO="
					+ ENVD_DESCUENTO + ", ENVD_ENV_ID=" + ENVD_ENV_ID + "]";
		}
		 
	
	 
}
