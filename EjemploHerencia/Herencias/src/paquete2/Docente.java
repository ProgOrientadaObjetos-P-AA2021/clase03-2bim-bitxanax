/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author bitxanax
 */
public class Docente extends Persona{
    private double sueldo;
    public Docente(String n, String a, int e, double sueldo){
        super(n, a, e);
        this.sueldo = sueldo;
    }

    @Override
    public void setNombre(String n){
        nombre = n.toUpperCase();
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public double getSueldo(){
        return sueldo;
    }

    public String toString(){

        return String.format("%s - %.2f", super.toString(), sueldo);
    }
}