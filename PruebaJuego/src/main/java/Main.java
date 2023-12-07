public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", "Gerente de Proyecto", 50000.0, 10000.0);
        Desarrollador desarrollador = new Desarrollador("Juan", "Desarrollador", 40000.0, 10);

        System.out.println("Información del gerente:");
        gerente.mostrarInformacion();
        System.out.println("Salario total: $" + gerente.calcularSalarioTotal());

        System.out.println("\nInformación del desarrollador:");
        desarrollador.mostrarInformacion();
        System.out.println("Salario total: $" + desarrollador.calcularSalarioTotal());
    }
}









