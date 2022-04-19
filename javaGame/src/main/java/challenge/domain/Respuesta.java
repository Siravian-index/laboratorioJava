package challenge.domain;

public class Respuesta {
	
	private Long id;
	private String respuesta;
	private Boolean correcta;
	private Long preguntaId;
	
	public Respuesta(Long id, String respuesta, Boolean correcta, Long preguntaId) {
		this.id = id;
		this.respuesta = respuesta;
		this.correcta = correcta;
		this.preguntaId = preguntaId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public Boolean getCorrecta() {
		return correcta;
	}

	@Override
	public String toString() {
		return "Respuesta [id=" + id + ", respuesta=" + respuesta + ", correcta=" + correcta + ", preguntaId="
				+ preguntaId + "]";
	}
	
}
