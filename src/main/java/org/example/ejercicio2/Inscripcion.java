package org.example.ejercicio2;

import java.time.LocalDate;

public class Inscripcion {
    private LocalDate fecha;
    private String estado;
    private Estudiante estudiante;

    public Inscripcion() {
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Inscripcion(LocalDate fecha, String estado, Estudiante estudiante) {
        this.fecha = fecha;
        this.estado = estado;
        this.estudiante = estudiante;
    }

    public Inscripcion(String estado, LocalDate fecha) {
        this.estado = estado;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
