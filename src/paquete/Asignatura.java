package paquete;
/**
 * <h2>Clase Asignatura</h2>
 * Representa una asignatura
 * @version 0.01
 * @author lmiggon294@g.educaand.es
 * @since 04/2024
 */
public class Asignatura {
	/**
	 * Atributo identificador
	 */
	private int identificador;
	/**
	 * Atributo calificacion
	 */
	private double calificacion;
	
	
	public Asignatura (int identificador){
		this.identificador = identificador;
	}

	protected int getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	protected double getCalificacion() {
		return calificacion;
	}

	protected void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	
	
}
