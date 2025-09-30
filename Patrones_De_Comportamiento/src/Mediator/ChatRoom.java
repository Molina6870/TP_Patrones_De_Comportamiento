package Mediator;

import java.util.ArrayList;

public class ChatRoom implements ChatMediator {
    private java.util.List<Usuario> usuarios = new java.util.ArrayList<>();


    @Override
    public void enviar(String msg, Usuario usuario) {
        for (Usuario u : usuarios){
            if(u != usuarios){
                u.recibir(msg);
            }
        }
    }


    @Override
    public void registrar(Usuario usuario) {
        usuarios.add(usuario);
    }
}
