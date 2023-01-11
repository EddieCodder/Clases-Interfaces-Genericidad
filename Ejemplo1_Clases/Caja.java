package Ejemplo1_Clases;

public class Caja<T> {
	protected T dato;
	private String color;

	public Caja(String color) {
		super();
		this.color = color;
	}

	// Al menos un m�todo gen�rico
	public T getDato() {
		return this.dato;
	}

	public void setDato(T newDato) {
		this.dato = newDato;
	}

	// M�todo gen�rico, no siempre va en una clase gen�rica
	public static <T> void ponEnCaja(T elemento, Caja<T> caja) {
		caja.setDato(elemento);
	}

	public String toString() {

		return "Caja de color: " + color + "\tContiene: " + dato;
	}
}
