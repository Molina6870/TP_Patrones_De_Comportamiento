package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Curso> cursos;

    public Alumno(String nombre){
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void inscribirCurso(Curso curso){
        cursos.add(curso);
    }

    public List <Curso> getCursos(){
        return cursos;
    }

    public String getNombre(){
        return nombre;
    }
}
