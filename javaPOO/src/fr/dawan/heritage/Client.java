package fr.dawan.heritage;

public class Client extends Utilisateur{
	
	private String numTelephone;
	private boolean isSubscribe;
	
	public Client() {
		
	}
	
	public Client(String numTelephone) {
		this.numTelephone = numTelephone;
	}
	
	public String getNumTelephone() {
		return this.numTelephone;
	}
	
	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}
	
	public boolean isSubscribe() {
		return this.isSubscribe;
	}
	
	public void setSubscribe(boolean isSubscribe) {
		this.isSubscribe = isSubscribe;
	}
	
}
