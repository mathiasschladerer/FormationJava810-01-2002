package fr.dawan.syntaxe_de_base.variables;

public class VariablesEtTypes {

	public static void main(String[] args) {
		//Type caract�re : char 
		char c = 'a'; 
		
		//Type Entier : byte, short , int , long
		byte b = 1;
		short s = 12;
		int i = 3;
		long l = 4;
		
		//On peut forcer une valeur litt�ral � �tre interpr�t�e 
		//comme un entier long en suffixant la valeur L ou l
		long l2 = 100L;
		
		//Pour plus de visibilit�, il est egalement possible de s�parer les milliers 
		//par un underscore (_)
		long l3 = 1_000_000_000;
		System.out.println("Le contenu de l3 est "+ l3);
		
		//Les types � virgules flottante (d�cimal) : float, double
		double d1 = 5;
		System.out.println("Le contenu de d : " + d1);
		
		//Pur les variable de type Float, il faut suffixer la valeur par F ou f
		float f = 0.5F;
		
		//Le type bool�en : boolean 
		boolean bool = true;
		
		//Type complexe 
		String chaine = "Dawan";
		int[] tab = {200, 300, 50};
	}

}
