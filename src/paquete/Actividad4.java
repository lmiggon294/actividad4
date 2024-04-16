package paquete;

public class Actividad4 {

	public static void main(String[] args) {
		Asignatura mat = new Asignatura (1);
		Asignatura len = new Asignatura (2);
		Asignatura tic = new Asignatura (3);
		
		Alumno pepe = new Alumno(mat,len,tic);
			
		Profesor.ponerNotas(pepe);
		System.out.println(String.format("La media de pepe es: %.2f",  Profesor.calcularMedia(pepe)));	
	
	}

}
