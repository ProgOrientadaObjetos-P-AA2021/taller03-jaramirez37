package Ejecutable;
import Celular.EquipoCelular2;
/**
 *
 * @author josep
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        
        EquipoCelular2 celular2 = new EquipoCelular2();

        celular2.setsistemaoperativo(" Android 10");
        celular2.settamañodepantalla(6.67);
        celular2.setcosto(290);
        celular2.setInformacionimei(1095148762);
        celular2.setDireccionmac("84:64:1a:ec:5b:c9");
        
        System.out.printf("Sistema operativo: %s\n" + "Tamaño de Pantalla: %.2f\n" + "Costo del Celular: %.2f\n" + "Informacion de Imei: %d\n" + "Direccion mac: %s\n", celular2.getsistemaoperativo(), celular2.gettamañodepantalla(), celular2.getcosto(), celular2.getInformacionimei(), celular2.getDireccionmac());
    }
}
