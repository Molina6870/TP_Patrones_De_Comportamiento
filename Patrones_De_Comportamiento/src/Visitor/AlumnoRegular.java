package Visitor;

import Iterator.Alumno;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AlumnoRegular implements AlumnoVisitor {
    private String nombre;
    private double cuotaMensual;

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }

}
