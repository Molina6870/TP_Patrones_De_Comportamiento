package Command;

public class AlumnoC {
    private String nombre;

    public AlumnoC(String nombre){
        this.nombre = nombre;
    }

    public void inscribirseCurso(){
        System.out.println("El alumno: " + nombre + " " + "se ha inscripto en el curso");
    }

    public void abandonarCurso(){
        System.out.println("El alumno: " + nombre + " " +"ha abandonado el curso");
    }

    public void solicitarCertificado(){
        System.out.println("El alumno: " + nombre + " " +"acaba de solicitar el certificado de alumno regular");
    }

}
