package zooAnimales;
import gestion.Zona;
public class Animal {
	public static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		
		this.totalAnimales++;
		
	}
	public Animal(String nombre, int edad, String habitad, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitad;
		this.genero = genero;
		this.zona = zona;
		this.totalAnimales++;
	}
	public Animal(String nombre, int edad, String habitad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitad;
		this.genero = genero;		
		this.totalAnimales++;
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos()+"\n" +
		"Aves: "+ Ave.cantidadAves()+"\n"+
		"Reptiles: "+Reptil.cantidadReptiles()+"\n" +
		"Peces: "+Pez.cantidadPeces()+"\n"+
		"Anfibios: "+ Anfibio.cantaidadAnfibios();
	
	}
	public String movimiento() {
		return "desplazarse";
	}
	public String toString() {
		if (this.zona==null) {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+
					" y mi genero es "+this.genero;
		}
		else {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+
					" y mi genero es "+this.genero+ ", la zona en la que me ubico es "+ this.zona.getNombre()+
					", en el zoo "+ this.zona.nombreZoo();
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	
}
