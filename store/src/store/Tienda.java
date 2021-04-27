package store;

import java.util.ArrayList;


public class Tienda {

	private String nombre;
	private ArrayList<Cliente> listaClientes;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
		this.listaClientes = new ArrayList<Cliente>();
	}
	
	public void inscribirCliente(Cliente cliente) {
		if(cliente.getEdad()<18) {
			System.out.println("Lo sentimos "+cliente.getNickName()+" No podemos registrar menores de edad");
		}else {
			cliente.setSuscripcion(true);
			listaClientes.add(cliente);
		}
		listaClientes.add(cliente);
	}
	
	public Cliente buscarClienteActivo(String email){
		for (Cliente cliente : this.listaClientes) {
			if(cliente.getEmail().equalsIgnoreCase(email)) {
				if(cliente.isSuscripcion()) {
					return cliente;
				}
			}
		}
		System.out.println("No se encontro ningun cliente activo con ese email");
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	
	
	
	
	
}
