package fr.dawan.heritage.mot_cle_super;

public class Triangle extends Forme{

	protected double base = 4;
	protected double hauteur = 2;

	@Override
	public double aire() {
		return base * hauteur * 0.5;
	}

}
