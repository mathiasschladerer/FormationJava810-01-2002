package fr.dawan.heritage.mot_cle_super;

public class Carre extends Forme{

	/*
	 * Lorsqu'on definie un attribut en mode protected, on a acces à cet attribut à
	 * à l'interieur de la classe, à l'interieur des classes filles, et à 
	 * l'interieur des classes du même package
	 */
	protected int cote = 4;

	public int prop1 = 20;

	/*
	 * Pour appeler le constructeur de la classe parente, il faut utiliser 
	 * le mot clé super()
	 * super() sans paramètre appelle le constructeur de la classe parente
	 * sans paramètre
	 */
	//	public Carre() {
	//		super();
	//		System.out.println("Je suis  dans la classe carre");
	//	}
	//

	//	public Carre() {
	//		super("Constructeur de la classe parente avec paramètre");
	//		System.out.println("Je suis dans le constructeur de la classe carre");
	//	}

	//Le mot clé "super" permet d'utiliser (d'appeler) des méthodes de la classe mère
//	public Carre() {
//		super();
//		System.out.println(super.decrisToi());
//	}
	
	public Carre() {
		super();
		System.out.println(super.prop1 + this.prop1);
	}


	@Override
	public double aire() {
		return cote * cote;
	}









}
