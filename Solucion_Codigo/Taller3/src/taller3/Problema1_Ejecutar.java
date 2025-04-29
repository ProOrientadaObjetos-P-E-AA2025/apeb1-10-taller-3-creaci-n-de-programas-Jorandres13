
package taller3;

public class Problema1_Ejecutar {
    public static void main(String[] args) {
        double costoT = 0;
        double ancho = 10;
        double largo = 10;
        double area = 0;
        double valorMC = 5;
        
        Problema1_Terreno terreno1 = new Problema1_Terreno();
        
        terreno1.setAncho(ancho);
        terreno1.setLargo(largo);
        terreno1.setArea(area);
        terreno1.setCosto_terreno(costoT);
        terreno1.setValorMetroCuadrado(valorMC);
        
        System.out.println("Terreno 1 \n ------------------------------");
        System.out.println("El area del terreno es de " +terreno1.getArea()+ " con un costo de "+terreno1.getValorMetroCuadrado()+" el metro cuadrado, el costo total es de "+terreno1.getCosto_terreno());
    }
    
}
