package taller3;

public class Problema7_Automotor {

    public int cedula;
    public String marca;
    public int anio;
    public double valorVehiculo;
    public double valorMatricula;

    public Problema7_Automotor(int ced, String mar, int anioV, double valor) {
        cedula = ced;
        marca = mar;
        anio = anioV;
        valorVehiculo = valor;
        valorMatricula = (valor * 0.002)*(2025-anio);
    }

    public String toString() {
        return "Cedula del duenio: " + cedula
                + "\nMarca: " + marca
                + "\nAnio: " + anio
                + "\nValor del vehiculo: " + valorVehiculo
                + "\nValor de la matricula: " + valorMatricula;
    }

}
