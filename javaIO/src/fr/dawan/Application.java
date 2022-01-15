package fr.dawan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Application {
	
	public static void main(String[] args) {
		Personne p = new Personne();
		p.setAge(10);
		System.out.println(p.getCodeSecret());
		
		//Serialisation d'un objet adresse
		Adresse adr = new Adresse("Place occitanie", "Toulouse", 31000);
		
		//Nous déclarons nos objets en dehors du try/catch
		FileInputStream fis = null;
		FileOutputStream fos = null;
		ObjectOutput oos = null;
		ObjectInputStream ois = null;
		
		
		try {
			/*
			 * Création d'un flux de sortie vers le chemin du fichier, 
			 * s'il n'existe pas il sera crée sinon il sera ecrasé 
			 */
			//Chemin du fichier où sera stocké l'obet adresse
			fos = new FileOutputStream("C:/tempJava/adress.txt");
			/*
			 * La classe ObjectOutputStream permet de sérialiser un objet 
			 * ObjectOutputStream(OuputStream out) : 
			 * crée une instance qui va ecrire le resultat de la
			 * serialisation dans le flux fourni en paramètre
			 * Le constructeur de la classe ObjectOutputStream attend en paramètre
			 *  un flux de type OutputStream dans lequel les données 
			 *  de la serialisation seront envoyés
			 */
			//stream de sortie de l'objet adresse
			oos = new ObjectOutputStream(fos);
			
			//Ecriture de l'objet dans le fichier 
			oos.writeObject(adr);
			
		} catch (FileNotFoundException e) {
			//Cette exception est levée si l'objet FileInputStream ne trouve aucun 
			//fichier
			e.printStackTrace();
		} catch (IOException e) {
			//Celle-ci se produit lors d'une erreur d'ecriture ou de lecture
			e.printStackTrace();
		} finally {
			//On ferme nos flux de données dans un bloc finally pour s'assurer
			//que ces instructions seront executées dans tous les cas même si 
			//une exception est levée
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		
		/*
		 * ETAPE LECTURE FICHIER
		 *  - On va créer un objet de la classe FileInputStream qui represente le fichier
		 *    contenant l'objet sérialisé puis un ibjet de type ObjectInputStream en 
		 *    lui passant le  fichier en paramètre. 
		 *    La classe ObjectInoutStream permet de déserialiser une grappe d'objets à partir
		 *    d'un flux de fichier binaire 
		 */
		Object o;
		
		try {
			//Création d'un flux d'entrée ayant pour source le chemin vers le fichier
			fis = new FileInputStream("C:/tempJava/adress.txt");
			ois = new ObjectInputStream(fis);
			o = ois.readObject();
			if(o instanceof Adresse) {
				Adresse adr2 = (Adresse) o;
				System.out.println(adr2);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Le fichier n'existe pas");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
