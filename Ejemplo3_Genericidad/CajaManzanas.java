package Ejemplo3_Genericidad;

public class CajaManzanas extends Caja<Manzana> {

	public int getSabor() {
		return this.dato.getSabor();
	}
}
