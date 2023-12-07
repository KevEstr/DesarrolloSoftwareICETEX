public class Gato extends Animal {
    // Atributos únicos
    private String salto;

    public String getSalto() {
        return salto;
    }

    public void setSalto(String salto) {
        this.salto = salto;
    }

    public Gato(String nombre, String tipo, String alimento, int edad, String salto) {
        super(nombre, tipo, alimento, edad);
        this.salto = salto;
    }
}
