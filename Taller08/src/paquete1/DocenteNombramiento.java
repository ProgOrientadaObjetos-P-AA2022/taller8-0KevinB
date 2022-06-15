/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author UsuarioITC
 */
public class DocenteNombramiento extends Docente {

    protected double sueldo;
    protected double valorHora;
    protected double numHoras;
    protected double sueldoTotal;

    public void establecerValorSueldo(double c) {
        sueldo = c;
    }

    public void establecerValorHorasExtra(double c) {
        valorHora = c;
    }

    public void establecerNumeroHorasExtra(double c) {
        numHoras = c;
    }

    public void calcularSueldo() {
        sueldoTotal = sueldo + (valorHora * numHoras);
    }

    public double obtenerValorS() {
        return sueldo;
    }

    public double obtenerValorH() {
        return valorHora;
    }

    public double obtenerNumH() {
        return numHoras;
    }

    public double obtenerSueldo() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String reporte = String.format("\nDocente Nombramiento\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Sueldo : %.2f\n"
                + "Valor de hora extra: %.2f\n"
                + "Numero de horas extra: %.2f\n"
                + "Sueldo Total: %.2f\n",
                nombres,
                identificacion,
                sueldo,
                valorHora,
                numHoras,
                sueldoTotal);

        return reporte;
    }

}
