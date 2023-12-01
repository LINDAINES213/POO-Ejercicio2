/**
 * Esta clase es el controlador del programa el cual contiene los if del menu donde invoca los metodos para el funcionamientol del programa
 * @author: Linda Ines Jimenez Vides
 * @version: 22 - agosto - 2021
 */

import java.util.ArrayList;
import  java.util.Arrays;

public class Modelo {
    
    //Creacion de objeto tipo familia
    NuevaFamilia nuevafamilia = new NuevaFamilia();
    //Creacion de objeto tipo perro
    NuevoPerro nuevoperro = new NuevoPerro();

    int opcion2;
    int opcion3;
    
    /**
     * Metodo que llama a los metodos que brindan los datos de la familia
     * @param Modelo Define a un nuevo objeto tipo modelo 
     */
    public void nuevafam(Modelo modelo){
        nuevafamilia.getId(nuevafamilia);
        nuevafamilia.getApellido(nuevafamilia);
        nuevafamilia.getNinos(nuevafamilia);
        nuevafamilia.getMascotas(nuevafamilia);
    }
    
    /**
     * Metodo que llama a los metodos que brindan los datos del perrito que se dara en adopcion
     * @param Modelo Define a un nuevo objeto tipo modelo 
     */
    public void nuevoperrito (Modelo modelo){
        nuevoperro.getNombre(nuevoperro);
        nuevoperro.getRaza(nuevoperro);
        nuevoperro.getEdad(nuevoperro);
    }

    /**
     * Metodo que llama a los metodos que contienen las listas con la infromacion del perro y la familia
     * @param Modelo Define a un nuevo objeto tipo modelo 
     */
    public void datosingresados(Modelo modelo){
        nuevafamilia.Familia(nuevafamilia);
        nuevoperro.Perro(nuevoperro);
    }
    
    /**
     * Metodo que asigna al perro en la perrera y llama a los metodos que brindan la lista de perros que estan en la perrera asignados
     * @param Modelo Define a un nuevo objeto tipo modelo 
     */
    public void asignarperrera(Modelo modelo){
        nuevoperro.Perrera(nuevoperro);
    }

    /**
     * Metodo que asigna al perro a la familia y llama a los metodos que brindan la lista de perros que estan con una familia asignada
     * @param Modelo Define a un nuevo objeto tipo modelo 
     */
    public void asignarfam(Modelo modelo){
        nuevoperro.FamAdoptiva(nuevoperro);
    }
}
