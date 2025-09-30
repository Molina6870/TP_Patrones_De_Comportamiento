package State;

public class Cancelado implements EstadoInscripcion{

    @Override
    public void cambiarEstado(Inscripcion inscripcion) {
        System.out.println("La inscripción del alumno ha sido cancelada.");
    }
}
