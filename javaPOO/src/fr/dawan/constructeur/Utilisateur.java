package fr.dawan.constructeur;

public class Utilisateur {
	
	//Visibilité  : public
	//Cela veut dire que les autres classes pourront acceder à ces propriétés
	//Variable d'instance = Instance.Variable
	public String nom; 
	public String prenom;
	public int age;
	
	//Variable de classe : Classe.Variable
	public static int nbreUtilisateur;
	
	//Constructeur par defaut (sans paramètre)
	public Utilisateur() {
		nbreUtilisateur++;
	}
	
	//Constructeur avec paramètre
	public Utilisateur(String nom, String prenom) {
		//this fait reference à l'objet courant (en cours)
		//this represente l'objet dans lequel nous nous trouvons
		//On peut faire appel à this pour acceder à un attribut de la même classe
		this.nom = nom;
		this.prenom = prenom;
		nbreUtilisateur++;
	}
}
