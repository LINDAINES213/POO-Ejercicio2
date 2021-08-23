/**
 * Esta clase es el controlador del programa el cual contiene los if del menu donde invoca los metodos para el funcionamientol del programa
 * @author: Linda Ines Jimenez Vides
 * @version: 22 - agosto - 2021
 */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

class Controlador {
    public static void main(String[] args){
        
        //Creacion de objeto tipo vista
        Vista vista = new Vista();
        //Creacion de objeto tipo modelo
        Modelo modelo = new Modelo();
        //Creacion de objeto tipo perro
        NuevoPerro nuevoperro = new NuevoPerro();
        //Creacion de objeto tipo familia
        NuevaFamilia nuevafamilia = new NuevaFamilia();

        int opcion = 0;
        int opcion3 = 0;
        int opcion4 = 0;

        // If del menu impreso desde la clase vista donde se colocan los metodos para llamar a otroa previamente programados para que funcione el programa completo
        while (opcion != 5){
            
            opcion = vista.menuOp(vista);

            if (opcion == 1){

                vista.datosFamilia(vista);

            } else if (opcion == 2){

                vista.datosPerro(vista);

            } else if (opcion == 3){
                opcion3 = vista.op3(vista);
                if (opcion3 == 1){
                    vista.imprimirdatos(vista);
                } else if (opcion3 == 2){
                    vista.perrosperrera(vista);
                } else if (opcion3 == 3){
                    vista.perrosfamilia(vista);
                }

                
            } else if (opcion == 4){

                opcion4 = vista.op4(vista);
                if (opcion4 == 1){
                    vista.perrosperrera(vista);
                } else if (opcion4 == 2){
                    vista.perrosfamilia(vista);
                }
                
            } else if (opcion == 5){
                vista.Salir(vista);
                
            }
        }
    }
}
