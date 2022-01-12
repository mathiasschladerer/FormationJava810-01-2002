package fr.dawan.methodes.fonctions_recursive;

public class Factorielle {

	public static void main(String[] args) {
		int fact = factorielle(5);
		System.out.println(fact);
	}
	
	//5! = 5*4*3*2*1
	static int factorielle(int n) {
		if(n==1) {
			return 1;
		} else {
			return n * factorielle(n-1);
		}
	}

}
