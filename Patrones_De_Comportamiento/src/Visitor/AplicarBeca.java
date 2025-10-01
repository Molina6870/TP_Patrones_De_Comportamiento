package Visitor;

public class AplicarBeca implements Visitor {
    public void visitar(AlumnoRegular alumno){
        double descuento = alumno.getCuotaMensual() * 0.10;
        double cuotaConDescuento = alumno.getCuotaMensual()-descuento;
        System.out.println("Alumno regular " + alumno.getNombre() + " Descuento aplicado. Cuota final: "+ cuotaConDescuento);
    }
    public void visitar(AlumnoBecado alumno){
        double montoBeca = alumno.getCuotaMensual() * (alumno.getPorcentajeBeca()/100);
        double cuotaConBeca = alumno.getCuotaMensual()-montoBeca;
        System.out.println("Alumno Becado: "+ alumno.getNombre()+ " Beca del "+ alumno.getPorcentajeBeca()+"% aplicada "+ "Cuota final: $"+ cuotaConBeca);
    }

}
