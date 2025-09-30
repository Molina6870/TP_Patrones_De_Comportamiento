package Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> comandos = new ArrayList<>();

    public void addCommand(Command comando){
        comandos.add(comando);
    }

    public void ejecutarComandos(){
      for (Command comando : comandos){
          comando.execute();
      }
        comandos.clear(); //Limpiamos la lista después de ejecutarlos
    }

}
