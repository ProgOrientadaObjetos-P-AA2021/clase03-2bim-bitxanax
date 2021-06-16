/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;


/**
 *
 * @author reroes
 */
public class Estudiante extends Persona{
    private double matricula;
    
    public Estudiante(String n, String a, int e, double matricula){
        super(n, a, e);
        this.matricula = matricula;
    }
    
    @Override
    public void setNombre(String n){
        nombre = n.toUpperCase();    
    }
    
    public void setMatricula(double matricula){
        this.matricula = matricula;
    }
    
    public double getMatricula(){
        return matricula;
    }

    @Override
    public String toString(){
        return String.format("%s - %f", super.toString(), matricula);
    }
}
