public class Animal {
    private String nombre, tipo, alimento;
    private int edad;

    public Animal(String nombre, String tipo, String alimento, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.alimento = alimento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        if (edad >= 0){
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa");
        }
    }

    public void caminar(){
        System.out.println("El animal está caminando");
    }
}
