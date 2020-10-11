package CM;

import java.util.Iterator;

public class EmployeClassique implements Employe {

	private String nom;
	private String prenom;
	private String adresse;
	private String service;
	
	private int NombreHeure;
	private float TauxHoraire;
	
	
	
	public EmployeClassique(String nom, String prenom, String adresse, String service, int nombreHeure,
			float tauxHoraire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.service = service;
		NombreHeure = nombreHeure;
		TauxHoraire = tauxHoraire;
	}

	public int getNombreHeure() {
		return NombreHeure;
	}

	public void setNombreHeure(int nombreHeure) {
		NombreHeure = nombreHeure;
	}

	public float getTauxHoraire() {
		return TauxHoraire;
	}

	public void setTauxHoraire(float tauxHoraire) {
		TauxHoraire = tauxHoraire;
	}

	@Override
	public String getnom() {
		return nom;
	}

	@Override
	public void setnom(String nom) {
		this.nom = nom;
	}

	@Override
	public String getprenom() {
		return prenom;
	}

	@Override
	public void setprenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String getadresse() {
		return adresse;
	}

	@Override
	public void seradresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String getservice() {
		return service;
	}

	@Override
	public void setservice(String service) {
		this.service = service;
	}
	
	@Override
	public void print() {
		
		System.out.println(" > I m = "+getnom()+" "+getprenom()+" "+getadresse()+" "+getservice());
			
		
		
	}
	
	
	

}
