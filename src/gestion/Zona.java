public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<>();

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }

    public int cantidadAnimales() {
        return animales.size();
    }
}

   
