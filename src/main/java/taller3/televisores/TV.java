package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = this.estado==true && canal>=1 && canal<=120?canal:this.canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int v) {
		this.volumen = v>=0 && v<=7 && this.estado==true?v:this.volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int num) {
		numTV = num;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	//metodos
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		this.canal = this.canal<120 && this.estado == true?this.canal+1:this.canal;
	}
	
	public void canalDown() {
		this.canal = this.canal>1 && this.estado == true?this.canal-1:this.canal;
	}
	
	public void volumenUp() {
		this.volumen = this.volumen<7 && this.estado == true?this.volumen+1:this.volumen;
	}
	
	public void volumenDown() {
		this.volumen = this.volumen>1 && this.estado == true?this.volumen-1:this.volumen;
	}
}
