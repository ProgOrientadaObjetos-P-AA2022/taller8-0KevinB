/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author UsuarioITC
 */
public class DocenteFactura extends Docente {

    protected double valorFac;
    protected double iva;
    protected double valorCancelar;

    public void establecerValorFactura(double c) {
        valorFac = c;
    }

    public void establecerIva(double c) {
        iva = c;
    }

    public void calcularValorCancelar() {
        valorCancelar = valorFac - (valorFac * iva) / 100;
    }

    public double obtenerValorFactura() {
        return valorFac;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format("\nDocente Factura"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Valor Factura: %.2f\n"
                + "Porcentaje de iva de descuento: %.2f\n"
                + "Valor a cancelar: %.2f\n",
                nombres,
                identificacion,
                valorFac,
                iva,
                valorCancelar);

        return reporte;
    }

}
