package Ejemplo2_Interfaces;

public class Coche implements VehiculoTerrestre {
	private int numRuedas;

	public Coche(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	// Implementando el m�todo abstracto de la interfaz VehiculoTerrestre
	public int getNumRuedas() {
		return this.numRuedas;
	}
}
