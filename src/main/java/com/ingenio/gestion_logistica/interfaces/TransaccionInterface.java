package com.ingenio.gestion_logistica.interfaces;

import java.util.List;

import com.ingenio.gestion_logistica.model.Envio;
import com.ingenio.gestion_logistica.model.Transaccion;


public interface TransaccionInterface {

	List<Transaccion> devolverListaEnvio() throws Exception;

	List<Transaccion> devolverEnvioById(int id)  throws Exception;

	Transaccion buscarEnvioPorDato(Transaccion datos)  throws Exception;
	 
	String agregarTransaccion(Envio datos)  throws Exception;

	

}
