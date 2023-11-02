package ma.ecole.isic.entities;

import jakarta.persistence.Entity;

@Entity
public class Etudiant extends User {
	
	private String cne;

	
	
	public Etudiant() {
		super();
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}
	
	

}
