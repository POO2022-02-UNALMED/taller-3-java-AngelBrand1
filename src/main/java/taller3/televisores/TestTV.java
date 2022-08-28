package taller3.televisores;

public class TestTV {
	public static void main(String[] args) {
		Marca marca =  new Marca("Semsung");
		TV tv1 =  new TV(marca, true);
		
		tv1.setCanal(100);
		tv1.canalDown();
		
		TV tv2 =  new TV(marca, false);
		Control control =  new Control();
		control.enlazar(tv2);
		control.setCanal(50);
		control.turnOn();
		control.canalUp();
		
		TV tv3 =  new TV(marca, false);
		tv2.setCanal(121);
		
	    System.out.println(tv1.getCanal());
	    System.out.println(tv2.getCanal());
	    System.out.println(tv3.getCanal());
	    System.out.println(tv1.getMarca().getNombre());
	    System.out.println(tv1.getCanal());
	    System.out.println(TV.getNumTV());

	}
}