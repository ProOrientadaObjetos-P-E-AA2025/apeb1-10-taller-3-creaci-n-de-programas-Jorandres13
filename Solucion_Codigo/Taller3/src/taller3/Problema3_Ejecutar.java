package taller3;

public class Problema3_Ejecutar {

    public static void main(String[] args) {

        Problema3_AdministrarInstituciones APC = new Problema3_AdministrarInstituciones("APC", "Privada", 800, 50, 1, 450);

        APC.calcularPresupuesto();

        System.out.println(APC.toString());
    }

}
