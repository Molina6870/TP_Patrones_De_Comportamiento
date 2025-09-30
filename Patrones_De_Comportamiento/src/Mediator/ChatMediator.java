package Mediator;

public interface ChatMediator {
    void enviar(String msg, Usuario usuario);
    void registrar(Usuario usuario);
}
