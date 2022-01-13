package fr.dawan.exception_.exception_personnalisee;

public class Parking {
	
	//tabVoiture : Tableaux dans lequel que je vais mettre mes voitures
	//Mon parking ne peut contenir que 5 voitures
	private Voiture tabVoiture[] = new Voiture[5];
	
	//Compte le nombre de voiture
	private int compteur;
	
	/*
	 * throw : permet de lever une exception manuellement en instanciant un objet 
	 * 			de type ParkingException
	 * throws : Ce mot cl� permet de signaler � la JVM qu'un morceau de code, 
	 * 			une m�thode, une classe... est potentiellement dangereux
	 * 			et qu'il FAUT utiliser un try{...}catch{...}
	 */
	public void gareVoiture(Voiture voiture) throws ParkingPleinsException {
		if(compteur < 5) {
			tabVoiture[compteur] = voiture;
			compteur++;
		} else {
			throw new ParkingPleinsException();
		}
	}
	
}
