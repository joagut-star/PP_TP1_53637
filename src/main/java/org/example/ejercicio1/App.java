package org.example.ejercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args){

        //a. Se creen uno o más eventos universitarios.
        EventoUniversitario evento1 = new EventoUniversitario("5236","Conferencia de IA", 0.0, true);
        EventoUniversitario evento2 = new EventoUniversitario("7734","PartidoBasquet", 67000.0, false);

        //b. Se cree una copia de cada evento creado utilizando el constructor de copia.
        EventoUniversitario copia1 = new EventoUniversitario(evento1);
        EventoUniversitario copia2 = new EventoUniversitario(evento2);

        //c. Se muestren los datos de los eventos creados y su copia.
        evento1.mostrarDatos();
        System.out.println("----------------------------");
        evento2.mostrarDatos();
        System.out.println("----------------------------");
        copia1.mostrarDatos();
        System.out.println("----------------------------");
        copia2.mostrarDatos();
        System.out.println("----------------------------");

        //d. Se muestre el contador de eventos con la totalidad de eventos creados.
        System.out.println("La cantidad de eventos es " + EventoUniversitario.getCantidadEventos());
    }

}