package fr.dawan.syntaxe_de_base.operateurs;

public class OperateursDincrementation {

	public static void main(String[] args) {
		
		int c = 10;
		c++; //c = c + 1 ;   //Incrementation
		System.out.println(c);
		
		int d = 15; 
		d--; //d = d - 1  //decrementation
		System.out.println(d);
		
		/*
		 * Post-Incrementation et Pr�-Incrementation 
		 * Il y a une grande difference entre ecrire e++ et ++e
		 * 
		 * pr�-incrementation ===> ++e : On ajoute d'abrd et ensuite on affiche e
		 * On incremente avant d'afficher
		 * 
		 *  Post-Incrementation  ====> e++ : On affiche e et apr�s on ajoute
		 *  On affiche avant d'incrementer 
		 */
		
		int e = 10;
		System.out.println("Post-incrementation : " + e++);  //10
		System.out.println("Pr�-incrementation : " + ++e);  //12
		
		int f = 10;
		System.out.println("Pr�-incrementation : " + ++f); //11
		System.out.println("Post-incrementation : " + f++);
		
	}

}
