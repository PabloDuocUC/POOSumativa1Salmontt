package model;

/**
 * Clase encarga de instanciar Empleados hereda de la superClase Persona
 */

public class Empleado extends Persona{

    private double salario;
    private boolean estaEnProyecto;  //utilizado para saber si esta asignado a un proyecto o no

    public Empleado(String nombre, String rut, String telefono, Direccion direccion, double salario, boolean estaEnProyecto) {
        super(nombre, rut, telefono, direccion);
        this.salario = salario;
        this.estaEnProyecto = estaEnProyecto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEstaEnProyecto() {
        return estaEnProyecto;
    }

    public void setEstaEnProyecto(boolean estaEnProyecto) {
        this.estaEnProyecto = estaEnProyecto;
    }

    @Override
    public String toString() {
        return  "Empleado{" +
                super.toString() +
                "salario=" + salario +
                ", estaEnProyecto=" + estaEnProyecto +
                '}';
    }
}
