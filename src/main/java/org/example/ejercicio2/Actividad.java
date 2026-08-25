package org.example.ejercicio2;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Actividad {
    private int  id;
    private String titulo;
    private int cupoMaximo;
    public static int CUPO_MINIMO;
    public List<Inscripcion> inscripciones = new ArrayList<>();

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
    }

    public Inscripcion inscribir(Estudiante estudiante){
        Inscripcion inscripcion = new Inscripcion(  LocalDate.now(), "inscripto" , estudiante);
        inscripciones.add( inscripcion );
        return inscripcion;
    }

    public void mostrarInscripciones() {
        for (Inscripcion inscri : inscripciones ) {

            System.out.println("El estudiante "+ inscri.getEstudiante().getNombre() + " " +inscri.getEstado()+ " en la fecha " + inscri.getFecha() + "en la actividad de " + this.titulo);
        }

    }

    public String getTitulo() {
        return titulo;
    }
}
