package zooAnimales;

import java.util.ArrayList;

public abstract class Animal {
    private static int totalAnimales = 0;
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

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public abstract String totalPorTipo();

    @Override
    public String toString() {
        String ubicacion = (zona != null && zona.zoo != null) ? 
            "la zona en la que me ubico es " + zona.nombre + ", en el " + zona.zoo.getNombre() :
            "no tengo zona asignada";
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + 
               ", habito en " + habitat + " y mi género es " + genero + ", " + ubicacion + ".";
    }
}





