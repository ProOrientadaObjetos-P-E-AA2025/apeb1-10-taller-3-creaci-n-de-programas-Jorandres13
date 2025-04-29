package taller3;

public class Problema4_Ejecutar {

    public static void main(String[] args) {

        Problema4_DispositivosElectronicos celular = new Problema4_DispositivosElectronicos("Android", 6, 400, 15, "3A:5B:2C:7D:8E:9F", "356789101234567");
        celular.calcularIvaCostoInicial();
        celular.calcularCostoFinal();
        System.out.println(celular.toString());

    }

}
