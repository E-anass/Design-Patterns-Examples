package AF;

public class TabletteTexte implements Texte{
	
	String texte;
	
	
	
	
	public TabletteTexte(String texte) {
		super();
		this.texte = texte;
	}




	@Override
	public void print() {
		System.out.println("Texte pour Tablette "+texte);
		
	}

}
