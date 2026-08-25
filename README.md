Trabajo Práctico N°1 (Paradigmas de Programación)
Joaquin Gutiérrez 
Legajo: 53637 

Descripción general
Este repositorio contiene la resolución del Trabajo Práctico N° 1 de la cátedra Paradigmas de Programación, desarrollado en Java, utilizando IntelliJ IDEA. 


Estructura del Modelo
-EventoUniversitario: Entidad principal que gestiona la sala asignada y las actividades del evento.
- Sala: Clase en relación de agregación con el evento.
- Actividad (Abstracta): Clase base en relación de composición con el evento.
  - Charla: Subclase de actividad (sin costo de materiales).
  - Taller: Subclase de actividad (costo según uso de notebook).
- Estudiante: Representa a los alumnos registrados.
- Inscripcion: Clase de asociación entre Estudianta y Actividad.
- App: Ejecutable principal (main) con el escenario de prueba.

---

Conceptos de POO Aplicados
1. Encapsulamiento: Modificadores de acceso, getters/setters y atributos final.
2. Herencia y Polimorfismo: Especialización de Actividad y cálculo dinámico de costos.
3. Relaciones en Memoria: Modelado explícito de agregación, composición y asociación.

---

Archivos del Repositorio
- Código Fuente**: Proyecto IntelliJ listo para clonar y ejecutar (`src/App.java`).
- mapa_memoria.png: Gráfico representativo del Heap y Stack en ejecución (Ejercicio 4).
- captura_consola.png: Captura con la salida por consola del programa.

---





