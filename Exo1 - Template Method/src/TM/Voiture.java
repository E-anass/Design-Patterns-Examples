package TM;

public class Voiture extends Vehicule {

	@Override
	protected boolean Demarrer() {
		
		System.out.println("Demmarage de voiture");
		return true;
	}

	@Override
	protected void Marcher() {		
		System.out.println("Enfoncer la pédale d'embrayage, placer le levier de boîte de vitesse => Marcher");
	}

	@Override
	protected void Tourner() {
		System.out.println("tourne le guidon => rotation des deux roue en avant");
	}

}
