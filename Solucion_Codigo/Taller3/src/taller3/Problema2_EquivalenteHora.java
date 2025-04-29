package taller3;

public class Problema2_EquivalenteHora {

    public double horas;
    public double minutos;
    public double segundos;
    public double dias;

    public Problema2_EquivalenteHora(double h) {
        horas = h;
    }

    public void calcularMinutos() {
        minutos = horas * 60;
    }

    public void calcularSegundos() {
        segundos = horas * 3600;
    }

    public void calcularDias() {
        dias = horas / 24;
    }

    public String toString() {
        return "horas: " + horas
                + "\nminutos: " + minutos
                + "\nsegunndos: " + segundos
                + "\ndias: " + dias;
    }
}
