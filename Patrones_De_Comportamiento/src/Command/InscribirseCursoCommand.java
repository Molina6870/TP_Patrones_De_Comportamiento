package Command;

public class InscribirseCursoCommand implements Command {
    private AlumnoC alumno;

    public InscribirseCursoCommand(AlumnoC alumno){
        this.alumno = alumno;
    }

    @Override
    public void execute() {
        alumno.inscribirseCurso();
    }

}
