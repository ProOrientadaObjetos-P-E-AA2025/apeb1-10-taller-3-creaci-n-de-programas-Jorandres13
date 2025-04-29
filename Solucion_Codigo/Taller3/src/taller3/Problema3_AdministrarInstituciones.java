package taller3;

public class Problema3_AdministrarInstituciones {

    public String nombre;
    public String tipo;
    public int nAlum;
    public int nDoc;
    public int nSedes;
    public double gastos;
    public double presupuesto;

    public Problema3_AdministrarInstituciones(String name, String tipoI, int nA, int nD, int nS, double gastosEstu) {
        nombre = name;
        tipo = tipoI;
        nAlum = nA;
        nDoc = nD;
        nSedes = nS;
        gastos = gastosEstu;
    }

    public void calcularPresupuesto() {
        presupuesto = nAlum * gastos;
    }

    public String toString() {
        return "Institucion 1\n ----------------------- \n Nombre: " + nombre
                + "\n Tipo de Institucion: " + tipo
                + "\n Numero de alumnos: " + nAlum
                + "\n Numero de docentes: " + nDoc
                + "\n Numero de sedes: " + nSedes
                + "\n Gastos por estudiante: " + gastos
                + "\n Presupuesto: " + presupuesto;

    }

}
