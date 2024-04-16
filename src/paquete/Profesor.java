package paquete;

import java.util.Random;

public class Profesor {
	
	public static void ponerNotas(Alumno nota) {
		
		Random random = new Random();
		
		nota.getAsign1().setCalificacion(random.nextDouble(0, 10));
		nota.getAsign2().setCalificacion(random.nextDouble(0, 10));
		nota.getAsign3().setCalificacion(random.nextDouble(0, 10));
	}
	
	public static double calcularMedia (Alumno media) {
		double total = media.getAsign1().getCalificacion() + media.getAsign2().getCalificacion() + media.getAsign3().getCalificacion();
		return total / 3.0;
	}
	
}
