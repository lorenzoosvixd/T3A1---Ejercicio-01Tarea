
package t3a1;

import java.util.Scanner;


public class CALIFICACIONES {
    private String nombre;
    private String apellidoPaterno; 
    private String apellidoMaterno; 
    private String grupo;
    private String carrera;
    private String nombreAsignatura; 
    private int calificaciones;
    private double promedio;
    
  
    public CALIFICACIONES () {}    //Metodo constrtuctor vacio  

    public CALIFICACIONES(String nombre, String apellidoPaterno, String apellidoMaterno, String grupo, String carrera, String nombreAsignatura, int calificaciones, double promedio) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.grupo = grupo;
        this.carrera = carrera;
        this.nombreAsignatura = nombreAsignatura;
        this.calificaciones = calificaciones;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
}
