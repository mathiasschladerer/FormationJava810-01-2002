package fr.dawan.tableaux;

public class IterationTableau {

	public static void main(String[] args) {
		
		int[]  tab = {200, 330, 50};
		double[] tab2 = {25.0, 6.54, 100.01, 91};
		
		/*
		 * Methode : Boucle for classique 
		 */
		for(int i = 0; i < 3; i++) {
			System.out.println("Element � la position " + i + " : " + tab[i]);
		}
		
		//Taille tableau
		System.out.println("\nTaille du tableau : " + tab.length + "\n");
		for(int i = 0; i < tab.length; i++) {
			System.out.println("Element � la position " + i + " : " + tab[i]);
		}
		
		/*
		 * Methode 2 : Boucle foreach
		 * iteration sur un ensemble de valeur
		 * 
		 * Pour chaque element au niveau de mon tableau (tab2), j'affiche 
		 * l'�l�ment
		 */
		System.out.println("\nBoucle foreach : Iteration sur un ensemble de valeur");
		for(double element: tab) {
			System.out.println(element);
		}
	}

}
