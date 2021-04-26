package Celular;

/**
 *
 * @author josep
 */
public class EquipoCelular2 {

    private String sistemaOperativo;
    private double tamañoPantalla;
    private double Costo;
    private String direccionMac;
    private int informacionIMEI;
    
    public void setsistemaoperativo(String sistemaoperativo) {
        sistemaOperativo = sistemaoperativo;
    }

    public void settamañodepantalla(double pantalla) {
        tamañoPantalla = pantalla;
    }

    public void setcosto(double costo) {
        Costo = costo;
    }

    public void setDireccionmac(String direccmac) {
        direccionMac = direccmac;
    }

    public void setInformacionimei(int imei) {
        informacionIMEI = imei;
    }
    
    public String getsistemaoperativo(){
        return sistemaOperativo;
    }
    
    public double gettamañodepantalla(){
        return tamañoPantalla;
    }
    
    public double getcosto(){
        return Costo;
    }
    
    public String getDireccionmac(){
        return direccionMac;
    }
    
    public int getInformacionimei(){
        return informacionIMEI;
    }
}

