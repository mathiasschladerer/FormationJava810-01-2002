package fr.dawan.tableaux.tableaux_statique.exercices;

import java.util.Scanner;

public class InsererNouvelElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] liste_notes;
		double note;  //note à inserer
		//pos : position d'insertion de la note 
		//N : Nombre de notes dans le tableau
		int N, pos;
		String result = "";
		
		/*
		 * BOUCLE d'INITIALISATION / INITIALISATION
		 * Initialiser un tableau revient à affecter une valeur initial 
		 * à chacun des cases. 
		 * Si le nombre des cases est connu à l'avance, l'initialisation 
		 * se sert de la boucle "FOR"
		 */
		//Saisir la taille actuelle du tableau
		System.out.print("Saisir le nombre de notes : ");
		N = input.nextInt();
		
		//Initialiser la taille du tableau contenant la liste des notes
		liste_notes = new double[N + 1];
		
		
		/*
		 * BOUCLE DE CHARGEMENT
		 * Le chargement lit une suite de valeurs et les ranges dans les 
		 * cases successives du tableau. 
		 * Le chargement se sert d'une boucle "FOR" quand le nombre de données
		 * est connu à l'avance, et d'une boucle TANT QUE s'il est inconnu
		 */
		//Saisir les notes dans le tableau
		for (int i = 0; i < N; i++) {
			System.out.print("Note " + (i + 1) + " : ");
			liste_notes[i] = input.nextDouble();
		}
		
		//Saisir une note et sa position d'insertion
		System.out.print("Note à inserer : ");
		note = input.nextDouble();
		System.out.print("Position : ");
		pos = input.nextInt();  //ex: pos = 3 (indice 2)
		int numCase = pos - 1; //numCase = indice
		
		//Si la position est non valide
		if(pos <=0 || pos > N+1) {
			System.out.println("Position invalide ! Veuillez saisir une position"
					+ " entre 1 et " + N);
		} else {   //Decalage des cases : On part de la fin pour remonter vers la position d'insertion (numCase)
			for (int i = N; i > numCase; i--) {
				liste_notes[i] = liste_notes[i-1];
			}
			//Inserer la note à la position donnée et incrementer N
			liste_notes[numCase] = note;
			N++;
		}
		
		
		/*
		 * BOUCLE D'AFFICHAGE: 
		 * La boucle d'affichage pour un tableau à une dimension est un simple boucle 
		 * "FOR" qui parcourt tous les cases contenant des données de 0 à N-1
		 */
		//Afficher le tableau après l'operation d'insertion
		result = "[";
		for (int i = 0; i < N - 1; i++) {
			result += liste_notes[i] + ", ";
		}
		 
		result += liste_notes[liste_notes.length - 1] + "]";
		
		System.out.println(result);
		
	}

}
