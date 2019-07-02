package fr.diginamic.composite;

public class Employe implements IElement {

	private double salaire;
	private String nom;
	private String prenom;

	public Employe(double salaire, String nom, String prenom) {
		super();
		this.salaire = salaire;
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Employe [salaire=" + salaire + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salaire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (Double.doubleToLongBits(salaire) != Double.doubleToLongBits(other.salaire))
			return false;
		return true;
	}

	/**
	 * Getter
	 * 
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * Setter
	 * 
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double calculerSalaire() {
		return this.salaire;
	}

}
