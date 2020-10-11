package AD;

public class AdapterPDF implements Document{
	
	ComposantPDF composantPDF;
	
	
	
	

	public AdapterPDF(ComposantPDF composantPDF) {
		super();
		this.composantPDF = composantPDF;
	}
	
	@Override
	public void afficheDocument() {
		
		composantPDF.afficheNom();
		composantPDF.afficheVersion();
		
	}

}
