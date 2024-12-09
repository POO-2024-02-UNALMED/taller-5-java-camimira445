package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
    public static List<Ave> listado = new ArrayList<>();
    public static int halcones = 0;
    public static int aguilas = 0;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public static Ave crearHalcon() {
        halcones++;
        return new Ave("Halcón", 0, "montañas", "M", "café");
    }

    public static Ave crearAguila() {
        aguilas++;
        return new Ave("Águila", 0, "montañas", "M", "blanco y amarillo");
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public static int cantidadAves() {
        return listado.size();
    }
}




