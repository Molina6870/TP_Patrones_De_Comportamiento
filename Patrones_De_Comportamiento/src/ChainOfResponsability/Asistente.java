package ChainOfResponsability;

import lombok.Data;

@Data

public class Asistente implements Handler{
    private Handler next;

@Override
    public void setNext(Handler next){
    this.next = next;
}

@Override
    public void handle(Solicitud solicitud){
    if (solicitud.getTipo().equalsIgnoreCase("Simple")){
        System.out.println("El Asistente esta manejando la solicitud simple");
    }else if (next != null){
        next.handle(solicitud);
    }
}


}
