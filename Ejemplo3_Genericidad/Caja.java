package Ejemplo3_Genericidad;

public class Caja<T> {
	protected T dato;

	public Caja() {
		super();
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
}
