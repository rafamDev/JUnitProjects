package testStore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import store.Cliente;
import store.Tienda;


 public class ClienteTest {

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
		 Assert.assertEquals("mayo",this.cliente.getNickName());
		 Assert.assertEquals("rafamayo@gmail.com",this.cliente.getEmail());
		 Assert.assertEquals(18,this.cliente.getEdad());
		 Assert.assertEquals(685343434,this.cliente.getTelefono());
      }
		
	  //COMPROBAR GUETERS y SETTERS 
	  @Test
	  public void testGuettrsSetters() throws Exception{
		 this.cliente.setNickName("Pepe");
		 Assert.assertEquals("Pepe",this.cliente.getNickName());
		 this.cliente.setEmail("pepeMayo@gmail.com");
		 Assert.assertEquals("pepeMayo@gmail.com",this.cliente.getEmail());
		 this.cliente.setEdad(20);
		 Assert.assertEquals(20,this.cliente.getEdad());
		 this.cliente.setTelefono(676444234);
		 Assert.assertEquals(676444234,this.cliente.getTelefono());
      }
	  
	  //COMPROBAR QUE NUESTRO TOSTRING CONTIENE EL EMAIL DEL CLIENTE
	  @Test
	  public void testEmail() throws Exception{
		 this.tienda.inscribirCliente(this.cliente);
		 this.tienda.buscarClienteActivo(this.cliente.getEmail());
		 Assert.assertTrue(this.cliente.isSuscripcion());
	  }
	  
	  //COMPROBAR QUE EL CLIENTE SE INSCRIBE PERFECTAMENTE
	  @Test
	  public void testInscripcion() throws Exception{
        this.tienda.inscribirCliente(this.cliente);
		Assert.assertTrue(this.cliente.isSuscripcion());
       }
		
	  //COMPROBAR QUE EL CLIENTE SE BORRA PERFECTAMENTE
	  @Test
	  public void testBorrarCliente() throws Exception{
		 this.tienda.inscribirCliente(this.cliente);
		 this.cliente.setSuscripcion(false);
		 Assert.assertFalse(this.cliente.isSuscripcion());
      }

 }
