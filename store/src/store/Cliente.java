package store;

public class Cliente {

	private String nickName;
	private String email;
	private int telefono;
	private boolean suscripcion;
	private int edad;
	
	public Cliente(String nickName, String email, int telefono, int edad) {
		super();
		this.nickName = nickName;
		this.email = email;
		this.telefono = telefono;
		this.suscripcion = false;
		this.edad = edad;
	}

	public void registrarEnTienda(Tienda tienda) {
		tienda.inscribirCliente(this);
	}
	
	public void borrarRegistroDeTienda(){
		this.setSuscripcion(suscripcion);
		
	}
	
	//PARA QUE NOS DE LOS DATOS DEL CLIENTE Y NO LA DIRECCION DE MEMORIA
	@Override
	public String toString() {
		return "Cliente [nickName=" + nickName + ", email=" + email + ", telefono=" + telefono + ", suscripcion="
				+ suscripcion + ", edad=" + edad + "]";
	}

	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public boolean isSuscripcion() {
		return suscripcion;
	}
	
	public void setSuscripcion(boolean suscripcion) {
		this.suscripcion = suscripcion;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
