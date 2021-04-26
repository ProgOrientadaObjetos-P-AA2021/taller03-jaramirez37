package CantidadHoras;

/**
 *
 * @author josep
 */
public class EquivalenteHora {
    
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public void setHoras(int hora) {
        horas = hora;
    }

    public void calcularMinutos() {
        minutos = horas * 60;
    }

    public void calcularSegundos() {
        segundos = horas * 3600;
    }

    public void calcularDias() {
        dias = horas / 24;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    
    public double getDias(){
        return dias;
    }
}
