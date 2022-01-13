package fr.dawan.getters_and_setters;

public class UtilisateurTest {

	public static void main(String[] args) {
		
		
		Utilisateur user1 = new Utilisateur();	
		user1.nom = "toto";
		user1.prenom = "tata";
		System.out.println("NomUser1  : " + user1.nom);

		
		
		Utilisateur user2 = new Utilisateur("Dupont" ,"Pierre");
		System.out.println("NomUser2  : " + user2.nom);
		
		
		Utilisateur user3 = new Utilisateur("Rudd", "Emily", 27);
		System.out.println("AgeUser3 : " + user3.getAge());
		
		//Modification de l'attribut
		user3.age = 35;
		System.out.println(user3.prenom + " � " + user3.age + " ans. \n");
		user3.age++;
		System.out.println(user3.prenom + " � " + user3.age + " ans. \n");

		System.out.println("\n*********Utilisation des getters et setters ***********");
		user3.setAge(12);
		
		System.out.println(user3.prenom + " � " + user3.age + " ans. \n");

		
		System.out.println("Nombre d'utilisateur :  " + Utilisateur.nbreUtilisateur);
	
		
	}

}
