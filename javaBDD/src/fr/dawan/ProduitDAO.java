package fr.dawan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * Un DAO (Direct Object Access) contient les diff�rentes op�ration qu'on effectue sur
 * une base de donn�e nomm� aussi CRUD  : Create Read Update Delete
 *  - Insertion
 *  - Consultation 
 *  - Suppression
 *  - Mise � jours
 *  
 *  Deux methodes : 
 *  		- executeQuery   :::: lire les donn�es
 *  		- executeUpdate   ::: modifier les donn�es (ajouter effacer mise � jours)
 */
public class ProduitDAO {
	
	public static List<Produit> getAll(Connection cnx) throws Exception {
		
		List<Produit> lp = new ArrayList<Produit>();
		
		//Requ�te sql
		String sql = "SELECT * FROM produits";
		
		//Cr�er un objet PreparedStatement
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		//Cr�er un objet resulSet qui sontient l'ensemble des enregistrements (liste) 
		//de notre table
		ResultSet rs = ps.executeQuery();
		
		//Stocker ces enregistrements des objets de type Produit
		while(rs.next()) {
			Produit p = new Produit();
			
			//Cr�ation des attributs du produits via les setteurs 
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
	
	//Insertion d'un produit dans la base de donn�es
	public void insert(Produit p, Connection cnx) throws Exception {
		//requ�te SQL
		String sql = "INSERT INTO produits(id, description, prix) VALUES (?,?,?)";
		
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		//recuperer les VALUES � inserer � partir du Produit d�finis dans les param�tres
		ps.setInt(1, p.getId());
		ps.setString(2, p.getDescription());
		ps.setDouble(3, p.getPrix());
		
		//executer la requ�te 
		//executeUpdate (� la place de executeQuery car le contenu de la base de donn�es 
		//sera modifi�)
		
		ps.executeUpdate();
		
		ps.close();
		cnx.close();
	}
	
}
