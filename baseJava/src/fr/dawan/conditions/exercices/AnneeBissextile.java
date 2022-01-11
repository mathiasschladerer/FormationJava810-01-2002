package fr.dawan.conditions.exercices;

import java.util.Scanner;

public class AnneeBissextile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		
		//Fournir les données d'entrée
		System.out.print("Saisir une annéee: ");
		year = input.nextInt();
		
		/*
		 * Traitement et affichage
		 * 
		 * Si l'année est divisible par 4 et non divisible par 100 : 
		 * (year % 4 == 0 && year % 100 != 0))
		 * 
		 * Ou Si l'année est divisible par 400  :  (year % 400 == 0)
		 */
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " est une année bissextile");
		} else {
			System.out.println(year + " est une année simple");
		}
	}

}
