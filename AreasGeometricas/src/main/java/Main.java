class Calculadora {
    int sumar(int a, int b) {
        return a + b;
    }

    int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado2Parametros = calculadora.sumar(5, 7);
        System.out.println("Suma de 2 enteros: " + resultado2Parametros); // Salida: "Suma de 2 enteros: 12"

        int resultado3Parametros = calculadora.sumar(3, 6, 9);
        System.out.println("Suma de 3 enteros: " + resultado3Parametros); // Salida: "Suma de 3 enteros: 18"
    }
}