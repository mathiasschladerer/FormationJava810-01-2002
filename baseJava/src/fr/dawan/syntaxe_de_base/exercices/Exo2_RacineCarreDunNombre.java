package fr.dawan.syntaxe_de_base.exercices;

import java.util.Scanner;

public class Exo2_RacineCarreDunNombre {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int nbre;
		
		//Fournir les donn�es d'entr�e
		System.out.print("Veuillez saisir un nombre entier : ");
		nbre = input.nextInt();
		
		//Traitement
		System.out.println("La racine carr� de " + nbre + " est �gal � " + Math.sqrt(nbre));
		
		input.close();
	}

}
