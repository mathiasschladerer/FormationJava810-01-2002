package fr.dawan.syntaxe_de_base.exercices;

import java.util.Scanner;

public class Exo1_PermutDeuxVariables {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nbre1, nbre2, temp;
		
		//Fournir les données d'entrée
		System.out.print("Entrer le premier nombre :");
		nbre1 = input.nextInt();
		System.out.print("Entrer le deuxième nombre :");
		nbre2 = input.nextInt();
		System.out.println("Avant l'échange : " + "nbre1 = " + nbre1 + ", nbre2 = " + nbre2);
		
		//Traitement
		temp = nbre1;
		nbre1 = nbre2;
		nbre2 = temp;
		System.out.println("Après l'échange : " + "nbre1 = " + nbre1 + ", nbre2 = " + nbre2);
		
		input.close();
		
	}

}
