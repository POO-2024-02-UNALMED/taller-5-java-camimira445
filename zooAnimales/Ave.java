package zooAnimales;
import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Ave extends Animal {
	private static List<Ave> listado=new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(){
		listado.add(this);
	}

	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
		listado.add(this);
		
	}
	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
		
	}
	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String nombre,int edad,String genero,Zona zona){
		Ave ave=new Ave(nombre,edad,"montanas",genero,zona,"cafe glorioso");
		halcones++;
		return ave;
	}
	public static Ave crearHalcon(String nombre,int edad,String genero){
		Ave ave=new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
		return ave;
	}
	public static Ave crearAguila(String nombre,int edad,String genero,Zona zona){
		Ave ave=new Ave(nombre,edad,"montanas",genero,zona,"blanco y amarillo");
		aguilas++;
		return ave;
	}
	public static Ave crearAguila(String nombre,int edad,String genero){
		Ave ave=new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return ave;
	}
	public static int cantidadAves() {
		return listado.size();
	}

	public List<Ave> getListado() {
		return listado;
	}

	public void setListado(List<Ave> listado) {
		this.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
}