package Ejemplo1_Clases;

public class Container<E> {
	private E[] array;
	private int count;

	public Container(int n) {
		// No se puede iniciar un arreglo de tipo genérico, ya que no se sabe cuanto
		// espacio se debe reservar para ese arreglo
		// E[] x = new E[count];

		// Se usa el siguiente artificio, casteando a un arreglo de tipo E(genérico)
		this.array = (E[]) new Object[n];
		this.count = 0;
	}

	public void add(E item) {
		// Si hay espacio en el contenedor
		if (this.count < this.array.length) {
			this.array[count] = item;
			count++;
			// También podemos escribir la línea 20 y 21 como
			// Primero se agrega el elemento y luego count aumenta en uno
			// this.array[count++] = item;
		} else {
			System.out.println("Contenedor lleno ...");
		}
	}

	public String toString() {
		String str = "";
		for (E item : this.array)
			if (item != null)
				str += item + ",\n";
		return str;
	}
}
