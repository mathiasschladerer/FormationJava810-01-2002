package fr.dawan;

import java.io.Serializable;

/*
 * implements Serializable veut dire que les objets de cette classe 
 * peuvent être sérialisée. 
 */
public class Adresse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String voie;
	private String ville;
	
	//transient : cela veut dire que cette variable sera ignorée 
	//lors de la serialisation
	private transient int codePostal;

	public Adresse() {
		super();
	}
	
	public Adresse(int codePostal) {
		super();
		this.codePostal = codePostal;
	}

	public Adresse(String voie, String ville, int codePostal) {
		super();
		this.voie = voie;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	@Override
	public String toString() {
		return "Adresse [voie=" + voie + ", ville=" + ville + ", codePostal=" + codePostal + "]";
	}
	
	
}
