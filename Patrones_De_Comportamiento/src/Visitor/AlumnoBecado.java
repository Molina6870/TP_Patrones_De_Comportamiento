package Visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlumnoBecado implements AlumnoVisitor {
    private String nombre;
    private double cuotaMensual;
    private double porcentajeBeca;

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }

}