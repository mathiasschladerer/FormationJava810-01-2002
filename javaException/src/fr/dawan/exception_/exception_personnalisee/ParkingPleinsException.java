package fr.dawan.exception_.exception_personnalisee;

/*
 * Pour cr�er ses propres exceptions : 
 * 1 - H�riter de la classe Exception 
 * 2- Appeler le constructeur de la classe Exception
 */
public class ParkingPleinsException extends Exception {

	public ParkingPleinsException() {
		super("Il n'y a plus de places sur le parking");
	}

}
