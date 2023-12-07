public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Juan", "Carnivoro", "Carnes", 12);

        System.out.println(animal1.getEdad());
        animal1.setEdad(-2);
        System.out.println(animal1.getEdad());

        Animal animal2 = new Animal("Pepe", "Herbivoro", "Frutas",8);

        animal1.setNombre("Pepe");

        if (animal1.getNombre().equals(animal2.getNombre())){
            System.out.println("Ambos animales se llaman igual");
        } else {
            System.out.println("Ambos animales se llaman distinto");
        }

        Perro perro1 = new Perro("Pepito", "Carnivoro", "Concentrado", 12, "Alto");
        perro1.caminar();
        System.out.println(perro1.getNombre());
        System.out.println(perro1.getTipoLadrido());

    }
}
