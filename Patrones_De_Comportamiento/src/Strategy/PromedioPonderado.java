package Strategy;

import java.util.List;

public class PromedioPonderado implements CalculoNota {

    @Override
    public Double calcular(List<Integer> notas) {
        double suma = 0;
        double pesoTotal = 0;

        for(int i=0; i < notas.size(); i++){
            double peso = i+1; //Esto con la finalidad de que la nota siguiente tiene más peso
            suma += notas.get(i) * peso;
            pesoTotal += peso;
        }
        return (suma/pesoTotal);

    }
}
