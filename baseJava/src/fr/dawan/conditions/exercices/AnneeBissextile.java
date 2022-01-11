package fr.dawan.conditions.exercices;

import java.util.Scanner;

public class AnneeBissextile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		
		//Fournir les donn�es d'entr�e
		System.out.print("Saisir une ann�ee: ");
		year = input.nextInt();
		
		/*
		 * Traitement et affichage
		 * 
		 * Si l'ann�e est divisible par 4 et non divisible par 100 : 
		 * (year % 4 == 0 && year % 100 != 0))
		 * 
		 * Ou Si l'ann�e est divisible par 400  :  (year % 400 == 0)
		 */
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " est une ann�e bissextile");
		} else {
			System.out.println(year + " est une ann�e simple");
		}
	}

}
