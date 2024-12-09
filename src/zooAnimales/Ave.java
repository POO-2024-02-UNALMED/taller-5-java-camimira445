package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    private String colorPlumas;
    private static ArrayList<Ave> aves = new ArrayList<>();

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        aves.add(this);
    }

    public static int cantidadAves() {
        return aves.size();
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        return new Ave(nombre, edad, "montañas", genero, "café glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        return new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");
    }
}


