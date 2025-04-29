package taller3;

public class Problema1_Terreno {

    public double costo_terreno;
    public double ancho;
    public double largo;
    public double area;
    public double valorMetroCuadrado;
    
    public void setAncho(double anc) {
        ancho = anc;
    }

    public double getAncho() {
        return ancho;
    }

    public void setLargo(double lar) {
        largo = lar;
    }

    public double getLargo() {
        return largo;
    }
    
    public void setValorMetroCuadrado(double metro) {
        valorMetroCuadrado = metro;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setArea(double ar) {
        area = largo*ancho;
    }

    public double getArea() {
        return largo*ancho;
    }

    public void setCosto_terreno(double costoTerreno) {
        costo_terreno = costoTerreno;
    }

    public double getCosto_terreno() {
        return valorMetroCuadrado * (area);
    }



}
