package State;

public class Inscripcion {
    private EstadoInscripcion estado;

    public Inscripcion(EstadoInscripcion estadoInicial) {
        this.estado = estadoInicial;
    }

    public void setEstado(EstadoInscripcion estado) {
        this.estado = estado;
    }

    public void cambiar() {
        estado.cambiarEstado(this);
    }

}
