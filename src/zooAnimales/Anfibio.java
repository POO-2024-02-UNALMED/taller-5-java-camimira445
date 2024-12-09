package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
    public static List<Anfibio> listado = new ArrayList<>();
    public static int ranas = 0;
    public static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public static Anfibio crearRana() {
        ranas++;
        return new Anfibio("Rana", 0, "selva", "M", "verde", false);
    }

    public static Anfibio crearSalamandra() {
        salamandras++;
        return new Anfibio("Salamandra", 0, "selva", "M", "negro y amarillo", true);
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public static int cantidadAnfibios() {
        return listado.size();
    }
}
