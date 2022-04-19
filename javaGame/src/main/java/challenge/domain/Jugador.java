package challenge.domain;

public class Jugador {
	
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	
	public Jugador(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public Jugador(Long id, String nombre, String apellido, String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
	}
	
}
