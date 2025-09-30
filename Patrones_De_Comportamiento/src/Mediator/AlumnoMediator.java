package Mediator;

public class AlumnoMediator extends Usuario{

    public AlumnoMediator(ChatMediator mediator, String nombre){
        super(mediator,nombre);
    }

    @Override
    public void enviar(String msg) {
        System.out.println(nombre + "(Alumno) envía: " + msg);
        mediator.enviar(msg,this);
    }

    @Override
    public void recibir(String msg) {
        System.out.println(nombre + "(Alumno) recibe: " + msg);
    }
}
