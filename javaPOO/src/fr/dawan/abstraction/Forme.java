package fr.dawan.abstraction;

/*
 * Nous allons voir l'abstraction et la redefinition des m�thodes avec la 
 * notion d'h�ritage
 */
public abstract class Forme {
	
	protected int cote = 4;
	
	public Forme() {
		
	}
	
	/*
	 * Une m�thode abstraite est une m�thode, dont il faudra redefinir le contenu 
	 * niveau des sous-classes (classes filles)
	 * la methode aire �tant abstraite, cela veut dire que tous les classes
	 * filles seront oblig�es d'avoir une m�thode aire
	 */
	public abstract double aire();
	
	public String decrisToi() {
		return "Je suis la classe abstraite Forme";
	}
	
}
