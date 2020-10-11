package CM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employe {
	
	private String nom;
	private String prenom;
	private String adresse;
	private String service;
	
	private float salaireMensuel;
	
	
	
	public Manager(String nom, String prenom, String adresse, String service, float salaireMensuel,
			List<Employe> employees) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.service = service;
		this.salaireMensuel = salaireMensuel;
		Employees = employees;
	}

	public float getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(float salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	List<Employe> Employees = new ArrayList<Employe>();
	
	
	public void AjouterEmploye(Employe employe){	
		Employees.add(employe);
	}
	
	public void SupprimerEmploye(Employe employe) {
		Employees.remove(employe);
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
	public String toString() {
		return "Nom " + getnom() +
				", Prenom " + getprenom() +
				", adresse " + getadresse() +
				", Service " + getservice();
	}
	
	
	@Override
	public void print() {
		
		System.out.println(" -> I m = "+getnom()+" "+getprenom()+" "+getadresse()+" "+getservice()+" Les employes sous ma responsabilité :");
		
		Iterator<Employe> employeeIterator = Employees.iterator();
	    while(employeeIterator.hasNext()){
	     Employe employee = employeeIterator.next();
	     employee.print();
	    }	
		
		
	}
	
	



}
