package taller3.televisores;

public class Control {
	private TV tv;

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	
	//metodos 
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void voluemenDown() {
		this.tv.voluemenDown();
	}
	
	public void setCanal(int canal) {
		this.tv.setCanal(canal>=1 && canal<=120?canal:this.tv.getCanal());
	}
}
