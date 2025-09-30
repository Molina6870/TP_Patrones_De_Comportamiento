package Strategy;

import java.util.List;

public class AlumnoStrategy {
    private String nombre;
    private CalculoNota estrategia;

    public AlumnoStrategy(String nombre, CalculoNota estrategia) {
        this.nombre = nombre;
        this.estrategia = estrategia;
    }

    public void setEstrategia(CalculoNota estrategia){
        this.estrategia = estrategia;
    }

    public void mostrarNotaFinal(List<Integer> notas){
        double notaFinal = estrategia.calcular(notas);
        System.out.println("La nota final de " + nombre + " es: " + notaFinal);

    }

}
