package taller3;

public class Problema4_DispositivosElectronicos {

    public String sistemaOperativo;
    public double tamanioPantalla;
    public double costoInicial;
    public double iva;
    public double ivaCostoInicial;
    public double costoFinal;
    public String direccionMAC;
    public String informacionIMEI;

    public Problema4_DispositivosElectronicos(String sistema, double tamanio, double costoI, double I, String direccion, String info) {
        sistemaOperativo = sistema;
        tamanioPantalla = tamanio;
        costoInicial = costoI;
        iva = I;
        direccionMAC = direccion;
        informacionIMEI = info;
    }

    public void calcularIvaCostoInicial() {
        ivaCostoInicial = costoInicial * (iva / 100);
    }

    public void calcularCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial;
    }

    public String toString() {
        return "Sistema Operativo: " + sistemaOperativo
                + "\n Tamanio de pantalla: " + tamanioPantalla + " pulgadas"
                + "\n Costo: " + costoFinal
                + "\n DireccionMAC: " + direccionMAC
                + "\n Informacion IMEI: " + informacionIMEI;

    }

}
