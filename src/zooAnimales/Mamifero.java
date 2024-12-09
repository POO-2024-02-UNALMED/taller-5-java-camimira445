package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
    public static List<Mamifero> listado = new ArrayList<>();
    public static int caballos = 0;
    public static int leones = 0;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public static Mamifero crearCaballo() {
        caballos++;
        return new Mamifero("Caballo", 0, "pradera", "M", true, 4);
    }

    public static Mamifero crearLeon() {
        leones++;
        return new Mamifero("Leon", 0, "selva", "M", true, 4);
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }
}


