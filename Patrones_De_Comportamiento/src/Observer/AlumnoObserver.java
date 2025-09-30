package Observer;

public class AlumnoObserver implements Observer{
    private String nombre;

    public AlumnoObserver(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {
        System.out.println("Alumno" + nombre +  "recibió una notificación: " + msg);
    }
}
