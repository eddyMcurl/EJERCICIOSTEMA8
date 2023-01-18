package tema8;

public class ejr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona persona= new persona();
		persona.setNombre("maria");
		persona.setEdad(24);
		persona.setTelefono(981123456);
		
		System.out.println("NOMBRE "+persona.getNombre());
		System.out.println("EDAD "+persona.getEdad());
		System.out.println("TELEFONO "+persona.getTelefono());
	}

}
class persona{
	private int edad;
	private String nombre;
	private int telefono;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}