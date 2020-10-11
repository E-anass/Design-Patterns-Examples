package Test;

import AD.AdapterPDF;
import AD.ComposantPDF;
import AD.Document;
import AD.DocumentHTML;
import AD.DocumentTexte;

public class Entreprise {

	public static void main(String[] args) {
	
		
		Document HTML = new DocumentHTML();
		Document TEXTE = new DocumentTexte(); 
		ComposantPDF composantPDF = new ComposantPDF();
		Document PDF = new AdapterPDF(composantPDF);
		
		HTML.afficheDocument();
		TEXTE.afficheDocument();
		PDF.afficheDocument();

	}

}
