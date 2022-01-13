package fr.dawan.object;

public class CompteBancaire {
	
	private String nomPropritaire;
	private String numeroCompte;
	private double solde;
	
	public CompteBancaire() {
		super();
	}

	public CompteBancaire(String nomPropritaire, String numeroCompte, double solde) {
		super();
		this.nomPropritaire = nomPropritaire;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	public String getNomPropritaire() {
		return nomPropritaire;
	}

	public void setNomPropritaire(String nomPropritaire) {
		this.nomPropritaire = nomPropritaire;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte bancaire de " + this.nomPropritaire + "." + 
				"\nSolde actuel : " + this.solde + "€";
	}

	/*
	 * Si deux objets sont egaux alors ils ont le même hascode 
	 * Le hashcode doit se calculer sur les mêmes attributs comparé avec 
	 * la methode equals
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomPropritaire == null) ? 0 : nomPropritaire.hashCode());
		result = prime * result + ((numeroCompte == null) ? 0 : numeroCompte.hashCode());
		long temp;
		temp = Double.doubleToLongBits(solde);
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
		CompteBancaire other = (CompteBancaire) obj;
		if (nomPropritaire == null) {
			if (other.nomPropritaire != null)
				return false;
		} else if (!nomPropritaire.equals(other.nomPropritaire))
			return false;
		if (numeroCompte == null) {
			if (other.numeroCompte != null)
				return false;
		} else if (!numeroCompte.equals(other.numeroCompte))
			return false;
		if (Double.doubleToLongBits(solde) != Double.doubleToLongBits(other.solde))
			return false;
		return true;
	}
	
	
	
	
}
