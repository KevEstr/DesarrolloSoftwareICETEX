public class Carro implements Vehiculo {
    int velocidad = 0;

    @Override
    public String frenar(int vel) {
        velocidad = velocidad - vel;
        // 80
        return "El carro ha frenado y va a" + velocidad + "km/h";
    }

    @Override
    public String acelerar(int vel) {
        String cadena = "";
        velocidad = velocidad + vel;

        if (velocidad > VELOCIDAD_MAXIMA_CARRO)
            cadena = "Exceso de Velocidad ";
        cadena = cadena + "El coche ha acelerado: " + velocidad + "km/h";
        return cadena;
    }
}
