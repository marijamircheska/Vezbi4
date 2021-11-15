package zadaca4;

public class MainClass4 {

	public static void main(String[] args) {
		Avtomobil avtomobil = new Avtomobil("Audi", "A4", 153535, "Crna");

		System.out.println("Marka: " + avtomobil.getMarka());
		System.out.println("Model: " + avtomobil.getModel());
		System.out.println("Kilometri pred mnozhenje: " + avtomobil.getPominatiKm());
		System.out.println("Kilometri posle mnozhenje: " + avtomobil.mnozenjeKm(5));
		System.out.println("Boja: " + avtomobil.getBoja());
	}
}