class Desarrollador extends Empleado {
    private int horasExtra;

    public Desarrollador(String nombre, String cargo, double salarioBase, int horasExtra) {
        super(nombre, cargo, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + horasExtra * 20; // Supongamos que cada hora extra suma $20 al salario
    }
}
