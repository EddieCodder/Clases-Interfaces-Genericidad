package Ejemplo1_Clases;

public class Caja<T> {
	protected T dato;
	private String color;

	public Caja(String color) {
		super();
		this.color = color;
	}

	// Al menos un método genérico
	public T getDato() {
		return this.dato;
	}

	public void setDato(T newDato) {
		this.dato = newDato;
	}

	// Método genérico, no siempre va en una clase genérica
	public static <T> void ponEnCaja(T elemento, Caja<T> caja) {
		caja.setDato(elemento);
	}

	public String toString() {

		return "Caja de color: " + color + "\tContiene: " + dato;
	}
}
