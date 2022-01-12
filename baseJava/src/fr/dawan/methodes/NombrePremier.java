package fr.dawan.methodes;

import java.util.Scanner;

public class NombrePremier {
	
	 static Scanner input = new Scanner(System.in);
	 static int nb;
	 static boolean saisieOK;
	 static boolean estPremier;
	 static int diviseur1, diviseur2;
	 static int nb_iterations;
	 
	 static long startTime;
	 static long stopTime;
	
	public static void main(String[] args) {
		
		//Données d'entrée
		System.out.println("Entrez un nombre : ");
		nb = input.nextInt();
		input.close();
		
		//Appel des methodes
		if(IsNombreValide()) {
			startTime = System.currentTimeMillis();
			calcul();
			stopTime = System.currentTimeMillis();
			afficherResultat();
		}
		
	}
	
	public static boolean IsNombreValide() {
		if(nb < 2) {
			System.out.println("Le nombre doit être superieur à 1 ! \n");
			saisieOK = false;
		}else {
			saisieOK = true;
		}
		return saisieOK;
	}
	
	public static void calcul() {
		nb_iterations = 0;
		int limite = nb - 1;
		boolean trouve = false;  //va passer à true si on trouve un diviseur
		
		for (int i = 2; i < limite; i++) {
			nb_iterations++;
			int reste = nb % i;
			if(reste == 0) {
				trouve = true;
				diviseur1 = i;  //2
				diviseur2 = nb / i; // 8/2 = 4
				break;
			}
		}
		estPremier = !trouve;
	}
	
	public static void afficherResultat() {
		if(!estPremier) {
			System.out.printf("%d n'est pas premier ! \n", nb);
			System.out.printf("Il est divisible par %d et %d \n", diviseur1, diviseur2);
		} else {
			System.out.printf("%d est un nombre PREMIER ! \n", nb);
		}
		
		System.out.printf("Resultat obtenu %d iteration\n", nb_iterations);
		System.out.println("Temps d'execution : " + (stopTime - startTime));
	}

}
