package fr.dawan.class_string;

public class ChaineDeCaractere {

	public static void main(String[] args) {
		
		/*
		 * s1, s2 variable de type reference stocké dans le Tas (Heap) mais dans 
		 * une memoire appelé pool-string
		 */
		
		//Construction implicite via String Litteral
		String s1 = "Bonjour";
		String s2 = "Bonjour";
		
		//Construction avec new
		String s3 = new String("Bonjour");  //La valeur "Bonjour" est stocké dans le tas (HEAP)
		String s4 = new String("Bonjour");
		
		System.out.println(s1 == s2);  //true
		System.out.println(s1 == s3);  //false (== compare les references (adresses) des objets
		System.out.println(s3 == s4);  //false
		
		System.out.println(s1.equals(s3)); //true : comparaison de contenu
		
		String str = "test";
		System.out.println(str.charAt(2)); //s
		  
		//Un objet de type String est immuable (immutable)
		str = str.concat("e");
		System.out.println(str);  //teste
		
		System.out.println("substring(0, 3) : " + str.substring(0, 3)); //tes
		System.out.println("substring(2) : " + str.substring(2));  //ste
		
		//StringBuilder : Mutable - Muable
		StringBuilder stb1 = new StringBuilder("test");
		StringBuilder stb2 = new StringBuilder("test");
		
		System.out.println("Comparaion de reference StringBiuilder : " + (stb1==stb2));  //false
		System.out.println("StringBuilder : " + stb1.append("e"));
		
		System.out.println("6" + 4 + 5); //Commence par une chaine de caractère donc concatenation
		System.out.println(4 + 5 + "7");  //Commence par une addition 
		System.out.println(4 + "5" + 3); 
		
		int x = 5 + 'A';   //Le code ascii de  A vaut 65
		System.out.println(x);
		
		char x1 = 5 + 'A'; //F
		System.out.println(x1);
		
		System.out.println("6" + 5*4); //*, /, %, +, -
		
		System.out.println("6" + (5-4));
		
		
	}

}
