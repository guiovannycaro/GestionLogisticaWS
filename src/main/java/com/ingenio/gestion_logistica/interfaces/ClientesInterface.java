package com.ingenio.gestion_logistica.interfaces;

import java.util.List;

import com.ingenio.gestion_logistica.model.Clientes;

public interface ClientesInterface {

	List<Clientes> devolverListaClientes() throws Exception;

	List<Clientes> devolverClienteById(int id)  throws Exception;

	Clientes buscarClientePorDato(Clientes datos)  throws Exception;
	 
	String agregarCliente(Clientes clientes)  throws Exception;

	String actualizarCliente(Clientes clientes)  throws Exception;

	String eliminarCliente(int id)  throws Exception;

}
