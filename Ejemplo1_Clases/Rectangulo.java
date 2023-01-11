package Ejemplo1_Clases;

public class Rectangulo extends Figura {
	private double largo;
	private double ancho;

	public Rectangulo(String n, double l, double a) {
		super(n);
		this.largo = l;
		this.ancho = a;
	}

	public double area() {
		return this.largo * this.ancho;
	}

}
