package co.edu.ucundinamarca.taller5_1;

import java.util.Date;
import java.util.Objects;

public class Empleado {
    private String nombres;
    private String apellidos;
    private Integer fechaIngreso;
    private Double salario;

    public Empleado() {

    }

    public Empleado(String nombres, String apellidos, int fechaIngreso, double salario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Integer getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return String.format(nombres, apellidos, fechaIngreso, salario);
    }
    public boolean equals(Empleado obj) {
        if (obj.getNombres().equals(nombres)) {
            return true;
        } else {
            return false;
        }
    }
}

