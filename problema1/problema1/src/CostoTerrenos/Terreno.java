package CostoTerrenos;

/**
 *
 * @author josep
 */
public class Terreno {
    
    private double costo;
    private double ancho;
    private double area;
    private double largo;
    private double valormetrocuadrado;

    public void setancho(double Ancho) {
        ancho = Ancho;
    }

    public void setlargo(double Largo) {
        largo = Largo;
    }

    public void setvalormetrocuadrado(double MetroCuadrado) {
        valormetrocuadrado = MetroCuadrado;
    }

    public void calculararea() {
        area = largo * ancho;
    }

    public void calcularcosto() {
        costo = area * valormetrocuadrado;
    }

    public double getcosto() {
        return costo;
    }

    public double getancho() {
        return ancho;
    }

    public double getlargo() {
        return largo;
    }

    public double getarea() {
        return area;
    }

    public double getvalormetroscuadrados() {
        return valormetrocuadrado;
    }

    public double getcalcularcosto() {
        return costo;
    }
  
}
