package Command;

public class SolicitarCertificadoCommand implements Command{
    private AlumnoC alumno;

    public SolicitarCertificadoCommand(AlumnoC alumno){
        this.alumno = alumno;
    }

    @Override
    public void execute() {
        alumno.solicitarCertificado();
    }
}
