/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanomina;

import POL.*;

/**
 *
 * @author DIEGO VARGAS1
 */
public class SistemaNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Diego", " Vargas", "150", 800.00);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Gustavo", " Vallejo", "222", 5000, .04, 300);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Jorge", " Valles", "333", 1000, .06);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Luis", " Lopez", "444", 16.75, 40);

        System.out.println("Se procesa empleado por separado");
        System.out.printf("%s\n%s:  $%.2f\n\n", empleadoAsalariado, "Ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s:  $%.2f\n\n", empleadoBaseMasComision, "Ingresos", empleadoBaseMasComision.ingresos());
        System.out.printf("%s\n%s:  $%.2f\n\n", empleadoPorComision, "Ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s:  $%.2f\n\n", empleadoPorHoras, "Ingresos", empleadoPorHoras.ingresos());
        Empleado[] empleados = new Empleado[4];
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoBaseMasComision;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoPorHoras;

        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual);
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());
                System.out.printf("El nuevo salario base con 10%% de incremento es: 4%,.2f\n", empleado.obtenerSalarioBase());

            }
            System.out.printf("Ingresos $%,.2f\n\n", empleadoActual.ingresos());

            for (int j = 0; j < empleados.length; j++) {
                System.out.printf("El empleado %d es un %s\n", j, empleados[j].getClass().getName());
            }

        }/*
 PorPagar []objetosPorPagar =new PorPagar[4];
        objetosPorPagar[0]=new Factura("0123", "Silla",2,375.00);
        objetosPorPagar[1]=new Factura("01234","Escritorio",3,79.55);
        objetosPorPagar[2]=new EmpleadoAsalariado("Luis","Escobar","1111",800.00);
        objetosPorPagar[3]=new EmpleadoAsalariado("Luisa","Reyes","2222",1000.00);
        System.out.println("FACTURAS Y EMPLEADOS PROCESADOS DE FORMA POLIMORFICA \n");
        for(PorPagar porPagarActual:objetosPorPagar){
            System.out.printf("%s \n%s: $%,.2f\n\n",porPagarActual.toString(),"Pago Vencido",porPagarActual.obtenerMontoPago());
        }*/
        
        
    }
    }
