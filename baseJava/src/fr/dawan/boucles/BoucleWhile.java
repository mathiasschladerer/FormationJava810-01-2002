package fr.dawan.boucles;

import java.util.Scanner;

public class BoucleWhile {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int age = 0;

		//Solution : Lionel
		//		System.out.print("Entrer votre age : ");
		//		age = clavier.nextInt();
		//		
		//		while (age <= 0) {
		//			System.out.print("Entrer votre age : ");
		//			System.out.println("L'age doit être positif : ");
		//			age = clavier.nextInt();
		//		}

		while(age <= 0) {
			System.out.print("Entrer votre age : ");
			age = clavier.nextInt();
			if(age <= 0) {
				System.out.println("L'age doit être positif");
			}
		}

		System.out.println("Vous avez " + age + " ans");

	}

}
