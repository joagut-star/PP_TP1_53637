package org.example.ejercicio4;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {


    public static void main(String[] args){

        Estudiante Fran = new Estudiante( "Francisco", "67677");
        Estudiante Tizi = new Estudiante("Tiziano", "67676");
        Estudiante Valen = new Estudiante("Valentin", "67678");

        EventoUniversitario evento1 = new EventoUniversitario("93585", "Hackathon", 45000.00, false );

        Sala sala1 = new Sala( 7678 ,"Auditorio" );

        evento1.crearActividad( 2323, "La IA en la actualidad", 67, "Charla", false, "Santiago Perez");
        evento1.crearActividad(4556, "Aprende a aprender", 78, "Taller", true, "Marina");

        evento1.charlas.get(0).inscribir(Fran);
        evento1.charlas.get(0).inscribir(Tizi);
        evento1.talleres.get(0).inscribir(Valen);

        System.out.println("La cantidad de eventos es " + EventoUniversitario.getCantidadEventos());


    }

}