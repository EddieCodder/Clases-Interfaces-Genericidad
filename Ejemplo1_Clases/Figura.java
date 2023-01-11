package Ejemplo1_Clases;

public abstract class Figura implements Comparable<Figura> {
	// Atributos
	private String nombre;

	// Métodos abstractos (mínimo 1)
	abstract public double area();

	// Constructor
	// No puede ser inicializado directamente (Solo las clases derivadas a Figura)
	public Figura(String n) {
		this.nombre = n;
	}

	// Métodos normales de clase //Final: Método no puede ser modificado
	final public double compArea(Figura b) {
		return area() - b.area();
	}

	final public String toString() {
		return this.nombre + "\tde área = " + area();
	}

	public int compareTo(Figura f) {
		if (compArea(f) > 0)
			return 1;
		if (compArea(f) < 0)
			return -1;
		return 0;
	}
}
