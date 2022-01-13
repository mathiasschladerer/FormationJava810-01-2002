package fr.dawan.encapsulation;


public class UtilisateurTest {

	public static void main(String[] args) {
		//Un objet est cr�� avec le mot cl� "new + constructeur"
		Utilisateur user1 = new Utilisateur();
		
		Utilisateur user3 = new Utilisateur("Rudd", "Emily", 18);
		System.out.println("AgeUser3 : " + user3.getAge());
		
		//user3.age = 35;
		
		user3.setAge(21);
		
		System.out.println("Nombre d'utilisateur : " + Utilisateur.getNbreUtilisateur());
		
		System.out.println("Age : " +  user3.getAge() + " ans. \n");
		
		//Acceder � la constante NOMBRE_MAX_OREILLES
		System.out.println(Utilisateur.NOMBRE_MAX_OREILLES);
		
		System.out.println(Long.MAX_VALUE);
				
	}

}
