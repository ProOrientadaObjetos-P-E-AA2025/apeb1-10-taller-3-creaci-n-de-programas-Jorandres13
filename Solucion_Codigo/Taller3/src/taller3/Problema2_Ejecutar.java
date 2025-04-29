package taller3;

public class Problema2_Ejecutar {

    public static void main(String[] args) {

        Problema2_EquivalenteHora hora = new Problema2_EquivalenteHora(48);

        hora.calcularMinutos();
        hora.calcularSegundos();
        hora.calcularDias();

        System.out.println(hora.toString());
    }
}
