package Institucion;

/**
 *
 * @author josep
 */
public class InstitucionEducativa2 {
    
    private String name;
    private String tipoInstitucion;
    private int numeroAlumno;
    private int numeroDocente;
    private int NumeroSede;

    public void setNombre(String n) {
        name = n;
    }

    public void setTipoInstitucion(String tipInstitucion) {
        tipoInstitucion = tipInstitucion;
    }

    public void setNumeroalumno(int numAlumno) {
        numeroAlumno = numAlumno;
    }

    public void setNumeroDocentes(int numDocente) {
        numeroDocente = numDocente;
    }

    public void setNumeroSedes(int NumSedes) {
        NumeroSede = NumSedes;
    }

    public String getNombre() {
        return name;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public int getNumeroalumno() {
        return numeroAlumno;
    }

    public int getNumeroDocentes() {
        return numeroDocente;
    }

    public int getNumeroSedes() {
        return NumeroSede;
    }
}
