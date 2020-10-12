package BL;

public class IngenieurCivil {
	
	   private HabitationBuilder habitationBuilder;
	   
	    public IngenieurCivil(HabitationBuilder habitationBuilder)
	    {
	        this.habitationBuilder = habitationBuilder;
	    }
	 
	    public Habitation getHabitation()
	    {
	        return this.habitationBuilder.getHabitation();
	    }
	 
	    public void creerHabitation( int fenetres, int Pieces)
	    {
	    	
	        this.habitationBuilder.CreerFenetres(fenetres);
	        this.habitationBuilder.CreerPieces(Pieces);
	    }

}
