package org.example.ejercicio2;

import java.util.List;
import java.util.ArrayList;

public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;


    private Sala sala;

    public EventoUniversitario(String id) {
        this.id = id;
    }

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
    }
    public EventoUniversitario(EventoUniversitario obj){
        this.id = obj.id;
        this.titulo = obj.titulo;
        this.costoBase = obj.costoBase;
        this.gratuito = obj.gratuito;
        cantidadEventos++;
    }
    public double calcularCostoEstimado(){
        if(gratuito) {
            return 0.0;
        }
        return costoBase;
    }
    public void asignarSala(Sala sala){
        this.sala = sala;
        System.out.println("El evento de " + this.titulo + " tiene asignado el " + sala.getNombre());
    }
    public void mostrarDatos(){
        System.out.println("ID: " + this.id);
        System.out.println(this.titulo);
        System.out.println("Costo " + this.costoBase);
        if (gratuito){
            System.out.println("Es gratis.");
        } else {
            System.out.println("No es gratis.");
        }
        System.out.println("Sala: " + this.sala.getNombre());

        for ( Actividad act: actividades) {
            System.out.println("Actividades:");
            System.out.println(act.getTitulo());

        }


    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }


    List<Actividad> actividades = new ArrayList<>();


    public void crearActividad(int idAct, String tituloAct, int cupo){
        Actividad actividad = new Actividad(idAct,tituloAct,cupo);
        actividades.add(actividad);
    }



}

