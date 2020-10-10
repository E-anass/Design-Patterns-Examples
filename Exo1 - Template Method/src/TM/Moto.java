package TM;

public class Moto extends Vehicule{

	@Override
	protected boolean Demarrer() {
		System.out.println("Demmarage du moto");
		return true;
	}

	@Override
	protected void Marcher() {
		System.out.println("tournez la poignée droite");
	}

	@Override
	protected void Tourner() {
		System.out.println("tourne le guidon => rotation de la roue en avant");
	}

}
