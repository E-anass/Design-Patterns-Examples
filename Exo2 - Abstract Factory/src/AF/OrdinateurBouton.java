package AF;

public class OrdinateurBouton implements Bouton {

	
	
		
	int color;
	String value;
	
	

	public OrdinateurBouton(int color, String value) {
		super();
		this.color = color;
		this.value = value;
	}



	@Override
	public void afficher() {
		System.out.println("Bouton pour Ordinateur : couleur " + color + " value "+value);
		
	}

}
