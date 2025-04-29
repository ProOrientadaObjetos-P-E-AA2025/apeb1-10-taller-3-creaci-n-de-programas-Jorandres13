package taller3;

public class Problema6_Docente {

    public String nombre;
    public String apellido;
    public double sueldoBasico;
    public double sueldoTotal;
    public int cedula;

    public Problema6_Docente(String name, String name2, double sueldoB, int DNI) {
        nombre = name;
        apellido = name2;
        sueldoBasico = sueldoB;
        sueldoTotal = sueldoBasico * 1.20;
        cedula = DNI;
    }

    public String toString() {
        return "Nombre: " + nombre
                + "\nApellido: " + apellido
                + "\nSueldo: " + sueldoTotal
                + "\nCedula: " + cedula;
    }

}
