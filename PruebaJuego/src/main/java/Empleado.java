class Empleado {
    protected String nombre;
    protected String cargo;
    protected double salarioBase;

    public Empleado(String nombre, String cargo, double salarioBase) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalarioTotal() {
        return salarioBase;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario base: $" + salarioBase);
    }
}