package zadaca3;

public class MainClass3 {
    public static void main(String []args) {
    	Proizvod p=new Proizvod();
    	System.out.println("Ime na proizvod: " + p.getIme());
    	System.out.println("Proizvoditel: " + p.getProizvoditel());
    	System.out.println("Cena:" + p.getCena() + " denari.");
    	System.out.println("Tezhina: " +p.getTezhina() + " grama.");
    }
}
