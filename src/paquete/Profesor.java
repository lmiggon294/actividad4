package paquete;

public class Profesor {
	
	public static void ponerNotas(Alumno nota) {
		nota.getAsign1().setCalificacion((double)(Math.random()*10));
		nota.getAsign2().setCalificacion((double)(Math.random()*10));
		nota.getAsign3().setCalificacion((double)(Math.random()*10));
	}
	
	public static double calcularMedia (Alumno media) {
		double total = media.getAsign1().getCalificacion() + media.getAsign2().getCalificacion() + media.getAsign3().getCalificacion();
		return total / 3.0;
	}
	
}
