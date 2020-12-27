package AF;

import java.util.List;

public class OrdinateurEGraphiqueFactory implements ElementsGraphiqueFactory {
	
	Bouton btn;
	Texte txt;
	ListeChoix LC;
	
	static OrdinateurEGraphiqueFactory OGF;
	
	
	public static OrdinateurEGraphiqueFactory getInstance(){	
		 
		if(OGF == null)
			OGF = new OrdinateurEGraphiqueFactory();
		
		return OGF;
	}

	@Override
	public Bouton creerbouton(int color,String value) {
		return new OrdinateurBouton(color,value);
	}

	@Override
	public Texte creerTexte(String texte) {			
		return new OrdinateurTexte(texte);
	}

	@Override
	public ListeChoix creerListeChoix(List<String> List) {
		return new OrdinateurListeChoix(List);
	}


}
