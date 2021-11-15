package zadaca1;

public class MainClass {

	public static void main(String[] args) {
		Covek c= new Covek ();
		c.setIme("Marija");
		c.setPrezime("Mircheska");
		c.setEmbg("220900144502x");
		
		System.out.println("Ime: " + c.getIme());
		System.out.println("Prezime " + c.getPrezime());
		System.out.println("EMBG: " + c.getEmbg());

	}

}
