package TM;

public class Quad extends Vehicule {

	@Override
	protected boolean Demarrer() {
		System.out.println("Demmarage du Quad");
		return true;
	}

	@Override
	protected void Marcher() {
		System.out.println("tournez la poignée droite");
	}

	@Override
	protected void Tourner() {
		System.out.println("tourne le guidon => rotation des deux roue en avant");		
	}
	
	
	

}
