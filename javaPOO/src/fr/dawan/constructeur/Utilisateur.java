package fr.dawan.constructeur;

public class Utilisateur {
	
	//Visibilit�  : public
	//Cela veut dire que les autres classes pourront acceder � ces propri�t�s
	//Variable d'instance = Instance.Variable
	public String nom; 
	public String prenom;
	public int age;
	
	//Variable de classe : Classe.Variable
	public static int nbreUtilisateur;
	
	//Constructeur par defaut (sans param�tre)
	public Utilisateur() {
		nbreUtilisateur++;
	}
	
	//Constructeur avec param�tre
	public Utilisateur(String nom, String prenom) {
		//this fait reference � l'objet courant (en cours)
		//this represente l'objet dans lequel nous nous trouvons
		//On peut faire appel � this pour acceder � un attribut de la m�me classe
		this.nom = nom;
		this.prenom = prenom;
		nbreUtilisateur++;
	}
}
