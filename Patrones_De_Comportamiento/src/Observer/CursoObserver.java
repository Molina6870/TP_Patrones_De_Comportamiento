package Observer;

import java.util.ArrayList;
import java.util.List;

public class CursoObserver {
    private List<Observer> observadores = new ArrayList<>();


    public void addObserver(Observer observer) {
        observadores.add(observer);
    }


    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }


    public void notifyObserver(String msg) {
        for (Observer observer : observadores){
            observer.update(msg);
        }
    }
}
