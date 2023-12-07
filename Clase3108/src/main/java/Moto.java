public class Moto implements Vehiculo{
    int velocidad = 0;

    @Override
    public String acelerar(int vel) {
        String cadena = "";
        velocidad = velocidad + vel;

        if (velocidad > VELOCIDAD_MAXIMA_MOTO)
            cadena = "Exceso de Velocidad ";
        cadena = cadena + "La moto ha acelerado: " + velocidad + "km/h";
        return cadena;
    }

    @Override
    public String frenar(int vel) {
        velocidad = velocidad - vel;
        // 80
        return "La moto ha frenado y va a" + velocidad + "km/h";
    }

}
