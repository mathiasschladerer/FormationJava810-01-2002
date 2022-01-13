package fr.dawan.heritage.mot_cle_super;


public abstract class Forme {
	
public int prop1 = 5;
public String chaine;
	
	public Forme() {
		System.out.println("Je suis un contructeur de la classe Forme");
	}
	
	public Forme(String chaine) {
		this.chaine = chaine;
		System.out.println(this.chaine);
	}
	

	public abstract double aire();
	
	public String decrisToi() {
		return "Je suis la methode decrisToi de la  classe abstraite Forme";
	}
	
}
