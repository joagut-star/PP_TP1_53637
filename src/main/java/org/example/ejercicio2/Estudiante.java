package org.example.ejercicio2;

public class Estudiante {

    private String nombre;
    private String legajo;


    public Estudiante(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", legajo='" + legajo + '\'' +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }
}
