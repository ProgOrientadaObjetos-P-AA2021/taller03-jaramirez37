package Ejecutable;
import Institucion.InstitucionEducativa1;
/**
 *
 * @author josep
 */
public class Ejecutor1 {
    
    public static void main(String[] args) {
        InstitucionEducativa1 educacion = new InstitucionEducativa1();
        
        educacion.setNombre("San Fransisco de Asis");
        educacion.setTipoInstitucion("Publica");
        educacion.setNumeroalumno(3400);
        educacion.setNumeroDocentes(250);
        educacion.setNumeroSedes(3);

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
