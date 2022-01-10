package fr.dawan.syntaxe_de_base.entree_sortie_standard;

/*
 * La methode println permettait d'afficher un message à l'écran
 * Nous allons voir la méthode printf et String.format
 * Elles nous permettrons d'afficher, de produire des chaines de 
 * caractère formatées.
 */
public class FormatageDeChaineDeCaractere {

	public static void main(String[] args) {
		int dividende = 25;
		int diviseur = 21;
		
		/*les sorties formatées: Le format de ce qui va être affiché
		 *	%s	Permet de formatter une chaine de caractères
		 *	%c  Permet de formatter Un caractère
		 *  %d	Permet de formatter un entier en base décimale.
		 *  %x	Permet de formatter un entier sous forme hexadécimale
		 *  %e	Permet de formatter un réel sous forme décimale en notation scientifique
		 *  %f	Permet de formatter un réel sous forme décimale
		 *  %t	Utilisé pour formatter les dates
		 *  %n ou \n  (retour à la ligne)
		 */
		
		//1ere solution : utilisation de la méthode println
		System.out.println("[" + dividende + "/" + diviseur + "]");
		
		//2ème solution : Utilisation de la méthode printf
		System.out.printf("[%d/%d]\n", dividende, diviseur);
		
		//3ème solution : Utilisation de Sting.format
		String str = String.format("[%d/%d]", dividende, diviseur);
		System.out.println(str);
		
		//Formatter la valeur de PI sous forme decimal
		System.out.printf("%f\n", Math.PI);
		
		//Arrondir la valeur de PI avec 3 chiffres après la virgule
		System.out.printf("%.3f", Math.PI);
	}

}
