package ejerciciosEx1;

public class Persona {

	private String nombre;
	private String apellido;
	private int anoNacimiento;
	/*No usaremos el constructor por defecto, asi que crearemos uno
	 * que reciba unos parametros escritos por teclado desde la clase
	 *UsoPersona.
	 */
	public Persona(String nombre, String apellido, int anoNacimiento) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.anoNacimiento = anoNacimiento;
	}
	/*Usaremos el metodo get del año de nacimiento para comparar las edades
	*de las personas que vamos metiendo en la clase uso persona.
	*/
	public int getAnoNacimiento() {
		return anoNacimiento;
	}

	//Obtendremos la edad restando el año de nacimiento al año actual.
	public int getEdad(int ano, int anoActual) {
		
		int edad = anoActual - ano;
		
		return edad;
	}
	
	public String toString() {
		String datos;
		datos = this.nombre + " " + apellido + "  (" + anoNacimiento + ") ";	
		return datos;
	}
}
