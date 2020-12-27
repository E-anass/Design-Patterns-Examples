package AF;

public class TabletteBouton implements Bouton{
	
	
	int color;
	String value;

	public TabletteBouton(int color, String value) {
		this.color = color;
		this.value = value;
	}

	@Override
	public void afficher() {
		System.out.println("Bouton pour Tablette : couleur " + color + " value "+value);
		
	}

}
