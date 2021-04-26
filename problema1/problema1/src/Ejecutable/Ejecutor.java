package Ejecutable;
import CostoTerrenos.Terreno;
/**
 *
 * @author josep
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        Terreno terreno1 = new Terreno();
        
        double largo = 250;
        double ancho = 250;
        double valormetrocuadrado = 1.25;

        terreno1.setlargo(largo);
        terreno1.setancho(ancho);
        terreno1.setvalormetrocuadrado(valormetrocuadrado);
        terreno1.calculararea();
        terreno1.calcularcosto();
        
        imprimirCosto(terreno1.getcosto());
        
        Terreno terreno2 = new Terreno();
        
        double largo2 = 550;
        double ancho2 = 150;
        double valormetrocuadrado2 = 5.25;

        terreno2.setlargo(largo2);
        terreno2.setancho(ancho2);
        terreno2.setvalormetrocuadrado(valormetrocuadrado2);
        terreno2.calculararea();
        terreno2.calcularcosto();
        
        imprimirCosto(terreno2.getcosto());        
    }
    
    public static void imprimirCosto(double costo) {
        
        System.out.printf("El costo del terreno es: %.2f\n", costo);
    }
}
