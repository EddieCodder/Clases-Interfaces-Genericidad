package Ejemplo1_Clases;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Circulo cir1 = new Circulo("Círculo01", 3);
		Rectangulo r1 = new Rectangulo("Rectángulo01", 10, 3);
		Cuadrado cua1 = new Cuadrado("Cuadrado01", 6);

		// Rectángulo2 se guarda en una variable de tipo Figura
		Figura fig1 = new Rectangulo("Rectángulo02", 20, 60);
		// Cuadrado2 se guarda en una variable de tipo Rectangulo
		Rectangulo cua2 = new Cuadrado("Cuadrado02", 5);

		// EXTRA
		Circulo cir2 = new Circulo("Circulo02", 5);

		Figura[] arregloFiguras = new Figura[6];

		arregloFiguras[0] = cir1;
		arregloFiguras[1] = r1;
		arregloFiguras[2] = cua1;
		arregloFiguras[3] = fig1;
		arregloFiguras[4] = cua2;
		arregloFiguras[5] = new Circulo("Círculo02", 40);

//		Curso eda = new Curso();
//
//		eda.matriculaEstudiante(new Estudiante("0123", "Juan", new Fecha(16, 10, 2003), 30.5));
//		eda.matriculaEstudiante(new Estudiante("1234", "Enrique", new Fecha(23, 5, 2002), 27.3));
//		eda.matriculaEstudiante(new Estudiante("2345", "Samira", new Fecha(14, 3, 2001), 45.56));
//		eda.matriculaEstudiante(new Estudiante("3456", "Lucho", new Fecha(1, 2, 2000), 12.8));
//		eda.matriculaEstudiante(new Estudiante("4567", "Zoyla", new Fecha(3, 11, 2004), 20.1));

		Estudiante[] arregloEstudiantes = { new Estudiante("0123", "Juan", new Fecha(16, 10, 2003), 30.5),
				new Estudiante("1234", "Enrique", new Fecha(23, 5, 2002), 27.3),
				new Estudiante("2345", "Samira", new Fecha(14, 3, 2001), 45.56),
				new Estudiante("3456", "Lucho", new Fecha(1, 2, 2000), 12.8),
				new Estudiante("4567", "Zoyla", new Fecha(3, 11, 2004), 20.1) };

//		System.out.println("~~~~~~~~~~~~~~~~~~~~~ LISTADO DE ESTUDIANTES ~~~~~~~~~~~~~~~~~~~~~~~~~\n");
//		eda.listaCurso();
//
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~ LISTADO DE ESTUDIANTES (POR CUOTAS)~~~~~~~~~~~~~~~~~~~~~~~~~\n");
//		eda.ordenarPorCuotas();
//		eda.listaCurso();

		// Clases predeterminadas de Java que ya cuentan con el método CompareTo
		String[] names = { "Perez", "Sanchez", "Rodriguez" };
		Integer[] enteros = { 12, 34, 56 };

//		mostrar(arregloFiguras);
//		mostrar(arregloEstudiantes);
//		mostrar(names);
//		mostrar(enteros);

//		System.out.println("~~~ LOS MENORES: ");
//		System.out.println("EN ESTUDIANTES :" + menor(arregloEstudiantes));
//		System.out.println("EN FIGURAS :" + menor(arregloFiguras));
//		System.out.println("EN NAMES: " + menor(names));// Por orden alfabético (menor: más cercano a la "A")
//		System.out.println("EN ENTEROS: " + menor(enteros));
//
//		System.out.println();
//		System.out.println("~~~ LOS MAYORES: ");
//		System.out.println("EN ESTUDIANTES :" + mayor(arregloEstudiantes));
//		System.out.println("EN FIGURAS :" + mayor(arregloFiguras));
//		System.out.println("EN NAMES: " + mayor(names));// Por orden alfabético (mayor: más cercano a la "Z")
//		System.out.println("EN ENTEROS: " + mayor(enteros));

//		Container<Integer> contInt = new Container<Integer>(10);
//		Container<Figura> contFig = new Container<Figura>(10);
//
//		contInt.add(10);
//		contInt.add(8);
//		contInt.add(16);
//		contInt.add(34);
//		contInt.add(21);
//
//		contFig.add(cir1);
//		contFig.add(r1);
//		contFig.add(cua1);
//		contFig.add(fig1);
//		contFig.add(cua2);
//		contFig.add(cir2);
//
//		System.out.println(contInt);
//		System.out.println(contFig);

		// Contenedro que tiene una caja que tiene algo --> CONTENEDOR(CAJA(ALGO))
		Container<Caja<Integer>> contCajaInt = new Container<Caja<Integer>>(10);
		Container<Caja<Figura>> contCajaFig = new Container<Caja<Figura>>(10);

		// Para no repetir constantemente el procedimiento de las lineas 99-100-101
		// crearemos un método genérico que incluso nos dará la posibilidad de crear
		// cajas de distintos tipos
//		Caja<Integer> c = new Caja<Integer>("Verde");
//		c.setDato(10);
//		contCajaInt.add(c);

		contCajaInt.add(crearCaja(10, "verde"));
		contCajaInt.add(crearCaja(8, "rojo"));
		contCajaInt.add(crearCaja(12, "amarillo"));
		contCajaInt.add(crearCaja(32, "azul"));
		contCajaInt.add(crearCaja(21, "naranja"));

		contCajaFig.add(crearCaja(cir1, "verde"));
		contCajaFig.add(crearCaja(r1, "negro"));
		contCajaFig.add(crearCaja(cua1, "blanco"));
		contCajaFig.add(crearCaja(fig1, "morado"));
		contCajaFig.add(crearCaja(cua2, "gris"));

		System.out.println(contCajaInt);
		System.out.println(contCajaFig);

	}

	// Método para crear cajas

	// Podemos restringir <T> para que el método pueda ser utilizado por cierto
	// tipos de clases heredadas de una(restringir) . EJEMPLO:
	// Puede que querramos un método solo para clases que sean hijas de una clase:
	// Vehículo
	// Clases Hijas de Vehículo : Auto, Moto, etc.
	// Se restringiría así:
	// public static <T extends Vehiculo> Caja<T> crearCaja(T item, String color)
	public static <T> Caja<T> crearCaja(T item, String color) {
		Caja<T> c = new Caja<T>(color);
		c.setDato(item);
		return c;
	}

	// Método para mostrar arreglo - MUESTRA UN ARREGLO DE CUALQUIER COSA
	public static <T> void mostrar(T[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println(a[i]);
			}
		}
	}

	// Método para menor arreglo - COMPARA CUALQUIER COSA
	// SIEMPRE Y CUANDO TENGA IMPLEMENTADO LA INTERFAZ COMPARABLE
	public static <T extends Comparable<T>> T menor(T[] a) {
		T min = a[0];
		for (T item : a) {
			if (item != null && item.compareTo(min) < 0) {
				min = item;
			}
		}
		return min;
	}

	// Lo mismo que lo anterior pero hallando el mayor
	public static <T extends Comparable<T>> T mayor(T[] a) {
		T max = a[0];
		for (T item : a) {
			if (item != null && item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
