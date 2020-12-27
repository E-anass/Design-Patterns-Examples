package AF;

import java.util.List;

public class TelephoneEGraphiqueFactory implements ElementsGraphiqueFactory {
	
	
	static TelephoneEGraphiqueFactory OGF;
	
	
	public static TelephoneEGraphiqueFactory getInstance(){	
		 
		if(OGF == null)
			OGF = new TelephoneEGraphiqueFactory();
		
		return OGF;
	}
	
	@Override
	public Bouton creerbouton(int color,String value) {
		return new TelephoneBouton(color,value);
	}

	@Override
	public Texte creerTexte(String texte) {			
		return new TelephoneTexte(texte);
	}

	@Override
	public ListeChoix creerListeChoix(List<String> List) {
		return new TelephoneListeChoix(List);
	}



}
