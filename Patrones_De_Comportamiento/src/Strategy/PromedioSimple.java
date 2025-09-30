package Strategy;

import java.util.List;

public class PromedioSimple implements CalculoNota{

    @Override
    public Double calcular(List<Integer> notas) {
        int suma= 0;
        for(int nota : notas){
            suma+= nota;
        }
        return (double) suma/notas.size();
    }
}
