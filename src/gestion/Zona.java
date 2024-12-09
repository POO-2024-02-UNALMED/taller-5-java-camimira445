package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private List<Animal> animales;

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimales(Animal animal) {
        this.animales.add(animal);
    }

    public int cantidadAnimales() {
        return this.animales.size();
    }
}


   
