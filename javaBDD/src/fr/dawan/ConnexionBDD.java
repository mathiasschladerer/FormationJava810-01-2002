package fr.dawan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnexionBDD {
	
	public static Connection getConnection() throws Exception {
		//Objet Properties pour récuperer les valeurs du fichier conf.properties
		Properties p = new Properties();
		
		//Etablir la connexion
		p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("conf.properties"));
	
		/*
		 * Class.forName permet de charger une classe dynamiquement
		 * Ici, il va venir charger mon driver mysql de type jdbc
		 */
		Class.forName(p.getProperty("driver"));
		
		
		/*
		 * Comment créer ne connexion ? 
		 * On va demander au gesitonnaire de driver de nous recuperer une connexion
		 * On va etablir une connexion 
		 * url : vers quelle base de données ??? 
		 * 		la base de données contenu dans l'url
		 * le user et le mot de passe 
		 */
		Connection cnx = DriverManager.getConnection(p.getProperty("url"),
				p.getProperty("usr"), p.getProperty("pwd"));
		
		return cnx;
	}
	
}
