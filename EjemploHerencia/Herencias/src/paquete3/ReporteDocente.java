package paquete3;

import paquete2.Docente;
import java.util.ArrayList;

/**
 *
 * @author bitxanax
 */
public class ReporteDocente extends Reporte {
    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String c, ArrayList<Docente> lista) {
        super(c);
        this.lista = lista;
    }

    public double getPromedioSueldos() {
        return promedioSueldos;
    }

    public void calcularPromedioSueldos() {
        double suma = 0;

        int index = 0;
        for (Docente i : lista){
            suma = suma + lista.get(index).getSueldo();
            index ++;
        }

        this.promedioSueldos = suma / lista.size();
    }

    public ArrayList<Docente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Docente> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sReporte de Docentes: \n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s \n", cadena,
                    lista.get(i).toString());
        }
        cadena = String.format("%sPromedio de sueldos: %.2f", cadena, promedioSueldos);
        return cadena;
    }
}