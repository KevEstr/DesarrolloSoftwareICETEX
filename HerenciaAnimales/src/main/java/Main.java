public class Main {

    public static void main(String[] args) {

     Perro perro1 = new Perro("Toby", "Carnivoro", "Concentrado", 12, "Labrador");

     perro1.caminar();
        System.out.println(perro1.getEdad());

     Gato gato1 = new Gato("Otto", "Herbivoro", "Concentrado", 12, "Alto");
     gato1.caminar();
        System.out.println(gato1.getSalto());

    }
}
