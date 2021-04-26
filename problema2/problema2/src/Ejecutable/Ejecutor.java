package Ejecutable;
import CantidadHoras.EquivalenteHora;
/**
 *
 * @author josep
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        EquivalenteHora equivalenteHoras1 = new EquivalenteHora();
    
        int horas = 24;
        equivalenteHoras1.setHoras(horas);
        equivalenteHoras1.calcularMinutos();
        equivalenteHoras1.calcularSegundos();
        equivalenteHoras1.calcularDias();
        
        System.out.printf("El equivalente de horas es: \n Horas establecidas: %d\n" + "Minutos: %d\n " +"Segundos: %d\n " +"Dias: %.2f\n ", equivalenteHoras1.getHoras(), equivalenteHoras1.getMinutos(), equivalenteHoras1.getSegundos(), equivalenteHoras1.getDias());
    }
    
}
