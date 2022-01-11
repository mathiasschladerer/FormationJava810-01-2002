package fr.dawan.tableaux;

public class TableauxMultidimensionnelsDeclarationEtInitialisation {

	public static void main(String[] args) {

		/*
		 * joueur1 : [10, 20, 30]   ------  ligne1  (indice 0)
		 * joueur2 : [80, 40, 90]   ------  ligne2  (indice 1)
		 * joueur3 : [26, 58, 14]   ------  ligne3   (indice 2)
		 */
		int[] score = {10, 20, 30};

		//Création d'un tableau à deux dimension 
		int[][] scores1 = new int[2][3];

		int[][] scores2 = {{5, 25, 72, 16, 98},{90, 7, 30, 67}};
		
		System.out.println(scores2[0][1]);  //25
		System.out.println(scores2[1][3]);  

	}

}
