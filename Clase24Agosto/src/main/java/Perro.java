public class Perro extends Animal{
    // Atributos
    private String tipoLadrido;

    public String getTipoLadrido() {
        return tipoLadrido;
    }

    public void setTipoLadrido(String tipoLadrido) {
        this.tipoLadrido = tipoLadrido;
    }

    public Perro(String nombre, String tipoAlimentacion, String alimentacion, int edad, String tipoLadrido) {
        super(nombre, tipoAlimentacion, alimentacion, edad);
        this.tipoLadrido = tipoLadrido;
    }
}
