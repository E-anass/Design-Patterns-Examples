package AF;

import java.util.List;

public class TabletteEGraphiqueFactory implements ElementsGraphiqueFactory {

	
	static TabletteEGraphiqueFactory OGF;
	
	
	public static TabletteEGraphiqueFactory getInstance(){	
		 
		if(OGF == null)
			OGF = new TabletteEGraphiqueFactory();
		
		return OGF;
	}
	
	
	@Override
	public Bouton creerbouton(int color,String value) {
		return new TabletteBouton(color,value);
	}

	@Override
	public Texte creerTexte(String texte) {			
		return new TabletteTexte(texte);
	}

	@Override
	public ListeChoix creerListeChoix(List<String> List) {
		return new TabletteListeChoix(List);
	}

}
