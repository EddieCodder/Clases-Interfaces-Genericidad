package Ejemplo1_Clases;

import java.util.Arrays;

public class Curso {
	private Estudiante[] estudiantes;
	private int countEst;

	public Curso() {
		this.countEst = 0;
		this.estudiantes = new Estudiante[10];
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public void matriculaEstudiante(Estudiante nuevoEst) {
		if (this.countEst < 10)
			this.estudiantes[this.countEst++] = nuevoEst;
		else
			System.out.println("Curso sin cupos para matricula de estudiantes....");
	}

	public void listaCurso() {
		int i = 0;
		for (Estudiante e : this.estudiantes) {
			if (e != null) {
				i++;
				System.out.println(i + ". --> " + e + "\t (edad : " + e.obtenerEdad() + ")");
			}
		}
	}

	public void ordenarPorCuotas() {
		Arrays.sort(this.estudiantes, 0, this.countEst); // Hasta countEst -1
	}

}
