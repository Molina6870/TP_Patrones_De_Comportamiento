import ChainOfResponsability.*;
import Command.*;
import Iterator.*;
import Mediator.*;
import Memento.*;
import Observer.*;
import State.*;
import Strategy.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1 - Chain of responsability

        System.out.println("**************Chain of responsability**************");
        // Crear manejadores
        Handler asistente = new Asistente();
        Handler profesor = new Profesor();
        Handler coordinador = new Coordinador();

        // Configurar cadena
        asistente.setNext(profesor);
        profesor.setNext(coordinador);

        // Crear solicitudes
        Solicitud s1 = new Solicitud("simple");
        Solicitud s2 = new Solicitud("intermedia");
        Solicitud s3 = new Solicitud("compleja");
        Solicitud s4 = new Solicitud("desconocida");

        // Procesar solicitudes
        asistente.handle(s1);  // Lo maneja el Asistente
        asistente.handle(s2);  // Lo maneja el Profesor
        asistente.handle(s3);  // Lo maneja el Coordinador
        asistente.handle(s4);  // Ninguno lo maneja

        //Ejercicio 2
        System.out.println("**************Command**************");
        AlumnoC alumnoC = new AlumnoC("Juan Ignacio");

        //Comandos concretos
        Command inscribir = new InscribirseCursoCommand(alumnoC);
        Command abandonar = new AbandonarCursoCommand(alumnoC);
        Command solicitarCertificado = new SolicitarCertificadoCommand(alumnoC);

        //Creamos al invoker
        Invoker invoker = new Invoker();

        //Agregamos los comandos
        invoker.addCommand(inscribir);
        invoker.addCommand(abandonar);
        invoker.addCommand(solicitarCertificado);

        //Ejecutamos los comandos
        invoker.ejecutarComandos();

        //Ejercicio 3

        System.out.println("**************Iterator Pattern**************");

        // Crear un alumno
        Alumno alumno = new Alumno("Juan Pérez");

        // Inscribir cursos
        alumno.inscribirCurso(new Curso("Matemáticas"));
        alumno.inscribirCurso(new Curso("Programación"));
        alumno.inscribirCurso(new Curso("Historia"));

        // Crear iterador
        CursoIterator iterator = new CursoIteratorImpl(alumno.getCursos());

        // Recorrer cursos usando el iterador
        System.out.println("Cursos inscritos por " + alumno.getNombre() + ":");
        while (iterator.hasNext()) {
            Curso curso = iterator.next();
            System.out.println("- " + curso.getNombre());

        }


        //Ejercicio 4

        System.out.println("**************Mediator**************");
        ChatMediator chat = new ChatRoom();

        Usuario alumno1 = new AlumnoMediator(chat, "Lautaro");
        Usuario alumno2 = new AlumnoMediator(chat, "Mauro");
        Usuario profesor1 = new ProfesorMediator(chat, "Antonio");
        Usuario profesor2 = new ProfesorMediator(chat, "Mariano");


        //Registramos los usuarios en el chat
        chat.registrar(alumno1);
        chat.registrar(alumno2);
        chat.registrar(profesor1);
        chat.registrar(profesor2);

        //Enviar mensaje
        profesor1.enviar("Bienvenidos a la cátedra");
        alumno1.enviar("Hola estimados. ¿Donde se encuentra el material?");


        //Ejercicio 5
        System.out.println("**************Memento**************");

        Examen examen = new Examen();
        Caretaker historial = new Caretaker();

        // Responder preguntas
        examen.responderPregunta("Pregunta 1: Respuesta A");
        examen.responderPregunta("Pregunta 2: Respuesta B");
        examen.mostrarRespuestas();

        // Guardar estado
        historial.guardar(examen.save());

        // Responder más preguntas
        examen.responderPregunta("Pregunta 3: Respuesta C");
        examen.mostrarRespuestas();

        // Restaurar al estado anterior
        examen.restore(historial.deshacer());
        System.out.println("Estado restaurado:");
        examen.mostrarRespuestas();


        //Ejercicio 6
        System.out.println("**************Observer**************");
        CursoObserver curso = new CursoObserver();

        AlumnoObserver a1 = new AlumnoObserver("Asta");
        AlumnoObserver a2 = new AlumnoObserver("Iris");

        curso.addObserver(a1);
        curso.addObserver(a2);

        curso.notifyObserver("Se cambió el horario de la clase del día 29");
        curso.notifyObserver("Nuevo aviso: se deben automatricular al aula virtual");



        //Ejercicio 7
        System.out.println("**************State**************");
        Inscripcion inscripcion = new Inscripcion(new EnEspera());

        inscripcion.cambiar(); // "El alumno está en lista de espera."

        inscripcion.setEstado(new Inscrito());
        inscripcion.cambiar(); // "El alumno ya está inscrito en el curso."

        inscripcion.setEstado(new Cancelado());
        inscripcion.cambiar(); // "La inscripción del alumno ha sido cancelada."

        //Ejercicio 8
        System.out.println("**************Strategy**************");
        AlumnoStrategy alumnoStrategy = new AlumnoStrategy("Juan", new PromedioSimple());

        alumnoStrategy.mostrarNotaFinal(Arrays.asList(8, 7, 9)); // Usa PromedioSimple

        alumnoStrategy.setEstrategia(new PromedioPonderado());
        alumnoStrategy.mostrarNotaFinal(Arrays.asList(8, 7, 9)); // Usa PromedioPonderado

        alumnoStrategy.setEstrategia(new ExamenExtra());
        alumnoStrategy.mostrarNotaFinal(Arrays.asList(8, 7, 9)); // Usa ExamenExtra




    }
}