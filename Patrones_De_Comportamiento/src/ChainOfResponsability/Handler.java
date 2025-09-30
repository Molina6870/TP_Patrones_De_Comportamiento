package ChainOfResponsability;

public interface Handler {
    void setNext(Handler next);
    void handle(Solicitud s);

}
