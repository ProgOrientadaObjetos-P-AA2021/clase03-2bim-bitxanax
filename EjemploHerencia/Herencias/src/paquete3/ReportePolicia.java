package paquete3;

import paquete2.Policia;
import paquete2.Docente;
import paquete2.Policia;

import java.util.ArrayList;

/**
 *
 * @author bitxanax
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(ArrayList<Policia> lista, String c) {
        super(c);
        this.lista = lista;
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }

    public void calcularPromedioEdades() {
        double suma = 0;

        int index = 0;
        for (Policia i : lista){
            suma = suma + lista.get(index).getEdad();
            index ++;
        }

        this.promedioEdades = suma / lista.size();
    }

    public ArrayList<Policia> getLista() {
        return lista;

    }

    public void setLista(ArrayList<Policia> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sReporte de Policias: \n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s \n", cadena,
                    lista.get(i).toString());
        }
        cadena = String.format("%sPromedio de edades es: %.2f", cadena,
                getPromedioEdades());
        return cadena;
    }

}