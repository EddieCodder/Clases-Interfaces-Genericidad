package Ejemplo3_Genericidad;

public class Caja<T> {
	protected T dato;

	public Caja() {
		super();
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
}
