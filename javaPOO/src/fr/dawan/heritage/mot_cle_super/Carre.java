package fr.dawan.heritage.mot_cle_super;

public class Carre extends Forme{

	/*
	 * Lorsqu'on definie un attribut en mode protected, on a acces � cet attribut �
	 * � l'interieur de la classe, � l'interieur des classes filles, et � 
	 * l'interieur des classes du m�me package
	 */
	protected int cote = 4;

	public int prop1 = 20;

	/*
	 * Pour appeler le constructeur de la classe parente, il faut utiliser 
	 * le mot cl� super()
	 * super() sans param�tre appelle le constructeur de la classe parente
	 * sans param�tre
	 */
	//	public Carre() {
	//		super();
	//		System.out.println("Je suis  dans la classe carre");
	//	}
	//

	//	public Carre() {
	//		super("Constructeur de la classe parente avec param�tre");
	//		System.out.println("Je suis dans le constructeur de la classe carre");
	//	}

	//Le mot cl� "super" permet d'utiliser (d'appeler) des m�thodes de la classe m�re
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
