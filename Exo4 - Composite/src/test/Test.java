package test;

import java.util.ArrayList;
import java.util.List;

import CM.*;

public class Test {

	public static void main(String[] args) {
		
		Employe Employe1 = new EmployeClassique("nom1", "john", "adresse1", " DRH", 3,	(float) 0.5);
		Employe Employe2 = new EmployeClassique("nom2", "julie", "adresse2", "comptabilité", 3,	(float) 0.5);
		
		Employe Manager1 = new Manager("nom3", "fabrice", "adresse", "Informatique", (float) 0.6, new ArrayList<Employe>());
		((Manager) Manager1).AjouterEmploye(Employe1);
		((Manager) Manager1).AjouterEmploye(Employe2);	
		((Manager) Manager1).print();
		
		Employe CEO = new Manager("nom3", "olivier", "adresse", "Informatique", (float) 0.6, new ArrayList<Employe>());
		((Manager) CEO).AjouterEmploye(Employe1);
		((Manager) CEO).AjouterEmploye(Employe2);	
		((Manager) CEO).print();
		
		

	}

}
