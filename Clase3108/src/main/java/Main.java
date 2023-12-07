public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();

        System.out.println(carro1.acelerar(130));
        System.out.println(carro1.frenar(50));

        System.out.println(moto1.acelerar(140));
        System.out.println(moto1.frenar(120));

    }

}
