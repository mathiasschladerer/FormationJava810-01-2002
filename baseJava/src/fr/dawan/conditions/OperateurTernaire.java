package fr.dawan.conditions;

public class OperateurTernaire {

	public static void main(String[] args) {
		int nbre = 10;
		String str = "";
		/*
		 * Instruction if-else
		 */
//		if(nbre > 0) {
//			str = "Positif";
//		} else {
//			str = "N�gatif";
//		}
		
		/*
		 * Operateur Ternaire
		 * Syntaxe : Condition ? intruction1 : instruction2
		 */
		str = nbre > 5 ? "Positif" : "N�gatif";
	}

}
