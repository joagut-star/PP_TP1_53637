package org.example.ejercicio4;

public class Sala {
    private int id;
    private String nombre;

    public Sala(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Sala(String nombre){

        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public int getId() {
        return id;
    }


}
