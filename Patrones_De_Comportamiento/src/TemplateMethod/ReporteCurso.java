package TemplateMethod;

public class ReporteCurso extends ReporteAcademico {
    private String nombreCurso;
    private double promedioGeneral;
    public ReporteCurso(String nombreCurso, double promedioGeneral) {
        this.nombreCurso = nombreCurso;
        this.promedioGeneral = promedioGeneral;
    }
    protected void generarContenido(){

        System.out.println("Nombre curso: " + nombreCurso);
        System.out.println("Promedio general: " + promedioGeneral);
        System.out.println("Detalles: Desempeño del curso completo");

    }
}
