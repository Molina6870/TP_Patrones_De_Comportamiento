package ChainOfResponsability;

import lombok.Data;
@Data

public class Profesor implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud solicitud) {
        if (solicitud.getTipo().equalsIgnoreCase("intermedia")) {
            System.out.println("Profesor maneja la solicitud intermedia.");
        } else if (next != null) {
            next.handle(solicitud);
        }
    }
}
