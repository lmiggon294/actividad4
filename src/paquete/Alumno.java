package paquete;

public class Alumno {
	private Asignatura asign1;
	private Asignatura asign2;
	private Asignatura asign3;
	private String nombre;
	private int anio_nac;
	private String dni;
	
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
	
	public Alumno(int identificador1, int identificador2, int identificador3, String nombre, String dni, int anio_nac) {
		this.nombre = nombre;
		this.dni = (comprobarDNI(dni)) ? dni : "12345678A";
		this.anio_nac = anio_nac;
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

	protected String getNombre() {
		return nombre;
	}

	protected int getAnio_nac() {
		return anio_nac;
	}

	protected String getDni() {
		return dni;
	}
	
	protected boolean comprobarDNI(String dni) {
		if(!dni.matches("^[0-9]{8}[A-Z]$")) return false;
		char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		int total = 0;
		for(int i=0; i<dni.length(); i++) {
			total += dni.charAt(i);
			
		}
		total = total%23;
		
		if(dni.charAt(8) == letrasDNI[total]) return true;
		else return false;
		
	}
	
	

	
}
