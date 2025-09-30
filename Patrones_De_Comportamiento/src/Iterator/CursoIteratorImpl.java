package Iterator;
import java.util.List;
import Iterator.Curso;
import Iterator.CursoIterator;


public class CursoIteratorImpl implements CursoIterator {
    private List<Curso> cursos;
    private int position = 0;

    public CursoIteratorImpl(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public boolean hasNext() {
        return position < cursos.size();
    }

    @Override
    public Curso next() {
        if (hasNext()) {
            return cursos.get(position++);
        }
        return null; // o lanzar una excepción
    }
}

