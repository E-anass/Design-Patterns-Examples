package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import AF.*;

public class Client {

	public static void main(String[] args) {
		
		ElementsGraphiqueFactory OGF = OrdinateurEGraphiqueFactory.getInstance();
		
		ElementsGraphiqueFactory TaGF = TabletteEGraphiqueFactory.getInstance();
		
		ElementsGraphiqueFactory TeGF = TelephoneEGraphiqueFactory.getInstance();
		
		//Formulaire
		Bouton btn = OGF.creerbouton(12345,"email");
		
		Texte txt = OGF.creerTexte("hello");
		
		List<String> strings = new ArrayList<>(Arrays.asList(
			    "A",
			    "B",
			    "C"
			));
		
		ListeChoix Liste = OGF.creerListeChoix(strings);
		
		btn.afficher();
		txt.print();
		Liste.afficher();
		
		//
		
		

	}

}
