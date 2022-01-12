package fr.dawan.tableaux.tableaux_statique;

import java.util.Scanner;

/*
 * 	Nous verrons les tableaux statiques et les tableaux dynamiques (collections)
 * 		- Un tableau statique � une taille fixe. 
 * 		  On ne peut pas la modifi� une fois d�clar�e. 
 *      - Un tableau dynamique nous permet de cr�er des tableau de taille 
 *        dynamique
 *        	o Nous pouvons augmenter et diminuer sa taille
 *          o Ces tableaux ne peuvent contenir que des references vers 
 *            des objets
 *  L'alternative aux tableaux statiques, sont les tableaux dynamiques      
 */
public class TableauUtilite {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int age1, age2;
		double moyenne;
		
		System.out.println("Entrer l'age de l'utilisateur1 : ");
		age1= clavier.nextInt();
		
		System.out.println("Entrer l'age de l'utilisateur2 : ");
		age2= clavier.nextInt();
		
		moyenne = (age1 + age2) / 2;
		System.out.println("La moyenne des ages est : " + moyenne);
		
		/*
		 * Conclusion : 
		 * Si on a une quantit� importante de donn�e (par exemple 27 utilisateurs)
		 * Il va falloir d�clar� 27 variables, ce qui est trop long, 
		 * illisible et une perte de temps pour le programmeur
		 * pour resoudre ce probl�me, on va utiliser les tableaux qui permettent 
		 * de stocker des �l�ments de m�mes types
		 * Par exemple on peut stocker un tableau d'entier, un tableau de chaine 
		 * de caract�re (String)
		 */

	}

}
