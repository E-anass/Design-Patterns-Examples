package test;

import TM.Moto;
import TM.Quad;
import TM.Vehicule;
import TM.Voiture;

public class Client {
	
	
	public static void main(String[] args) {
		
		
		Vehicule Dacia = new Voiture();	
		Dacia.Se_deplacer();
		
		Vehicule Kawasaki = new Moto();
		Kawasaki.Se_deplacer();
		
		
		Vehicule QuadYamaha = new Quad();
		QuadYamaha.Se_deplacer();
		
		
		
		

	}

}
