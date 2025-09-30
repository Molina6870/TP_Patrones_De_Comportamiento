package Memento;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    private List<String> respuestas = new ArrayList<>();

    //Agregamos las respuestas
    public void responderPregunta(String respuesta){
        respuestas.add(respuesta);
    }

    //Mostrar respuestas actuales
    public void mostrarRespuestas(){
        System.out.println("Respuestas actuales : " + respuestas);
    }

    //Guardamos el estado actual
    public Memento save(){
        return new Memento(new ArrayList<>(respuestas));
    }

    //Restauramos el estado desde un momento
    public void restore(Memento memento){
        this.respuestas = new ArrayList<>(memento.getRespuestas());
    }


}
