package fr.dawan.constructeur;

public class UtilisateurTest {

	public static void main(String[] args) {
		
		//Un objet est cr�� avec le mot cl� "new + constructeur"
		Utilisateur user1 = new Utilisateur();	
		user1.nom = "toto";
		user1.prenom = "tata";
		System.out.println("NomUser1  : " + user1.nom);

		
		
		Utilisateur user2 = new Utilisateur("Dupont" ,"Pierre");
		System.out.println("NomUser2  : " + user2.nom);
		
		
		Utilisateur user3 = new Utilisateur("Rudd", "Emily", 27);
		System.out.println("AgeUser3 : " + user3.age);
		
		System.out.println("Nombre d'utilisateur :  " + Utilisateur.nbreUtilisateur);
		
		
		
	}

}
