package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {

	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		this.estudiantes = new ArrayList<>();
	}

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		String cedulaBuscada = estudiante.getCedula();
		for (Estudiante estudianteEnCurso : estudiantes) {
			if (estudianteEnCurso.getCedula().equals(cedulaBuscada)) {
				return estudianteEnCurso;
			}
		}
		return null;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		Estudiante estudianteExistente = buscarEstudiantePorCedula(estudiante);
		if (estudianteExistente == null) {
			this.estudiantes.add(estudiante);
			System.out.println("Estudiante " + estudiante.getNombre() + " " + estudiante.getApellido()
					+ " matriculado correctamente.");
		} else {
			System.out.println("El estudiante con cédula " + estudiante.getCedula()
					+ " ya se encuentra matriculado en este curso.");
		}
	}

	public double calcularPromedioCurso() {
		int totalEstudiantes = estudiantes.size();

		if (totalEstudiantes == 0) {
			System.out.println("No hay estudiantes matriculados para calcular el promedio del curso.");
			return 0.0;
		}

		double sumaPromedios = 0.0;
		for (Estudiante estudiante : estudiantes) {
			double promedioIndividual = estudiante.calcularPromedioNotasEstudiante();
			sumaPromedios += promedioIndividual;
		}
		double promedioCurso = sumaPromedios / totalEstudiantes;

		return promedioCurso;
	}

	public void mostrar() {
        double promedioGeneral = this.calcularPromedioCurso();
        System.out.printf("Promedio General del Curso: "+ promedioGeneral + " Total de estudiantes matriculados: " + estudiantes.size());
        if (estudiantes.isEmpty()) {
            System.out.println("El curso no tiene estudiantes matriculados.");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println("\n--- ESTUDIANTE ---");
                estudiante.mostrar(); 
            }
        }
    }

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
