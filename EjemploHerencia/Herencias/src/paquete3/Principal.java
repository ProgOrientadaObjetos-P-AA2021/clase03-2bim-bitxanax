package paquete3;

import paquete2.*;
import java.util.ArrayList;

/**
 *
 * @author Jose Cordova
 */
public class Principal {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("René", "Elizalde", 23, 100.2);
        Docente doc1 = new Docente("José", "Maria", 20, 1101);
        Policia pol1 = new Policia("María", "Mendoza", 33, "Cabo");
        Estudiante est2 = new Estudiante("Patricia", "Velez", 31, 100.2);
        Docente doc2 = new Docente("Jorsh", "Alvarez", 38, 1000);
        Policia pol2 = new Policia("Alexias", "Medina", 33, "Cabo");

        Estudiante est3 = new Estudiante("Jorge", "Marci", 23, 1009.5);
        Docente doc3 = new Docente("Alvarez", "Jorgito", 58, 822);
        Policia pol3 = new Policia("Marco", "Torrez", 60, "Coronel");

        ArrayList listaDocente = new ArrayList<>();
        listaDocente.add(doc1);
        listaDocente.add(doc2);
        listaDocente.add(doc3);

        ArrayList listaEstudiante = new ArrayList<>();
        listaEstudiante.add(est1);
        listaEstudiante.add(est2);
        listaEstudiante.add(est3);

        ArrayList listaPolicia = new ArrayList<>();
        listaPolicia.add(pol1);
        listaPolicia.add(pol2);
        listaPolicia.add(pol3);

        ReporteDocente rd = new ReporteDocente("0001Doc", listaDocente);
        rd.calcularPromedioSueldos();
        ReporteEstudiante re = new ReporteEstudiante("0001Est", listaEstudiante);
        re.calcularPromedioMatriculas();
        ReportePolicia rp = new ReportePolicia(listaPolicia, "0001Pol");

        rp.calcularPromedioEdades();

        System.out.println(rd);
        System.out.println("");
        System.out.println(re);
        System.out.println("");
        System.out.println(rp);
    }
}