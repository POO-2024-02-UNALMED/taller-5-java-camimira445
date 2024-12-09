package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
    private String colorEscamas;
    private boolean venenoso;
    private static ArrayList<Reptil> reptiles = new ArrayList<>();

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.venenoso = venenoso;
        reptiles.add(this);
    }

    public static int cantidadReptiles() {
        return reptiles.size();
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        return new Reptil(nombre, edad, "humedal", genero, "verde", false);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        return new Reptil(nombre, edad, "jungla", genero, "blanco y amarillo", true);
    }
}



