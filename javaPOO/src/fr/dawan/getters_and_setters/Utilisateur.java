package fr.dawan.getters_and_setters;

/*
 * Nous allons voir l'utilit� des accesseurs (Getters) et les mutateurs (Setters)
 * en Java. 
 * 
 * Un Getter et un Setter ce sont deux m�thodes qui permettent de lire (Getter)
 * et de modifier (Setter)  L'ATTRIBUT
 * 
 * Les getters et les setters permettent de mettre en place des rectrictions
 * et des contraintes sur l'acc�s ou la mise � jours des attributs
 */
public class Utilisateur {
	
	//Visibilit�  : public
	//Cela veut dire que les autres classes pourront acceder � ces attributs
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
	
	//Constructeur avec param�tre deux param�tres (nom et prenom)
	public Utilisateur(String nom, String prenom) {
		//this fait reference � l'objet courant (en cours)
		//this represente l'objet dans lequel nous nous trouvons
		//On peut faire appel � this pour acceder � un attribut de la m�me classe
		this();
		this.nom = nom;
		this.prenom = prenom;
	
		//nbreUtilisateur++;
	}
	
	//Constructeur avec trois param�tres
	public Utilisateur(String nom, String prenom, int age) {
		//Un constructeur peut appeler un autre constructeur de m�me classe 
		//en utilisant la m�thode this()
//		this.nom = nom;
//		this.prenom = prenom;
		this(nom, prenom);
		this.age = age;
	//	nbreUtilisateur++;
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
}
