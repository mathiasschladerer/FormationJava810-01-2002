package fr.dawan.conditions;

import java.util.Scanner;

public class InstuctionSwitch {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int jours = 7;

		//Fournir les données d'entrée
		System.out.print("Saisir le numero du jour : ");
		jours = clavier.nextInt();

		/*
		 * Solution 1 : Bloc ELSE-IF
		 */
		//		if(jours == 1) {
		//			System.out.println("Lundi");
		//		} else if(jours == 2){
		//			System.out.println("Mardi");
		//		} else if(jours == 3){
		//			System.out.println("Mercredi");
		//		} else if(jours == 4){
		//			System.out.println("Jeudi");
		//		} else if(jours == 5){
		//			System.out.println("Vendredi");
		//		}else if(jours == 6){
		//			System.out.println("Samedi");
		//		} else if(jours == 7){
		//			System.out.println("Dimanche");
		//		} else {
		//			System.out.println("Entrée invalide :  Veuillez saisir le numero de jours "
		//					+ "entre 1 et 7");
		//		}

		/*
		 * 2ème solution : Instruction swith
		 * Switch : variante du if/else/else-if
		 * 
		 * Avec l'instruction Switch : 
		 * Au lieu d'évaleur chaque condition séquentiellement, il suffit de rechercher 
		 * une fois l'expression et de passer directement à la condition vraie
		 * 
		 * Le break permet de sortir du switch quand une des cas est verifié
		 * 
		 * Le switch on peut l'utiliser llorsqu'on a des conditions "à la carte"
		 * Pour une question de rapidité et performance, le switch est préféré
		 */
		//		

		switch (jours) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Semaine de travail");
			break;
		case 6: 
		case 7: 
			System.out.println("Week end");
			break;
		default:
			System.out.println("Entrée invalide :  Veuillez saisir le numero de jours "
										+ "entre 1 et 7");
		}



	}

}
