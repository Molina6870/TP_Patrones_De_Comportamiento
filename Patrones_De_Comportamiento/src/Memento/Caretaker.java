package Memento;

import java.util.Stack;

public class Caretaker {

    private Stack<Memento> estados = new Stack<>();

    public void guardar(Memento memento){
        estados.push(memento);
    }

    public Memento deshacer(){
        if (!estados.isEmpty()){
            return estados.pop();
        }
        return null;
    }


}
