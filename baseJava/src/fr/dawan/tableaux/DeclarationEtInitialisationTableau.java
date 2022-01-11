package fr.dawan.tableaux;

public class DeclarationEtInitialisationTableau {

	public static void main(String[] args) {
		
		/*
		 * Declaration et initialisation : Methode 1 
		 * Si on connait les differents éléments du tableau 
		 */
		int[] tab1;  //declaration du tableau
		int[] tab2 = {12, 38, 4, 98, 78};   //Déclaration et initialisation
		
		//tab2 contient l'adresse du tableau
		System.out.println(tab2);
		System.out.println(tab2[0]);  //12
		System.out.println(tab2[0] + tab2[1]);  //50
		
		System.out.println();
		
		/*
		 * Declaration tableau: Methode 2
		 */
		int[] tab = new int[4];
		System.out.println(tab[2]);
		tab[0] = 30;
		tab[1] = 3;
		System.out.println(tab[0] + tab[2]);  //30
		
	}

}
