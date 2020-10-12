package BL;

public abstract class HabitationBuilder {
	
	
	public Habitation habitation = new Habitation();


	public Habitation getHabitation() {
		return habitation;	
	}
	
	
	abstract void CreerPieces(int pieces);
	abstract void CreerFenetres(int fenetres);
	

}
