package fr.dawan.enumeration;


public class Utilisateur {
	
	private String nom; 
	private String prenom;
	private int age;
	
	//Variable de classe : Classe.Variable
	//La variable de classe  appartient � cette classe non 
	//� une instance de cette classe
	//Cela permet d'economiser l'espace memoire
	private static int nbreUtilisateur;
	
	public static final int NOMBRE_MAX_OREILLES = 2;
	
	
	//Constructeur par defaut (sans param�tre)
	public Utilisateur() {
		nbreUtilisateur++;
	}
	
	//Constructeur avec param�tre deux param�tres (nom et prenom)
	public Utilisateur(String nom, String prenom) {
		this();
		this.nom = nom;
		this.prenom = prenom;
	
		//nbreUtilisateur++;
	}
	
	//Constructeur avec trois param�tres
	public Utilisateur(String nom, String prenom, int age) {
		this(nom, prenom);
		//this.age = age;
		this.setAge(age);  
	}
	
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age < 15) {
			System.out.println("Interdit au moins de 15 ans");
		} else {
			this.age = age;
		}
	}
	
	//Methode de classe : Classe.Methode
	public static int getNbreUtilisateur() {
		return nbreUtilisateur;
	}
}
