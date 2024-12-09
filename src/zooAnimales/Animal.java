package zooAnimales;

import gestion.Zona;

public class Animal {
    public static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static int totalPorTipo() {
        return totalAnimales;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo " + edad + " años, y vivo en " + habitat;
    }
}
