package zooAnimales;
import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Pez extends Animal {
	private static List<Pez> listado=new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
		
	}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
		
	}
	public Pez() {
		listado.add(this);
		
	}
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nombre,int edad,String genero,Zona zona){
		Pez salmon=new Pez(nombre,edad,"oceano",genero,zona,"rojo",6);
		salmones++;
		return salmon;
	}
	public static Pez crearSalmon(String nombre,int edad,String genero){
		Pez salmon=new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones++;
		return salmon;
	}
	public static Pez crearBacalao(String nombre,int edad,String genero,Zona zona){
		Pez bacalao=new Pez(nombre,edad,"oceano",genero,zona,"gris",6);
		bacalaos++;
		return bacalao;
	}
	public static Pez crearBacalao(String nombre,int edad,String genero){
		Pez bacalao=new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos++;
		return bacalao;
	}
	public static int cantidadPeces() {
		return listado.size();
	}
	public List<Pez> getListado() {
		return listado;
	}
	public void setListado(List<Pez> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	

}