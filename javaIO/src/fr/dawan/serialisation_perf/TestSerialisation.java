package fr.dawan.serialisation_perf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialisation {
	
	public static void toBin(Produit p, String cheminFichier) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(cheminFichier);
			bos = new BufferedOutputStream(fos);
			//2ème façon 
			//bos = new BufferedOutputStream(new FileOutputStream(cheminFichier));
			oos = new ObjectOutputStream(bos);
			
			oos.writeObject(p);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
	}
	
	public static Produit fromBin(String cheminFichier) {
		Object o = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(cheminFichier));
			ois = new ObjectInputStream(bis);
			
			o = ois.readObject();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(o instanceof Produit) {
			return (Produit) o;
		} else {
			return null;
		}

	}
}
