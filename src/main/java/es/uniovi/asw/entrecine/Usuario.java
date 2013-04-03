package es.uniovi.asw.entrecine;

public class Usuario {

	
	private String nombre;
	private String apellidos;
	private String dni;
	private Long tarjetaCredito;
	private String idUsuario;
	private String password;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Long getTarjetaCredito() {
		return tarjetaCredito;
	}
	public void setTarjetaCredito(Long tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Usuario(String nombre, String apellidos, String dni,
			Long tarjetaCredito, String idUsuario, String password) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.tarjetaCredito = tarjetaCredito;
		this.idUsuario = idUsuario;
		this.password = password;
	}
	
	
}
