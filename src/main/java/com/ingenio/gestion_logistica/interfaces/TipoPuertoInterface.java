package com.ingenio.gestion_logistica.interfaces;

import java.util.List;


import com.ingenio.gestion_logistica.model.TipoPuerto;

public interface TipoPuertoInterface {

	List<TipoPuerto> devolverListaTipoPuerto() throws Exception;

	List<TipoPuerto> devolverTipoPuertoById(int id)  throws Exception;

	TipoPuerto buscarTipoPuertoPorDato(TipoPuerto datos)  throws Exception;
	 
	String agregarTipoPuerto(TipoPuerto datos)  throws Exception;

	String actualizarTipoPuerto(TipoPuerto datos)  throws Exception;

	String eliminarTipoPuerto(int id)  throws Exception;

}
