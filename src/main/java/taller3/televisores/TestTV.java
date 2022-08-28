package taller3.televisores;

public class TestTV {
	public static void main(String[] args) {
		Marca marca1 = new Marca("Semsung");
	    Marca marca2 = new Marca("Lj");
		
	    TV tv1 = new TV(marca1, true);
	    TV tv2 = new TV(marca2, true);
	    TV tv3 = new TV(marca2, false);

	    tv1.setPrecio(2000);
	    tv2.setCanal(90);
	    tv1.setCanal(121);
		tv2.setVolumen(7);
		tv2.volumenUp();
		System.out.println(tv2.getVolumen());
		tv2.volumenDown();
		System.out.println(tv2.getVolumen());
		
		Control control1 = new Control();
		control1.enlazar(tv2);
		control1.turnOff();
		control1.setCanal(50);
		control1.turnOn();
		control1.canalUp();
		//control1.volumenUp();
		control1.volumenDown();
		TV.setNumTV(0);
		
	    System.out.println(tv2.getVolumen());
	    System.out.println(tv2.getEstado());
	    System.out.println(tv1.getPrecio());
	    System.out.println(tv1.getMarca().getNombre());
	    System.out.println(tv1.getCanal());
	    System.out.println(TV.getNumTV());

	}
}