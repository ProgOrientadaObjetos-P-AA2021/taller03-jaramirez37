package Ejecutable;
import Institucion.InstitucionEducativa2;
/**
 *
 * @author josep
 */
public class Ejecutor2 {
    
    public static void main(String[] args) {
        InstitucionEducativa2 educacion = new InstitucionEducativa2();
        
        educacion.setNombre("12 de Febrero");
        educacion.setTipoInstitucion("Publica");
        educacion.setNumeroalumno(7200);
        educacion.setNumeroDocentes(300);
        educacion.setNumeroSedes(2);

        System.out.printf("Los datos de la institucion educativa son: \n  Nombre de la Institucion: %s\n "
                + " Tipo de Educacion: %s\n"
                + "  Numero Alumnos: %d\n"
                + "  Numero de Docentes: %d\n"
                + "  Numeros de sedes: %d\n",
                educacion.getNombre(),
                educacion.getTipoInstitucion(),
                educacion.getNumeroalumno(),
                educacion.getNumeroDocentes(),
                educacion.getNumeroSedes());
    }
}
