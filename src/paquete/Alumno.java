package paquete;

public class Alumno {
	private Asignatura asign1;
	private Asignatura asign2;
	private Asignatura asign3;
	
	
	public Alumno (Asignatura asign1, Asignatura asign2, Asignatura asign3) {
		this.asign1 = asign1;
		this.asign2 = asign2;
		this.asign3 = asign3;
	}
	
	public Alumno(int identificador1, int identificador2, int identificador3) {
		this.asign1 = new Asignatura(identificador1);
		this.asign2 = new Asignatura(identificador2);
		this.asign3 = new Asignatura (identificador3);
	}
	
	
	protected Asignatura getAsign1() {
		return asign1;
	}

	protected Asignatura getAsign2() {
		return asign2;
	}

	protected Asignatura getAsign3() {
		return asign3;
	}

	public void setAsign1 (Asignatura asig) {
		asign1 = asig;
	}
	public void setAsing2 (Asignatura asig) {
		asign2 = asig;
	}
	
	public void setAsign3 (Asignatura asig) {
		asign3 = asig;
	}
	

	
}
