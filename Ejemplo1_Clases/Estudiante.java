package Ejemplo1_Clases;

public class Estudiante implements Comparable<Estudiante> {
	private String codigo;
	private String nombre;
	private Fecha fecNac;
	private double cuota;

	public Estudiante() {
		this(null, null, null, 0);
	}

	public Estudiante(String codigo, String nombre, Fecha fecnac, double cuota) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fecNac = fecnac;
		this.cuota = cuota;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha getFechaNac() {
		return fecNac;
	}

	public void setFecNac(Fecha fecNac) {
		this.fecNac = fecNac;
	}

	@Override
	public String toString() {
		return String.format("Codigo: %s | Nombre: %s \t| Fecha de Nacimiento: %s (edad: %d) \t| Cuota: %.2f",
				this.codigo, this.nombre, this.fecNac.toString(), this.obtenerEdad(), this.cuota);
	}

	public int obtenerEdad() {
		// int longFecNac = this.fecNac.toString().length();
		int anio = this.fecNac.getAnio();
		// String anio = this.fecNac.toString().substring(longFecNac - 4, longFecNac);
		// return 2022 - Integer.parseInt(anio);
		return 2022 - anio;
	}

	public int compareTo(Estudiante e) {
//		// Si se trabaja con Strings
//		// Los Strings al ser una clase de Java ya cuentan con CompareTo
//		return this.nombre.compareTo(e.nombre);

		// Si se trabaja con enteros
		return this.obtenerEdad() - e.obtenerEdad();

//		// Si se trabaja con double
//		if (this.cuota > e.cuota)
//			return 1;
//		if (this.cuota > e.cuota)
//			return 1;
//		return 0;

	}
}
