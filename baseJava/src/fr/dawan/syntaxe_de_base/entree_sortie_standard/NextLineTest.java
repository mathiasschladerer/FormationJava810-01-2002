package fr.dawan.syntaxe_de_base.entree_sortie_standard;

import java.util.Scanner;

/*
 * La m�thode NextLine permet de lire une ligne de texte jusqu'au 
 * prochain retour � la ligne
 * Retourne une ligne
 */
public class NextLineTest {

	static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = 0;
		String str1 = "";
		String str2 = "";
		
		System.out.print("Entrer un entier : ");
		n  = clavier.nextInt();
		
//		clavier = new Scanner(System.in);
		
		//Solution pour eviter de lire les caract�res juste 
		//apr�s l'entier r�cup�r�
		clavier.nextLine();
		
		System.out.print("Entrer du texte 1: ");
		str1 = clavier.nextLine();
		
		System.out.print("Entrer du texte 2: ");
		str2 = clavier.nextLine();
		
		//On affiche le contenu entr� par l'utilisateur
		System.out.println("n = " + n);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = "  + str2);
		
	}
	


}
