package Ejecutable;
import Celular.EquipoCelular1;
/**
 *
 * @author josep
 */
public class Ejecutor1 {
    public static void main(String[] args) {
        
        EquipoCelular1 celular1 = new EquipoCelular1();

        celular1.setsistemaoperativo("MIUI 12 basado en Android 11");
        celular1.settamañodepantalla(6.81);
        celular1.setcosto(1199);
        celular1.setInformacionimei(1095148762);
        celular1.setDireccionmac("84:64:1a:ec:5b:c9");
        
        System.out.printf("Sistema operativo: %s\n" + "Tamaño de Pantalla: %.2f\n" + "Costo del Celular: %.2f\n" + "Informacion de Imei: %d\n" + "Direccion mac: %s\n", celular1.getsistemaoperativo(), celular1.gettamañodepantalla(), celular1.getcosto(), celular1.getInformacionimei(), celular1.getDireccionmac());
    }
}
