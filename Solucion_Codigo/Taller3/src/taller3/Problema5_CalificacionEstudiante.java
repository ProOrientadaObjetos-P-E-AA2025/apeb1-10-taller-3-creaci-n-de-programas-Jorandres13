package taller3;

public class Problema5_CalificacionEstudiante {

    public String nombre;
    public double calificacion1;
    public double calificacion2;
    public double calificacion3;
    public double promedio;
    public String estado;

    public Problema5_CalificacionEstudiante(String name, double c1, double c2, double c3) {
        nombre = name;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        if (promedio >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    public String toString() {
        return "Nombre: " + nombre
                + "\n Calificacion 1: " + calificacion1
                + "\n Calificacion 2: " + calificacion2
                + "\n Calificacion 3: " + calificacion3
                + "\n Promedio: " + promedio
                + "\n Estado: " + estado;
    }
}
