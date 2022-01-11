package fr.dawan.conditions;

import java.util.Scanner;

public class BlocIfElse {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		int nbre = 0;
		
		/*
		 * Expression d'un test conditionnel 
		 * Si (condition est vraie)
		 * 		instructions
		 * Sinon 
		 * 	   d'autres instructions
		 * 	
		 * Le bloc IF (quand la condition est vraie)
		 * Le bloc ELSE (tous les autres cas : quand la condition est fausse
		 * Le bloc ELSE-IF (Traite un cas (ex 
		 */
		
		System.out.print("Entrer un nombre svp  : ");
		nbre = clavier.nextInt();
		
		if(nbre > 0) {
			System.out.println("Le nombre est positif");
		} else if(nbre == 0) {
			System.out.println("Le nombre est à zero");
		} else if(nbre* nbre == 25) {
			System.out.println("Le nombre rentré est egale à " + nbre);
		} else {
			System.out.println("Le nombre rentré est négatif");
		}
		
		/* Opérateurs de comparaisons : 
		 * Pour vérifier les conditions, java propose plusieurs opérateurs de comparaison, 
		 * > Permet de verifier si un nombre est superieur  à un autre nombre 
		 * < Pour verifier si un nombre est inferieur à zero
		 * == Pour verifier l'egalite entre deux nombres 
		 * != (different)  pour verifier si un nombre est different d'un autre nombre 
		 *  <= pour verifier si un nombre est inferieur ou egal à un autre nombre
		 *  >= pour verifier si un nombre est superieur à un autre nombre
		 */
		
	}

}
