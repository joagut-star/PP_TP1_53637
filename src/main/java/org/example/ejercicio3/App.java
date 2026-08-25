package org.example.ejercicio3;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {


    public static void main(String[] args){


        //a. Se registren estudiantes.
        List<Estudiante> estudiantes = new ArrayList<>();

        Estudiante pepito = new Estudiante("Pepe", "6767");
        Estudiante oracio = new Estudiante("Oracio", "4589");
        estudiantes.add(pepito);
        estudiantes.add(oracio);


        //b. Se construyan eventos.
        EventoUniversitario evento1 = new EventoUniversitario("5236","Conferencia", 0.0, true);
        EventoUniversitario evento2 = new EventoUniversitario("7734","Hackathon", 67000.0, false);


        /*
        EventoUniversitario copia1 = new EventoUniversitario(evento1);
        EventoUniversitario copia2 = new EventoUniversitario(evento2);

        evento1.mostrarDatos();
        System.out.println("----------------------------");
        evento2.mostrarDatos();
        System.out.println("----------------------------");
        copia1.mostrarDatos();
        System.out.println("----------------------------");
        copia2.mostrarDatos();
        System.out.println("----------------------------");
        System.out.println("La cantidad de eventos es " + EventoUniversitario.getCantidadEventos());


         */

        //c. Se asigne una sala a cada evento.
        List<EventoUniversitario> eventos = new ArrayList<>();
        eventos.add(evento1);
        eventos.add(evento2);

        Sala auditorio =new Sala(1, "Auditorio");
        Sala sum = new Sala(2, "SUM");

        evento1.asignarSala(auditorio);
        evento2.asignarSala(sum);
        System.out.println("______________________________");

        /* codigo del ejercicio 2

        evento1.crearActividad(200, "Taller" , 35);
        evento2.crearActividad(179, "Torneo" , 67);


        for  (Estudiante estu: estudiantes){
            for (EventoUniversitario even: eventos){
                for (Actividad act: even.actividades){
                    act.inscribir(estu);

                }

            }

        }

        for (EventoUniversitario even: eventos){
            for (Actividad act: even.actividades){
                act.mostrarInscripciones();
            }

        }

        System.out.println("----------------------------");
        evento1.mostrarDatos();
        System.out.println("----------------------------");
        evento2.mostrarDatos();
        System.out.println("----------------------------");

*/
        //d. Se creen actividades para cada evento del tipo Charla y/o Taller.

        evento1.crearActividad(2983, "Charla de IA", 67, "Charla", false, "Santiago Perez" );
        evento1.crearActividad(32798, "Hackathon", 670, "Taller", true, null);
        evento1.crearActividad(24764, "Aprende a estudiar", 427, "charla", false, "Valentin" );
        evento2.crearActividad(2346, "Capacitación de primeros auxilios", 237, "Charla", false, "Marina" );

        //e. Se inscriban estudiantes en cada actividad.

        for  (Estudiante estu: estudiantes){
            for (EventoUniversitario even: eventos){
                for (Taller ta: even.talleres){
                    ta.inscribir(estu);

                }

                for (Charla cha: even.charlas){
                   cha.inscribir(estu);

                }
            }

        }
        for (EventoUniversitario even: eventos){
            for (Taller ta: even.talleres){
                ta.mostrarInscripciones();
            }
            for (Charla cha: even.charlas){
                cha.mostrarInscripciones();
            }
        }

        //f. Se muestre el resumen de datos de cada evento y se recorran sus actividades mostrando su identificación de forma polimórfica.
        evento1.mostrarDatos();
        System.out.println("______________________________");
        evento2.mostrarDatos();
        System.out.println("______________________________");

        //g. Se muestre el total de eventos creados.

        System.out.println("La cantidad de eventos es " + EventoUniversitario.getCantidadEventos());

    }

}