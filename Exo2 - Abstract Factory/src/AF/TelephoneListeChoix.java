package AF;

import java.util.ArrayList;
import java.util.List;

public class TelephoneListeChoix implements ListeChoix{

	List<String> listechoix = new ArrayList<>();
	
	public TelephoneListeChoix(List<String> listechoix) {
		this.listechoix = listechoix;
	}

	@Override
	public void afficher() {
		System.out.println("Liste pour Ordinateur : ");
		for(String element : listechoix) {
			
			System.out.println(element);
			
		}
		
	}

}
