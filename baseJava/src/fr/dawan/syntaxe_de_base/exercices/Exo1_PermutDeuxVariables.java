package fr.dawan.syntaxe_de_base.exercices;

import java.util.Scanner;

public class Exo1_PermutDeuxVariables {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nbre1, nbre2, temp;
		
		//Fournir les donn�es d'entr�e
		System.out.print("Entrer le premier nombre :");
		nbre1 = input.nextInt();
		System.out.print("Entrer le deuxi�me nombre :");
		nbre2 = input.nextInt();
		System.out.println("Avant l'�change : " + "nbre1 = " + nbre1 + ", nbre2 = " + nbre2);
		
		//Traitement
		temp = nbre1;
		nbre1 = nbre2;
		nbre2 = temp;
		System.out.println("Apr�s l'�change : " + "nbre1 = " + nbre1 + ", nbre2 = " + nbre2);
		
		input.close();
		
	}

}
