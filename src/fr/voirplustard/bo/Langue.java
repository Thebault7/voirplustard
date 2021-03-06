package fr.voirplustard.bo;

import java.io.Serializable;

public class Langue implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idLangue;
	private String langue;
	private String description;
	
	
	public Langue() {
		super();
	}
	
	public Langue(String langue) {
		super();
		this.langue = langue;
	}

	public Langue(int idLangue, String langue) {
		super();
		this.idLangue = idLangue;
		this.langue = langue;
	}

	public Langue(int idLangue, String langue, String description) {
		super();
		this.idLangue = idLangue;
		this.langue = langue;
		this.description = description;
	}


	public int getIdLangue() {
		return idLangue;
	}


	public void setIdLangue(int idLangue) {
		this.idLangue = idLangue;
	}


	public String getLangue() {
		return langue;
	}


	public void setLangue(String langue) {
		this.langue = langue;
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Langue [idLangue=" + idLangue + ", langue=" + langue + ", description=" + description + "]";
	}
}
