package BL;

public class Ville {
	
	private String nom;
	private int CodePostal;
	
	
	
	public Ville(String nom, int codePostal) {
		super();
		this.nom = nom;
		CodePostal = codePostal;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCodePostal() {
		return CodePostal;
	}
	public void setCodePostal(int codePostal) {
		CodePostal = codePostal;
	}
	
	

}
