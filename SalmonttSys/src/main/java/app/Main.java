package app;
/**
 * Programa donde se instanciaron tanto direcciones como empleados para ejemplificar por consola la salida de datos
 */

import model.Direccion;
import model.Empleado;

public class Main {
    public static void main(String[] args) {

        Direccion direccionEmpleado1 = new Direccion("Calle1", "Calama", "Antofagasta");
        Direccion direccionEmpleado2 = new Direccion("Calle2", "Antofagasta", "Antofagasta");
        Direccion direccionEmpleado3 = new Direccion("Calle3", "Tocopilla", "Antofagasta");


        Empleado empleado1 = new Empleado(
                "Juan",
                "123456789-0",
                "999999999",
                direccionEmpleado1,
                900000,
                false
        );
        Empleado empleado2 = new Empleado(
                "Carlos",
                "123456789-1",
                "888888888",
                direccionEmpleado2,
                800000,
                true
        );
        Empleado empleado3 = new Empleado(
                "Makarena",
                "123456789-2",
                "777777777",
                direccionEmpleado3,
                700000,
                true
        );

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
    }
}