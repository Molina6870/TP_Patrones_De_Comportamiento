package State;

public class EnEspera implements EstadoInscripcion{

    @Override
    public void cambiarEstado(Inscripcion inscripcion) {
        System.out.println("El alumno está en lista de espera.");
    }
}
