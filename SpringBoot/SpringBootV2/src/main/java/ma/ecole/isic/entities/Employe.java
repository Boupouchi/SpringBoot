package ma.ecole.isic.entities;

import jakarta.persistence.Entity;

@Entity
public class Employe extends User {
	
	private double salaire;

	public Employe() {
		super();
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	

}
