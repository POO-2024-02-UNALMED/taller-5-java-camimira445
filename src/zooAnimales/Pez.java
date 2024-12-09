

package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal {
    public static List<Pez> listado = new ArrayList<>();
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        listado.add(this);
    }

    public static Pez crearSalmon() {
        salmones++;
        return new Pez("Salmón", 0, "océano", "M", "rojo");
    }

    public static Pez crearBacalao() {
        bacalaos++;
        return new Pez("Bacalao", 0, "océano", "M", "gris");
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public static int cantidadPeces() {
        return listado.size();
    }
}
