package zadaca2;

public class MainClass2 {

	public static void main(String[] args) {
	Restoran rest= new Restoran ();
	rest.setIme("Bianco Kitchen & Bar");
	rest.setLokacija("Prilep");
	rest.setTelefon("076 816 743");
	rest.setBrsedishta("50");

	
	System.out.println("Kontakt telefonot na restoranot " + rest.getIme() + " koj se naogja vo " + rest.getLokacija() + " e: " + rest.getTelefon());
	System.out.println("Restoranot ima kapacitet od: " + rest.getBrsedishta() + " sedishta.");
	}

}
