package fr.dawan.syntaxe_de_base.entree_sortie_standard;

/*
 * La methode println permettait d'afficher un message � l'�cran
 * Nous allons voir la m�thode printf et String.format
 * Elles nous permettrons d'afficher, de produire des chaines de 
 * caract�re format�es.
 */
public class FormatageDeChaineDeCaractere {

	public static void main(String[] args) {
		int dividende = 25;
		int diviseur = 21;
		
		/*les sorties format�es: Le format de ce qui va �tre affich�
		 *	%s	Permet de formatter une chaine de caract�res
		 *	%c  Permet de formatter Un caract�re
		 *  %d	Permet de formatter un entier en base d�cimale.
		 *  %x	Permet de formatter un entier sous forme hexad�cimale
		 *  %e	Permet de formatter un r�el sous forme d�cimale en notation scientifique
		 *  %f	Permet de formatter un r�el sous forme d�cimale
		 *  %t	Utilis� pour formatter les dates
		 *  %n ou \n  (retour � la ligne)
		 */
		
		//1ere solution : utilisation de la m�thode println
		System.out.println("[" + dividende + "/" + diviseur + "]");
		
		//2�me solution : Utilisation de la m�thode printf
		System.out.printf("[%d/%d]\n", dividende, diviseur);
		
		//3�me solution : Utilisation de Sting.format
		String str = String.format("[%d/%d]", dividende, diviseur);
		System.out.println(str);
		
		//Formatter la valeur de PI sous forme decimal
		System.out.printf("%f\n", Math.PI);
		
		//Arrondir la valeur de PI avec 3 chiffres apr�s la virgule
		System.out.printf("%.3f", Math.PI);
	}

}
