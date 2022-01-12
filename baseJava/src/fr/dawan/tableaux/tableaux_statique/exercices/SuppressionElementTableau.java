package fr.dawan.tableaux.tableaux_statique.exercices;

import java.util.Iterator;
import java.util.Scanner;

public class SuppressionElementTableau {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int pos;
		int N;
		String result = "";
		
		/*
		 * Boucle d'initialisation/initialisation
		 */
		System.out.print("Saisir le nombre note : ");
		N = input.nextInt();
		double[] liste_note = new double[N];
		
		
		/*
		 * Boucle de chargement
		 */
		for (int i = 0; i < N; i++) {
			System.out.printf("Note %d : ", i+1);
			liste_note[i] = input.nextDouble();
		}
		
		//Position de l'élément à supprimer
		System.out.print("Position de la note à supprimer : ");
		pos = input.nextInt();
		
		if(pos <= 0 || pos > N) {
			System.out.println("Position invalide ! Veuillez saisir une position"
					+ " entre 1 et " + N);
		} else {
			int numCase = pos - 1;  //indice
			for (int i = numCase; i < N - 1; i++) {
				liste_note[i] = liste_note[i+1];
			}
			// on initialise à zero le dernier élement du tableau
			liste_note[liste_note.length - 1] = 0.0;  
			//Decrementer N par 1
			N--;
		}
		
		/*
		 * Boucle d'affichage
		 */
		result = "[";
		for (int i = 0; i < N; i++) {
			result += liste_note[i];
			result += (i < N-1) ? "," : "]";
		}
		
		System.out.println(result);

	}

}
