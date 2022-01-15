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
		
		//Nous d�clarons nos objets en dehors du try/catch
		FileInputStream fis = null;
		FileOutputStream fos = null;
		ObjectOutput oos = null;
		ObjectInputStream ois = null;
		
		
		try {
			/*
			 * Cr�ation d'un flux de sortie vers le chemin du fichier, 
			 * s'il n'existe pas il sera cr�e sinon il sera ecras� 
			 */
			//Chemin du fichier o� sera stock� l'obet adresse
			fos = new FileOutputStream("C:/tempJava/adress.txt");
			/*
			 * La classe ObjectOutputStream permet de s�rialiser un objet 
			 * ObjectOutputStream(OuputStream out) : 
			 * cr�e une instance qui va ecrire le resultat de la
			 * serialisation dans le flux fourni en param�tre
			 * Le constructeur de la classe ObjectOutputStream attend en param�tre
			 *  un flux de type OutputStream dans lequel les donn�es 
			 *  de la serialisation seront envoy�s
			 */
			//stream de sortie de l'objet adresse
			oos = new ObjectOutputStream(fos);
			
			//Ecriture de l'objet dans le fichier 
			oos.writeObject(adr);
			
		} catch (FileNotFoundException e) {
			//Cette exception est lev�e si l'objet FileInputStream ne trouve aucun 
			//fichier
			e.printStackTrace();
		} catch (IOException e) {
			//Celle-ci se produit lors d'une erreur d'ecriture ou de lecture
			e.printStackTrace();
		} finally {
			//On ferme nos flux de donn�es dans un bloc finally pour s'assurer
			//que ces instructions seront execut�es dans tous les cas m�me si 
			//une exception est lev�e
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		
		/*
		 * ETAPE LECTURE FICHIER
		 *  - On va cr�er un objet de la classe FileInputStream qui represente le fichier
		 *    contenant l'objet s�rialis� puis un ibjet de type ObjectInputStream en 
		 *    lui passant le  fichier en param�tre. 
		 *    La classe ObjectInoutStream permet de d�serialiser une grappe d'objets � partir
		 *    d'un flux de fichier binaire 
		 */
		Object o;
		
		try {
			//Cr�ation d'un flux d'entr�e ayant pour source le chemin vers le fichier
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
