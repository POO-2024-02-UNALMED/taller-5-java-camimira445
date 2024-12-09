package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    private static int ranas;
    private static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "verde", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "humedal", genero, "negro y amarillo", false);
    }

    @Override
    public String totalPorTipo() {
        return "Anfibios: " + listado.size();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
}



