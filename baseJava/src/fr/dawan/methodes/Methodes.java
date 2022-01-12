package fr.dawan.methodes;

/*
 * Methode :  un ensemble d'instruction réutilisables - eviter de repeter du code
 * Déclarer un méthode : 
 * 		Visibilité[mot-clé] type-retour nom-methode(param) {instructions} 
 */
public class Methodes {

	public static void main(String[] args) {
		int[] tab = {14, 12, 8, 18};
		
		afficher();
		afficher(tab);
		
		int res = somme(2, 50);
		System.out.println("res = " + res);
		
		System.out.println("resTab  = " + somme(tab));
	}
	
	/**
	 * Methode afficher 
	 * void ==> SI aucune valeur n'est retournée, renvoyée; 
	 * on utilise le pseudo-type void
	 */
	public static void afficher() {
		System.out.println("Methode afficher");
	}
	
	/**
	 * Affiche les élément d'un tableau
	 * @param tab
	 */
	public static void afficher(int[] tab) {
		for(int item: tab) {
			System.out.println(item);
		}
	}
	
	/**
	 * Methode prend deux paramètre entier et retourne un entier
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static int somme(int val1, int val2) {
		int somme = 0;
		somme = val1 + val2;
		return  somme;
	}
	
	public static int somme(int[] tab1) {
		int somme = 0;
		for (int item : tab1) {
			somme += item;
		}
		return somme;
	}

}
