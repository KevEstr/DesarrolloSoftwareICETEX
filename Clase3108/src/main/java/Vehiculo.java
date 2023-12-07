public interface Vehiculo {
    int VELOCIDAD_MAXIMA_CARRO = 120;
    int VELOCIDAD_MAXIMA_MOTO = 140;
    String frenar(int vel);
    String acelerar(int vel);
}
