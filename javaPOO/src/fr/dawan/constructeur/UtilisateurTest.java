package fr.dawan.constructeur;

public class UtilisateurTest {

	public static void main(String[] args) {
		
		
		Utilisateur user1 = new Utilisateur();
		
		
		Utilisateur user2 = new Utilisateur("Dupont" ,"Pierre");
		
		System.out.println("NomUser2  : " + user2.nom);
		
		System.out.println("Nombre d'utilisateur :  " + Utilisateur.nbreUtilisateur);
		
		
		
	}

}
