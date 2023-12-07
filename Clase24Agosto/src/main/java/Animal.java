public class Animal {
    // Atributos
    private String nombre;
    private String tipoAlimentacion;
    private String alimentacion;
    private int edad;

    public Animal(String nombre, String tipoAlimentacion, String alimentacion, int edad) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.alimentacion = alimentacion;
        this.edad = edad;
    }

    public void caminar(){
        System.out.println("El animal está caminando");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
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

}
