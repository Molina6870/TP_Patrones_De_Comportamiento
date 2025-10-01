package TemplateMethod;

public abstract class ReporteAcademico {
    public final void generarReporte() {
        generarEncabezado();
        generarContenido();
        generarPie();
    }
    private void generarEncabezado() {
        System.out.println("=== (INSTITUCIÓN EDUCATIVA) ===");
        System.out.println("Reporte de Desempeño Académico");
        System.out.println("-----------------------------");
    }
    private void generarPie() {
        System.out.println("-----------------------------");
        System.out.println("Fin del reporte");
    }
    protected abstract void generarContenido();
}
