/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete2;

import paquete1.*;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;

        System.out.println("Ingrese 1 si es Docente de Nombramiento"
                + "\nIngrese 2 si es Docente por Factura");
        op = entrada.nextInt();
        entrada.nextLine();
        
        if (op == 1 || op == 2) {
            System.out.println("Ingrese el nombre del docente");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la cedula del docente");
            String cedula = entrada.nextLine();
                if (op == 1){
                    System.out.println("Ingrese el valor del sueldo fijo que "
                            + "recibe");
                    double sueldo = entrada.nextDouble();
                    System.out.println("Ingrese el valor de la hora extra");
                    double valorHoraExtra = entrada.nextDouble();
                    System.out.println("Ingrese el numero de horas extra "
                            + "trabajadas");
                    double horasExtra = entrada.nextDouble();

                    DocenteNombramiento docente = new DocenteNombramiento();
                    docente.establecerNombres(nombre);
                    docente.establecerIdentificacion(cedula);
                    docente.establecerValorSueldo(sueldo);
                    docente.establecerValorHorasExtra(valorHoraExtra);
                    docente.establecerNumeroHorasExtra(horasExtra);
                    docente.calcularSueldo();
                    System.out.printf("%s\n", docente);
                }
                if (op == 2){
                    System.out.println("Ingrese el valor de la factura ");
                    double valorF = entrada.nextDouble();
                    System.out.println("Ingrese el porcentaje de iva a descontar");
                    double iva = entrada.nextDouble();

                    DocenteFactura docente1 = new DocenteFactura();
                    docente1.establecerNombres(nombre);
                    docente1.establecerIdentificacion(cedula);
                    docente1.establecerValorFactura(valorF);
                    docente1.establecerIva(iva);
                    docente1.calcularValorCancelar();
                    System.out.printf("%s\n", docente1);
                }
            } else {
            System.out.println("Opcion no valida");
        }

    }

}
