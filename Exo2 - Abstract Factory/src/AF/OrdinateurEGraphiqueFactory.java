package AF;

public class OrdinateurEGraphiqueFactory implements ElementsGraphiqueFactory {
	
	
	Bouton btn;
	Texte txt;
	ListeChoix LC;

	@Override
	public Bouton creerbouton() {
		
		if(btn == null)return new OrdinateurBouton();
		
		return btn;
	}

	@Override
	public Texte creerTexte() {
		return null;
	}

	@Override
	public ListeChoix creerListeChoix() {
		return null;
	}


}
