package fr.dawan.tableaux.tableaux_statique;

/*
 * Nous allons voir les avantages et inconveniernts entre l'iteraton classique
 * et l'iteration sur un enseble de valeurs
 * 
 *Conclusion : Pour modifier une valeur on va donc utiliser l'itération classique
 *
 *2ème cas: On peut pas tester des valeurs dans le tableau en utilisant le foreach
 *	Par contre avec la boucle for classique c'est possible car on peut ecrire
 *  tab[i] == tab[i+1] ou tab[i] < tab[i+]
 */
public class IterationClassiqueVSIterationValeur {

	public static void main(String[] args) {
		int[] tab = {100, 200, 300};
		
		System.out.println("******Iteration classique avec la boucle FOR********");
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);	
			//tab[i] = 22;
		}
		
		System.out.println("tab[2] : " + tab[2]);
		
		System.out.println("******Foreach :  Iteration sur un ensemble de valeur********");
		for(int element: tab) {
			System.out.println(element);
			//element = 22;
		}
		
		System.out.println("tab[3] : " + tab[1]);

		
	}

}
