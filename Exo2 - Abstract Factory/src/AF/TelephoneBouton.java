package AF;

public class TelephoneBouton implements Bouton{
	
	int color;
	String value;
	

	public TelephoneBouton(int color, String value) {
		super();
		this.color = color;
		this.value = value;
	}



	@Override
	public void afficher() {
		System.out.println("Bouton pour Telephone : couleur " + color + " value "+value);
		
	}

}
