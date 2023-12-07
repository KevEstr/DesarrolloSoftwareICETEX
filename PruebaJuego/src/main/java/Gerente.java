class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, String cargo, double salarioBase, double bono) {
        super(nombre, cargo, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + bono;
    }
}