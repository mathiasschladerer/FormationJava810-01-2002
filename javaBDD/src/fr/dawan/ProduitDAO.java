package fr.dawan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * Un DAO (Direct Object Access) contient les différentes opération qu'on effectue sur
 * une base de donnée nommé aussi CRUD  : Create Read Update Delete
 *  - Insertion
 *  - Consultation 
 *  - Suppression
 *  - Mise à jours
 *  
 *  Deux methodes : 
 *  		- executeQuery   :::: lire les données
 *  		- executeUpdate   ::: modifier les données (ajouter effacer mise à jours)
 */
public class ProduitDAO {
	
	public static List<Produit> getAll(Connection cnx) throws Exception {
		
		List<Produit> lp = new ArrayList<Produit>();
		
		//Requête sql
		String sql = "SELECT * FROM produits";
		
		//Créer un objet PreparedStatement
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		//Créer un objet resulSet qui sontient l'ensemble des enregistrements (liste) 
		//de notre table
		ResultSet rs = ps.executeQuery();
		
		//Stocker ces enregistrements des objets de type Produit
		while(rs.next()) {
			Produit p = new Produit();
			
			//Création des attributs du produits via les setteurs 
			p.setId(rs.getInt("id"));
			p.setDescription(rs.getString("description"));
			p.setPrix(rs.getDouble("prix"));
			
			//Ajout du produit dans la liste
			lp.add(p);
		}
		rs.close();
		cnx.close();
		return lp;
	}
	
	//Insertion d'un produit dans la base de données
	public void insert(Produit p, Connection cnx) throws Exception {
		//requête SQL
		String sql = "INSERT INTO produits(id, description, prix) VALUES (?,?,?)";
		
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		//recuperer les VALUES à inserer à partir du Produit définis dans les paramètres
		ps.setInt(1, p.getId());
		ps.setString(2, p.getDescription());
		ps.setDouble(3, p.getPrix());
		
		//executer la requête 
		//executeUpdate (à la place de executeQuery car le contenu de la base de données 
		//sera modifié)
		
		ps.executeUpdate();
		
		ps.close();
		cnx.close();
	}
	
}
