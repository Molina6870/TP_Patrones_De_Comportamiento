package Mediator;

public class ProfesorMediator extends Usuario {

    public ProfesorMediator(ChatMediator mediator, String nombre) {
        super(mediator, nombre);
    }

    @Override
    public void enviar(String msg) {
        System.out.println(nombre + " (Profesor) envía: " + msg);
        mediator.enviar(msg, this);
    }

    @Override
    public void recibir(String msg) {
        System.out.println(nombre + " (Profesor) recibe: " + msg);
    }


}
