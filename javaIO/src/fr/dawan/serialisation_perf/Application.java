package fr.dawan.serialisation_perf;

public class Application {

	public static void main(String[] args) {
		Produit p = new Produit(1, "Ordinateur", 500.0);
		TestSerialisation.toBin(p, "C:/tempJava/produit.txt");
		
		Produit p1 = new Produit();
		p1 = TestSerialisation.fromBin("C:/tempJava/produit.txt");
		System.out.println(p1);
	}

}
