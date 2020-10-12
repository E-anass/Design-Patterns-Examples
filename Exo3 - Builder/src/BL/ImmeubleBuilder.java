package BL;

public class ImmeubleBuilder extends HabitationBuilder{

	@Override
	void CreerPieces(int pieces) {		
		habitation.setNombreFenetres(pieces);	
		System.out.println("ImmeubleBuilder "+pieces+" pieces sont crees");
	}

	@Override
	void CreerFenetres(int fenetres) {
		habitation.setNombreFenetres(fenetres);
		System.out.println("ImmeubleBuilder "+fenetres+" fenetres sont crees");
	}





}
