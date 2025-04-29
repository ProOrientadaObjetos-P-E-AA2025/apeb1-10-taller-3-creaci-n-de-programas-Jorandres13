package taller3;

public class Problema8_EntidadFinanciera {

    public String nombreCliente;
    public String nombreBanco;
    public double valorCheque;
    public double comision;

    public Problema8_EntidadFinanciera(String name, String nameB, double valorC) {
        nombreCliente = name;
        nombreBanco = nameB;
        valorCheque = valorC;
        comision = valorCheque * 0.003;
    }

    public String toString() {
        return "Nombre del cliente: " + nombreCliente
                + "\n Nombre del banco: " + nombreBanco
                + "\n Valor del cheque: " + valorCheque
                + "\n Comision del banco: " + comision;

    }

}
