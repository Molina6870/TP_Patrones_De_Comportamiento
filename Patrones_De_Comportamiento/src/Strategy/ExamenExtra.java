package Strategy;

import java.util.List;

//Se agrega un 10% si la nota supera un 7

public class ExamenExtra implements CalculoNota{

    @Override
    public Double calcular(List<Integer> notas) {
        int suma =0;

        for(int nota : notas){
            suma +=nota;
        }
        double promedio = (double) suma / notas.size();

        //Acá si el examen supera un 7 se agrega un 10%
        if(notas.get(notas.size() -1) > 7){
            promedio += promedio * 0.1;
        }
        return promedio;

    }
}
