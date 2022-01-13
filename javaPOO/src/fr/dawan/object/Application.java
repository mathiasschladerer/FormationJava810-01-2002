package fr.dawan.object;

public class Application {

	public static void main(String[] args) {
		
		CompteBancaire cb1 = new CompteBancaire("toto", "12aaa541", 894251);
		
		CompteBancaire cb2 = new CompteBancaire("tata", "66ttt66", 5000);

		CompteBancaire cb3 = new CompteBancaire("tata", "66ttt66", 5000);
		
		System.out.println(cb1); //System.out.println(cb1.toString());
		
		//cb2 == cb3  ==> L'operateur == utilisé entre les objets compare l'adresse 
		//des references 
		System.out.println("L'utilisation de l'operateur == " + (cb2 == cb3));
		
		System.out.println(cb2.equals(cb3));

	}

}
