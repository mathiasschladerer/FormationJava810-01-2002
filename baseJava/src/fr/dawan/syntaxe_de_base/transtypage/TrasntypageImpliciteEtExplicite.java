package fr.dawan.syntaxe_de_base.transtypage;

public class TrasntypageImpliciteEtExplicite {

	public static void main(String[] args) {
		
		//Transtypage implicite : Concerne le passage d'un type inferieur 
		//vers un type superieur
		int i = 42;
		double d = i;
		System.out.println(d);
		
		//Transtypage explicite (Cast)
		//Passage d'un type superieur vers un type inferieur 
		//Cela implique de faire un cast
		//Cast : Concerne les conversions des types compatibles 
		int i1 = 123;
		short s = (short) i1;
		
		double d1 = 44.95;
		int i2 = (int) d1;
		
		//Perte de précision : Il faut que le type qui reçoit la valeur 
		//ait la capacité de contenir cette valeur;
		//byte [-128 127]  ==> -128 -127 -126
		int i3 = 130;
		byte b = (byte) i3;
		System.out.println(b);
	}

}
