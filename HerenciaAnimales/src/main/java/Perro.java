public class Perro extends Animal {
    // Atributos
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Perro(String nombre, String tipo, String alimento, int edad, String raza) {
        super(nombre, tipo, alimento, edad);
        this.raza = raza;
    }
}
