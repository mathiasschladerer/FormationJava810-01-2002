package fr.dawan.methodes.fonctions_recursive;

public class PlusGrandDiviseurCommun {

	public static void main(String[] args) {
		
	}

	public static int pgcd(int a, int b) {
		if(a % b == 0) {
			return b;
		} else {
			return pgcd(b, a%b);
		}
	}
}
