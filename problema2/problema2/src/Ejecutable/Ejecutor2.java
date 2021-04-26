package Ejecutable;
import CantidadHoras.EquivalenteHora2;
/**
 *
 * @author josep
 */
public class Ejecutor2 {
    
    public static void main(String[] args) {
        
        EquivalenteHora2 equivalenteHoras2 = new EquivalenteHora2();
    
        int horas = 128;
        equivalenteHoras2.setHoras(horas);
        equivalenteHoras2.calcularMinutos();
        equivalenteHoras2.calcularSegundos();
        equivalenteHoras2.calcularDias();
        
        System.out.printf("El equivalente de horas es:\n Horas establecidas: %d\n" + "Minutos: %d\n " +"Segundos: %d\n " +"Dias: %.2f\n ", equivalenteHoras2.getHoras(), equivalenteHoras2.getMinutos(), equivalenteHoras2.getSegundos(), equivalenteHoras2.getDias());
    }
    
}
