package fr.dawan.syntaxe_de_base.operateurs;

public class OperateursMathematique {

	public static void main(String[] args) {
		int var1 = 4;
		int var2;
		
		//Pour utiliser une variable (type primitif) il faut d'abord l'initialisée
		//System.out.println("Var2: " + var2);
		var2 = 10;
		
		//Addition 
		int somme = var1 + var2;
		System.out.println("Somme = " + somme);
		
		//Soustration 
		int sub = var1 - var2;
		System.out.println("sub = " + sub);
		
		//Multiplication 
		int prod = var1 * var2;
		System.out.println("prodcuit = " + prod);
		
		//Modulo
		//Un modulo permet d'avoir  le reste de la division entiere entre 
		//deux Nombres. Cela s'appelle une division Euclidienne : a = b*q + R
		//R est le reste de la division Euclidienne
		//ex: 23 = 5*4 + 3
		//R = 3
		int dividende = 23;
		int diviseur = 5; 
		int modulo = dividende % diviseur;
		System.out.println("modulo : " + modulo);
		
		
		//Division ==> 4 / 10 
		//Resultat attendu : 0.4
		//Resultat obtenu : 0
		int quotient = var1 / var2;
		System.out.println("result = " + quotient);
		
	}

}
