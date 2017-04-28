
public class App {

	public static void main(String[] args) {
		Microondas a;
		a = new Microondas();
		a.setMarca("LG");
		//a.setLigado(true);
		//a.onoff();
		//a.setportaFechada(false);
		//a.openclose();
		a.getDesliga();
		a.getAbrirPorta();
		a.onoff();
		System.out.println("Marca: " + a.getMarca());
		System.out.println("Status: " + a.getStatus());
		System.out.println("Porta: " + a.getPorta());
		
		Microondas b;
		b = new Microondas();
		b.setMarca("SAMSUNG");
		//b.setLigado(false);
		//b.onoff();
		//b.setportaFechada(true);
		//b.openclose();
		b.getLiga();
		b.getFecharPorta();
		b.onoff();
		System.out.println("Marca: " + b.getMarca());
		System.out.println("Status: " + b.getStatus());
		System.out.println("Porta: " + b.getPorta());
		
		Microondas c;
		c = new Microondas();
		c.setMarca("BRASTEMP");
		//c.setLigado(false);
		//c.onoff();
		//c.setportaFechada(true);
		//c.openclose();
		c.getLiga();
		c.getAbrirPorta();
		c.onoff();
		System.out.println("Marca: " + c.getMarca());
		System.out.println("Status: " + c.getStatus());
		
	}

}
