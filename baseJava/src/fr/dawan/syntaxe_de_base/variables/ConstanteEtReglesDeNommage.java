package fr.dawan.syntaxe_de_base.variables;

public class ConstanteEtReglesDeNommage {

	public static void main(String[] args) {
		
		System.out.println("************************CONSTANTES*******************");
		
		//Les constantes doivent ête ecrites en majuscules, pour les 
		//différencier des autres variables
		//final : veut dire que le contenu de ma variable ne va pas changer
		final int VIES_MAX = 15;
		
		System.out.println("*****************REGLES DE NOMMAGE*********************");
		//Les noms des variables peuvent commencer par une lettre 
		int val = 15;
		
		//Les noms des variables peuvent commencer par un underscore
		String _val = "underscore";
		
		//Les noms des variables peuvent commencer par un $
		double $val3 = 5.4;
		
		//Les des variables peuvent contenir des chiffres
		double conv2int = 500;
		
		//Les noms des variables peuvent commencer par un double underscore
		String __val3 = "doubleUnderscore";
		
		//Une variable ne peut pas commencer par un chiffre
		//int 3nbre = 5;
		
		//Une variable ne peut pas commencer par une operation mathématique
		//int -nbre = 8;
		
		//Le nom d'une variable ne doit pas être un mot reservé 
		//int double = 5;
		
		/*
		 * Les mots composés
		 */
		//On peut utiliser l'underscore (_)
		int nombre_de_vie = 5;
		
		//On peut utiliser le CamelCase 
		//Chaque nouveau mot commence par une lettre majuscule sauf le premier
		int nombreDeVie = 5;
			
	}

}
