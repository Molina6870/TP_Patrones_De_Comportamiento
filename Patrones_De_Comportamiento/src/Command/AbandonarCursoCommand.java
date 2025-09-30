package Command;

public class AbandonarCursoCommand implements Command{
    private AlumnoC alumno;

    public AbandonarCursoCommand(AlumnoC alumno){
        this.alumno = alumno;
    }

    @Override
    public void execute() {
     alumno.abandonarCurso();
    }

}
