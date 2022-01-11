package fr.dawan.boucles;

/*
 * L'interet : 
 * 		Le r�le des boucles est repeter un certain nombre de fois les 
 * 		m�mes op�rations. 
 * 		Les boucles s'executent tant qu'une condition est remploe
 */
public class BoucleFor {

	public static void main(String[] args) {
		/*
		 * Exemple 1 : Utilit� des boucles : 
		 * On constate que l'�criture est fastidieuse et longue, c'est 
		 * du copi�-coll�
		 * Solution : Utiliser les boucles (for, while, do-while)
		 * 
		 */
//		System.out.println("Le double de 1 est : " + 1*2);
//		System.out.println("Le double de 2 est : " + 2*2);
//		System.out.println("Le double de 3 est : " + 3*2);
//		System.out.println("Le double de 4 est : " + 4*2);
//		System.out.println("Le double de 5 est : " + 5*2);
//		System.out.println("Le double de 6 est : " + 6*2);
//		System.out.println("Le double de 7 est : " + 7*2);
//		System.out.println("Le double de 8 est : " + 8*2);
//		System.out.println("Le double de 9 est : " + 9*2);
//		System.out.println("Le double de 10 est : "+ 10*2);
		
		
		/*
		 * Solution de l'exemple 1 : Utilisation de la boucle FOR
		 * La boucle FOR s'utilise quand on connait le nombre d'it�ration
		 * (Le nombre de fois qu'on execute une instruction)
		 */
		for(int i = 1; i <= 10; i++) {
			System.out.println("Le double de " + i + " est " + i*2);
		}
	}

}
