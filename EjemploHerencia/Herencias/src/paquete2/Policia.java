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
public class Policia extends Persona{
    private String rango;

    public Policia(String n, String a, int e, String rango){
        super(n, a, e);
        this.rango = rango;
    }

    @Override
    public void setNombre(String n){
        nombre = n.toUpperCase();
    }

    public void setRango(String rang){
        rango = rang;
    }

    public String getRango(){
        return rango;
    }


    @Override
    public String toString(){

        return String.format("%s - %s", super.toString(), rango);
    }

}