package org.example.ejercicio2;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {


    public static void main(String[] args){


        //a. Se construya una lista de estudiantes.

        List<Estudiante> estudiantes = new ArrayList<>();

        Estudiante pepito = new Estudiante("Pepe", "6767");
        Estudiante oracio = new Estudiante("Oracio", "4589");
        estudiantes.add(pepito);
        estudiantes.add(oracio);


        //b. Se construyan eventos.

        EventoUniversitario evento1 = new EventoUniversitario("5236","Conferencia de IA", 0.0, true);
        EventoUniversitario evento2 = new EventoUniversitario("7734","Hackathon", 67000.0, false);

        //codigo del ejercicio 1
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

        //c. Se asigne una sala cada evento.
        List<EventoUniversitario> eventos = new ArrayList<>();
        eventos.add(evento1);
        eventos.add(evento2);

        Sala auditorio =new Sala (1, "Auditorio");
        Sala sum = new Sala (2, "SUM");

        evento1.asignarSala(auditorio);
        evento2.asignarSala(sum);

        //d. Se creen actividades propias de cada evento.
        evento1.crearActividad(200, "Taller" , 35);
        evento2.crearActividad(179, "Torneo" , 67);


        //e. Se inscriban estudiantes en cada actividad.
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

        //f. Se muestre el resumen de datos por cada evento creado.
        System.out.println("----------------------------");
        evento1.mostrarDatos();
        System.out.println("----------------------------");
        evento2.mostrarDatos();
        System.out.println("----------------------------");

        //g. Se muestre el total de eventos creados.
        System.out.println("La cantidad de eventos es " + EventoUniversitario.getCantidadEventos());
    }

}