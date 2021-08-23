import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

class Controlador {
    public static void main(String[] args){
        
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        NuevoPerro nuevoperro = new NuevoPerro();
        NuevaFamilia nuevafamilia = new NuevaFamilia();

        int opcion = 0;
        int opcion3 = 0;
        int opcion4 = 0;


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
