package Ejemplo3_Genericidad;

public class Principal {

	public static void main(String[] args) {
		// CLASE PARAMETRIZADA O GENÉRICA <INTEGER>
		Caja<Integer> c1 = new Caja<Integer>();
		c1.setDato(new Integer(15));
		Integer dato1 = c1.getDato();
		System.out.println("Contenido de la caja1 = " + dato1);

		// CLASE PARAMETRIZADA O GENÉRICA <STRING>
		Caja<String> c2 = new Caja<String>();
		c2.setDato("Cadena de texto");
		String dato2 = c2.getDato();
		System.out.println("Contenido de la caja2 = " + dato2);

		// EJEMPLO DE MÉTODO GENÉRICO
		Caja<Integer> c3 = new Caja<Integer>();
		Caja.ponEnCaja(new Integer(20), c3);// Método genérico y estático
	}

}
