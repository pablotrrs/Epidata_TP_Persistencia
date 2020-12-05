package edu.epidata.dto;

public class Reporte1DTO {
	private int personaId;
	private long cant;

	public Reporte1DTO(int personaId, long cant) {
		super();
		this.personaId = personaId;
		this.cant = cant;
	}

//Getters y Setters
	@Override
	public String toString() {
		return "Reporte1DTO [personaId=" + personaId + ", cant=" + cant + "]";
	}

	public int getPersonaId() {
		return personaId;
	}

	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}

	public long getCant() {
		return cant;
	}

	public void setCant(long cant) {
		this.cant = cant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cant ^ (cant >>> 32));
		result = prime * result + personaId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Reporte1DTO))
			return false;
		Reporte1DTO other = (Reporte1DTO) obj;
		if (cant != other.cant)
			return false;
		if (personaId != other.personaId)
			return false;
		return true;
	}
}
