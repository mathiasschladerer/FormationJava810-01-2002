package fr.dawan.collections_;

import java.util.HashMap;
import java.util.Map;

/*
 * Une collection de type Map est une collection qui fonctionne avec un couple 
 * clé-valeur
 * Ses classes derivées sont : HashTable, HashMap, TreeMap
 * 
 * Declaration et initialisation d'un Map : Le type de la clé et le type de la valeur 
 * sont obligatoire à gauche
 * 
 * La classe HashMap, elle n'est pas synchonized, la clé peut être null 
 * La classe HashTable, elle est similaire à la classe HashMap, sauf qu'elle est 
 * synchronizes (thread-safe) et null ne peut pas être utilisé pour la clé
 */
public class MapTest {

	public static void main(String[] args) {
		
		//Polymorphisme (A FOND)
		Map<String , String> map = new HashMap<String, String>();
		map.put("1", "Un");
		map.put("2", "Deux");
		map.put("3", "Trois");
		map.put("4", "Quatre");
		map.put("5", "Cinq");
		
		//KeySet() : Retourne un objet de type Set<K> representant la liste des clés 
		//contenu dans la collection
		for (String str : map.keySet()) {
			System.out.println(str + " ");
		}
		
		System.out.println("\nParcourir les elements : ");
		for (Map.Entry<String, String> mp : map.entrySet()) {
			System.out.println(mp.getKey() + " " + mp.getValue());
		}
		
		System.out.println("\nméthode remove :");
		map.remove("1");
		System.out.println("Après la suppressuin : " + map);
	}

}
