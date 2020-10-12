package BL;

public class Habitation {
	
	
	private Ville ville;
	private String propriétaire;
	private int NombrePieces;
	private int NombreFenetres;
	
	
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	public String getPropriétaire() {
		return propriétaire;
	}
	public void setPropriétaire(String propriétaire) {
		this.propriétaire = propriétaire;
	}
	public int getNombrePieces() {
		return NombrePieces;
	}
	public void setNombrePieces(int nombrePieces) {
		NombrePieces = nombrePieces;
	}
	public int getNombreFenetres() {
		return NombreFenetres;
	}
	public void setNombreFenetres(int nombreFenetres) {
		NombreFenetres = nombreFenetres;
	}
	

}
