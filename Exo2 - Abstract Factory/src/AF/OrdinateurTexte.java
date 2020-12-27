package AF;

public class OrdinateurTexte implements Texte {
	
	String texte;
	
	public OrdinateurTexte(String texte) {
		super();
		this.texte = texte;
	}

	@Override
	public void print() {
		System.out.println("Texte pout Ordinateur : "+texte);
		
	}

}
