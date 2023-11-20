package com.ingenio.gestion_logistica.interfaces;

import java.util.List;

import com.ingenio.gestion_logistica.model.Puerto;


public interface PuertoInterface {

	List<Puerto> devolverListaPuerto() throws Exception;

	List<Puerto> devolverPuertoById(int id)  throws Exception;

	Puerto buscarTipoPuertoPorDato(Puerto datos)  throws Exception;
	 
	String agregarTipoPuerto(Puerto datos)  throws Exception;

	String actualizarPuerto(Puerto datos)  throws Exception;

	String eliminarPuerto(int id)  throws Exception;

}
