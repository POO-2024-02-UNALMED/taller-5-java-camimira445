package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
    public static List<Reptil> listado = new ArrayList<>();
    public static int iguanas = 0;
    public static int serpientes = 0;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public static Reptil crearIguana() {
        iguanas++;
        return new Reptil("Iguana", 0, "humedal", "M", "verde", 3);
    }

    public static Reptil crearSerpiente() {
        serpientes++;
        return new Reptil("Serpiente", 0, "jungla", "M", "negro", 2);
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public static int cantidadReptiles() {
        return listado.size();
    }
}
