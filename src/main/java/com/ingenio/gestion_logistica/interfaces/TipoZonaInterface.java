package com.ingenio.gestion_logistica.interfaces;

import java.util.List;
import com.ingenio.gestion_logistica.model.Zonas;

public interface TipoZonaInterface {

	List<Zonas> devolverListaZonas() throws Exception;

	List<Zonas> devolverZonasById(int id)  throws Exception;

	Zonas buscarZonasPorDato(Zonas datos)  throws Exception;
	 
	String agregarZonas(Zonas datos)  throws Exception;

	String actualizarZonas(Zonas datos)  throws Exception;

	String eliminarZonas(int id)  throws Exception;

}
