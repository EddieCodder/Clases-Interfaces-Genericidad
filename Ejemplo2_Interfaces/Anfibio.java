package Ejemplo2_Interfaces;

public class Anfibio implements VehiculoTerrestre, VehiculoAcuatico {
	private int numRuedas;
	private double longEslora;

	public Anfibio(int numRuedas, double longEslora) {
		this.numRuedas = numRuedas;
		this.longEslora = longEslora;
	}

	// M�TODOS ABSTRACTOS DE LAS INTERFACES
	public int getNumRuedas() {
		return this.numRuedas;
	}

	public double getLongEslora() {
		return this.longEslora;
	}

}
