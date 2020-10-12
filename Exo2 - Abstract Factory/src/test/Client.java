package test;

import AF.*;

public class Client {

	public static void main(String[] args) {
		
		
		
		
		ElementsGraphiqueFactory OGF = new OrdinateurEGraphiqueFactory();
		ElementsGraphiqueFactory TaGF = new TabletteEGraphiqueFactory();
		ElementsGraphiqueFactory TeGF = new TelephoneEGraphiqueFactory();
		
		//Formulaire
		Bouton btn = OGF.creerbouton();
		btn.afficher();
		
		Texte txt = OGF.creerTexte();
		ListeChoix Liste = OGF.creerListeChoix();
		
		
		
		

	}

}
