package fr.dawan.abstraction;

/*
 * Nous allons voir l'abstraction et la redefinition des méthodes avec la 
 * notion d'héritage
 */
public abstract class Forme {
	
	protected int cote = 4;
	
	public Forme() {
		
	}
	
	/*
	 * Une méthode abstraite est une méthode, dont il faudra redefinir le contenu 
	 * niveau des sous-classes (classes filles)
	 * la methode aire étant abstraite, cela veut dire que tous les classes
	 * filles seront obligées d'avoir une méthode aire
	 */
	public abstract double aire();
	
	public String decrisToi() {
		return "Je suis la classe abstraite Forme";
	}
	
}
