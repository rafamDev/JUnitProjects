package testStore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import store.Cliente;
import store.Tienda;

public class TiendaTest {

	private Cliente cliente;
	private Tienda tienda;
		
	  //COMPROBAR QUE SE INSTANCIEN BIEN LOS OBJETOS
	  @Before
	  public void setUpInstancia() throws Exception{
         this.cliente = new Cliente("mayo","rafamayo@gmail.com",685343434,18);
         this.tienda = new Tienda("ZARA");
	  }

	  //COMPROBAR CONSTRUCTOR
	  @Test
	  public void testConstrucutorOK() throws Exception{
		 Assert.assertEquals("ZARA",this.tienda.getNombre());
		 
      }
		
	  //COMPROBAR GUETERS y SETTERS 
	  @Test
	  public void testGuettrsSetters() throws Exception{
		 this.tienda.setNombre("MANGO");
		 Assert.assertEquals("MANGO",this.tienda.getNombre());
	  }

	  //COMPROBAR QUE SE ESCRIBE EL CLIENTE
			// --> YA SE COMPRUEBA EL GETTER ISSUBSCRIPCION
			// --> YA SE COMPRUEBA QUE SE FILTRE BIEN POR EDAD
	  @Test
	  public void testInscripcion() throws Exception{
        this.tienda.inscribirCliente(this.cliente);
		Assert.assertTrue(this.cliente.isSuscripcion());
       }

	  //EN BUSCAR CLIENTE
		// --> EL GETTER DEL EMAIL
		  // --> SE DEVUELVA UN CLIENTE EN CASO DE EXITO
			// --> SE DEVULCE UN NULL EN CASO DE FRACASO
	  @Test
	  public void testBuscarCliente() throws Exception{
		 this.tienda.inscribirCliente(this.cliente);
		 this.tienda.buscarClienteActivo(this.cliente.getEmail());
		 Assert.assertNotNull(this.cliente);
	  }
	
}