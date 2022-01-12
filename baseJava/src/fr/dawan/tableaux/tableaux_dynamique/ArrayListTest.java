package fr.dawan.tableaux.tableaux_dynamique;

import java.util.ArrayList;

/*
 * L'objectif des tableaux dynamique, dite collections, est de pouvoir cr�er
 * des tableaux qu'on pourra facilement modifier, la taille peut augmenter 
 * ou diminuer
 * 
 * Nous allons utiliser la classe ArrayList pour cr�er nos tableaux dynamique : 
 * 	  o C'est un objet qui n'a pas de taille limite commes les tableaux
 * 		statiques
 * 
 * La classe ArrayList est utilis�e pour les types evolu�s (complexes)
 *  non pour es types primitifs 
 * 
 * On peut lui affecter entre chevron le type de donn�es qu'il va stocker
 */
public class ArrayListTest {

	public static void main(String[] args) {
		//Tableau d'entier
		ArrayList<Integer> tab1 = new ArrayList<Integer>();
		
		//Ajouter un element dans le tableau
		tab1.add(20);

		//On peut modifier un element dans le tableau
		tab1.set(0, 60);
		System.out.println(tab1.get(0));

		tab1.add(350);
		tab1.add(980);

		System.out.println("Element � la positio 2 : " + tab1.get(2));

		if(tab1.contains(50)) {
			System.out.println("L'�lement 50 est pr�sent dans mon tableau");
		} else {
			System.out.println("L'�lement 50 n'est  pas pr�sent dans mon tableau");
		}


		//Taille du tableau 
		System.out.println("Taille avant suppression : " + tab1.size());
		
		//suppresion d'un �lement
		tab1.remove(1);
		
		System.out.println("Taille apr�s suppression : " + tab1.size());
	}

}
