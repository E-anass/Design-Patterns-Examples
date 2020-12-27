package AF;

import java.util.List;

public interface ElementsGraphiqueFactory {
	

	
	public Bouton creerbouton(int Color,String value);
	public Texte creerTexte(String texte);
	public ListeChoix creerListeChoix(List<String> List);

}
