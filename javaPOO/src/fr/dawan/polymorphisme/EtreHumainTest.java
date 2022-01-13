package fr.dawan.polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class EtreHumainTest {

	public static void main(String[] args) {
		
		ArrayList<EtreHumain> tab = new ArrayList<EtreHumain>();
		tab.add(new Homme());
		tab.add(new Femme());
		tab.add(new Femme());
		tab.add(new Homme());
		tab.add(new Femme());
		
		/*
		 *  indice 0  : etreHumain = new Homme() 
		 *  indice 1  : etreHumain = new Femme()
		 *  indice 2  : etreHumain = new Femme()
		 *  indice 3  : etreHumain = new Homme()
		 *  indice 4  : etreHumain = new Femme()
		 *  
		 * Manipuler des objets sans se soucier de leur type
		 */
		for (EtreHumain etreHumain : tab) {
			etreHumain.uriner();
		}
		
		System.out.println();
		
		EtreHumain eh = new Homme();
		
		List<EtreHumain> lstHumain = new ArrayList<EtreHumain>();
	}

}
