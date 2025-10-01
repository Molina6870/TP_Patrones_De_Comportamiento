package TemplateMethod;

public class ReporteAlumno extends ReporteAcademico {
    private String nombreAlumno;
    private String curso;
    private double notaFinal;
    public ReporteAlumno(String nombreAlumno, String curso, double notaFinal) {
        this.nombreAlumno = nombreAlumno;
        this.curso = curso;
        this.notaFinal = notaFinal;
    }
    protected void generarContenido(){
        System.out.println("Nombre Alumno: " + nombreAlumno);
        System.out.println("Curso al que pertenece: " + curso);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Detalles: Desempeño individual del alumno");
    }
}