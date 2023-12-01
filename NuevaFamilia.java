/**
 * Esta clase es el controlador del programa el cual contiene los if del menu donde invoca los metodos para el funcionamientol del programa
 * @author: Linda Ines Jimenez Vides
 * @version: 22 - agosto - 2021
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

class NuevaFamilia{

    Scanner sn = new Scanner(System.in);

    String id = "";
    String apellido = "";
    String ninos = "";
    String mascotas = "";

    /**
     * Metodo que pide el id, que corresponde al numero en que la familia llego y devuelve la variable
     * @return id 
     * @param NuevaFamilia Define a un nuevo objeto tipo Familia 
     */
    public String getId(NuevaFamilia nuevafamilia){
        System.out.println("ID: ");
        id = sn.nextLine();
        return id;
    }

    /**
     * Metodo que pide el apellido que identifica a la familia y devuelve la variable
     * @return apellido
     * @param NuevaFamilia Define a un nuevo objeto tipo Familia 
     */
    public String getApellido(NuevaFamilia nuevafamilia){
        System.out.println("Apellido: ");
        apellido = sn.nextLine();
        return apellido;
        }

    /**
     * Metodo que pide la cantidad de niños(0-17 años) que hay en la familia y devuelve la variable
     * @return niños
     * @param NuevaFamilia Define a un nuevo objeto tipo Familia 
     */
    public String getNinos(NuevaFamilia nuevafamilia){
        System.out.println("Niños: ");
        ninos = sn.nextLine();
        return ninos;
    }

    /**
     * Metodo que pide cuantas mascotas tiene en su hogar y devuelve la variable
     * @return mascotas
     * @param NuevaFamilia Define a un nuevo objeto tipo Familia 
     */
    public String getMascotas(NuevaFamilia nuevafamilia){
        System.out.println("Mascotas: ");
        mascotas = sn.nextLine();
        return mascotas;
    }

    /**
     * Metodo que crea una lista con la informacion solicitada anteriormente y la imprime y devuelve
     * @return datosfam
     * @param NuevaFamilia Define a un nuevo objeto tipo Familia 
     */
    public List<String> Familia(NuevaFamilia nuevafamilia){
        List<String> datosfam = Arrays.asList(id, apellido, ninos, mascotas);        
        System.out.println("Datos Familia: " +datosfam);
        return datosfam;
    }
}