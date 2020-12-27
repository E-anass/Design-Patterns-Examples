package test;

import BL.*;

public class Client {

	public static void main(String[] args) {
		
		HabitationBuilder MaisonsIndividuelleBuilder = new MaisonsIndividuelleBuilder();
		IngenieurCivil ingenieurCivil_Maxime = new IngenieurCivil(MaisonsIndividuelleBuilder);
		ingenieurCivil_Maxime.creerHabitation(2,4);
		Habitation maisonsIndividuelle = ingenieurCivil_Maxime.getHabitation();
	
		
		HabitationBuilder ImmeublehabitationBuilder = new ImmeubleBuilder();
		IngenieurCivil ingenieurCivil_Olivier = new IngenieurCivil(ImmeublehabitationBuilder);
		ingenieurCivil_Olivier.creerHabitation(3,5);
		Habitation Immeuble = ingenieurCivil_Olivier.getHabitation();
		
		

		

	}

}
