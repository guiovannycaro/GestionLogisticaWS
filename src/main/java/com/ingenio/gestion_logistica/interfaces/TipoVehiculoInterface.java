package com.ingenio.gestion_logistica.interfaces;

import java.util.List;



import com.ingenio.gestion_logistica.model.TipoVehiculo;

public interface TipoVehiculoInterface {

	List<TipoVehiculo> devolverListaTipoVehiculo() throws Exception;

	List<TipoVehiculo> devolverTipoVehiculoById(int id)  throws Exception;

	TipoVehiculo buscarTipoVehiculoPorDato(TipoVehiculo datos)  throws Exception;
	 
	String agregarTipoVehiculo(TipoVehiculo datos)  throws Exception;

	String actualizarTipoVehiculo(TipoVehiculo datos)  throws Exception;

	String eliminarTipoVehiculo(int id)  throws Exception;

}
