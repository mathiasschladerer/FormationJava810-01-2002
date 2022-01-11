package fr.dawan.conditions;

import java.util.Scanner;

public class OperateursLogiques {

	public static void main(String[] args) {
		Scanner clavier = new Scanner (System.in);
		
		//Test les operateurs ET(&&) et OU(||)
		int a, b, c;
		int nbre = 0;  //Pour tester l'operateur non (!)
		
		//Fournir les données d'entrée
		System.out.print("Entrer la valeur a : ");
		a = clavier.nextInt();	
		System.out.print("Entrer la valeur b : ");
		b = clavier.nextInt();	
		System.out.print("Entrer la valeur c : ");
		c = clavier.nextInt();	
		
		//Test OU (||)
		//5, 5, 3
		if(a == b || b == c) {
			System.out.println("Deux valeurs sont au moins identique");
		}
		
		//Test ET 
		//5, 8, 8
		if(a == b && b == c) {
			System.out.println("Les trois valeurs sont identiques");
		}
		
		//Opérateur Non (!)
		System.out.println("\nTest de l'operateur NON \"!\"");
		System.out.print("Entrer un nombre : ");
		nbre = clavier.nextInt();
		
		if(nbre > 0) {
			System.out.println("Le nombre rentré est positif");
		}
		
		//Avec l'operateur logique non 
		//FAUX  ==>  !FAUX = VRAIE
		if(!(nbre > 0)) {
			System.out.println("Le nombre rentré est negatif ou egale à zero");
		}
	}

}
