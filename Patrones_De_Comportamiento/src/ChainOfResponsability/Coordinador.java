package ChainOfResponsability;

import lombok.Data;
@Data

public class Coordinador implements Handler {
    private Handler next;
    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud solicitud){
        if (solicitud.getTipo().equalsIgnoreCase("Compleja")){
            System.out.println("El coordinador está manejando la solicitud compleja");
        } else if (next != null) {
            next.handle(solicitud);
        } else {
            System.out.println("La solicitud no pudo ser procesada...");
        }

    }

}
