package BL;

public class MaisonsIndividuelleBuilder extends HabitationBuilder{

	@Override
	void CreerPieces(int pieces) {
		
		habitation.setNombreFenetres(pieces);	
		System.out.println("MaisonsIndividuelleBuilder " + pieces+" pieces sont crees");
	}

	@Override
	void CreerFenetres(int fenetres) {
		
		habitation.setNombreFenetres(fenetres);
		System.out.println("MaisonsIndividuelleBuilder " + fenetres+" fenetres sont crees");
		
	}


}
