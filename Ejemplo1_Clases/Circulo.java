package Ejemplo1_Clases;

public class Circulo extends Figura {
	static final private double PI = 3.141592653;
	private double radio;

	// Constructor
	public Circulo(String n, double r) {
		super(n);
		this.radio = r;
	}

	// Mutando el método abstracto de la clase padre
	public double area() {
		return PI * Math.pow(this.radio, 2);
	}
}
