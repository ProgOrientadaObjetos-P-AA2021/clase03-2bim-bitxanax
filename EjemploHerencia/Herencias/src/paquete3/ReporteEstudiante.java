package paquete3;

import paquete2.Estudiante;
import paquete2.Policia;

import java.util.ArrayList;

/**
 *
 * @author bitxanax
 */
public class ReporteEstudiante extends Reporte{
    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c,ArrayList<Estudiante> lista) {
        super(c);
        this.lista = lista;
    }

    public double getPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void calcularPromedioMatriculas() {
        double suma = 0;

        int index = 0;
        for (Estudiante i : lista){
            suma = suma + lista.get(index).getMatricula();
            index ++;
        }

        this.promedioMatriculas = suma / lista.size();}

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sReporte de Estudiantes: \n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s \n", cadena,
                    lista.get(i).toString());
        }
        cadena = String.format("%sPromedio de matricula es: %.2f", cadena, promedioMatriculas);
        return cadena;
    }

}