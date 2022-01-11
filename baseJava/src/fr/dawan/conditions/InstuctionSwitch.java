package fr.dawan.conditions;

import java.util.Scanner;

public class InstuctionSwitch {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int jours = 7;

		//Fournir les donn�es d'entr�e
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
		//			System.out.println("Entr�e invalide :  Veuillez saisir le numero de jours "
		//					+ "entre 1 et 7");
		//		}

		/*
		 * 2�me solution : Instruction swith
		 * Switch : variante du if/else/else-if
		 * 
		 * Avec l'instruction Switch : 
		 * Au lieu d'�valeur chaque condition s�quentiellement, il suffit de rechercher 
		 * une fois l'expression et de passer directement � la condition vraie
		 * 
		 * Le break permet de sortir du switch quand une des cas est verifi�
		 * 
		 * Le switch on peut l'utiliser llorsqu'on a des conditions "� la carte"
		 * Pour une question de rapidit� et performance, le switch est pr�f�r�
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
			System.out.println("Entr�e invalide :  Veuillez saisir le numero de jours "
										+ "entre 1 et 7");
		}



	}

}
