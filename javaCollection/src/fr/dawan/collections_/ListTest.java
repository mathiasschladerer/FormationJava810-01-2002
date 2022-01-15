package fr.dawan.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * L'interface List represente un collection ordonnée de donnée 
 * qui peuvent être des doublons (données identiques)
 * 
 * ELle apparait comme un tableau qui n'aurait pas la contrainte de taille 
 * lorsqu'on ajoute ou efface des éléments
 * 
 * 
 */
public class ListTest {

	public static void main(String[] args) {
		
		//Utilisation du polymorphisme (A FOND)
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		System.out.println("************Boucle for classique****************");
		for (int i = 0; i < list.size(); i++) {
		}
		
		System.out.println("\n******************FOREACH*******************");
		for (String element : list) {
			System.out.println(element);
		}
		
		System.out.println("\n****************La classe Collections****************");
		/*
		 * La classe Collections permet de trier une collection de type List<E>
		 */
		//On met la liste dans le desordre 
		Collections.shuffle(list);
		System.out.println(list);
		
		//On la remet dans l'ordre
		Collections.sort(list);
		System.out.println(list);
		
		//decalage vers la gauche 
		Collections.rotate(list, -1);
		System.out.println(list);
		
		//Recuperer une sous-liste 
		List<String> sub = list.subList(2, 5);
		System.out.println(sub);
		Collections.reverse(sub);
		System.out.println(sub);
		
	}

}
