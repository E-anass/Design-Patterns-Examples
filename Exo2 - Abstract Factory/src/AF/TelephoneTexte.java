package AF;

public class TelephoneTexte implements Texte {

	String texte;
	
	
	public TelephoneTexte(String texte) {
		super();
		this.texte = texte;
	}


	@Override
	public void print() {
		System.out.println("Texte pour Tablette "+texte);
		}
		
	
	

}
