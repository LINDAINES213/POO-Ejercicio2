/**
 * Esta clase es el controlador del programa el cual contiene los if del menu donde invoca los metodos para el funcionamientol del programa
 * @author: Linda Ines Jimenez Vides
 * @version: 22 - agosto - 2021
 */

import java.util.Random;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

class NuevoPerro{
    String Nombre;
    String Raza;
    String Edad;
    int opcion4;
    int opcion3;

    //Creacion de un objeto tipo Random
    Random rand = new Random();

    /**
     * Metodo que da una edad aleatoria entre la lista de edades
     * @return Edad
     * @param NuevoPerro Define un nuevo objeto tipo perro
     */
    public String getEdad(NuevoPerro nuevoperro){
        //Creacion de lista de edades
        String[] edades = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        //Varible que indica que elija uno al azar entre los 10 elementos de la lista
        int cantidad = rand.nextInt(10);
        //Variable que indica la edad que se escogio al azar
        Edad = edades [cantidad];
        System.out.println("Edad (años): " +Edad);
        return Edad;
    }

    /**
     * Metodo que da una raza aleatoria entre la lista de razas
     * @return Raza
     * @param NuevoPerro Define un nuevo objeto tipo perro
     */
    public String getRaza(NuevoPerro Nuevoperro){
        //Creacion de lista de razas
        String[] razas = new String[] {"Pit bull terrier (Peligrosa)", "Dogo Guatemalteco (Peligrosa)", "Doberman (Peligrosa)", "Bulldog americano (Peligrosa)", "Rottweiler (Peligrosa)", "Mestizo", "Labrador", "Golden Retriever", "Beagle", "Pug"};
        //Variable que indica que se elija una raza al azar entre las 10 que hay en la lista
        int cantidad = rand.nextInt(10);
        //Variable que indica la raza que se escogio al azar
        Raza = razas [cantidad];
        System.out.println("Raza: " +Raza);
        return Raza;
    }

    /**
     * Metodo que da un nombre aleatorio entre la lista de nombres
     * @return Nombre
     * @param NuevoPerro Define a un objeto tipo perro
     */
    public String getNombre(NuevoPerro nuevoperro){
        //Creacion de lista nombres
        String[] nombres = new String[] {"Burbuja", "Dulce", "Kitty", "Kira", "Harry", "Camila", "Molly", "Jack", "Rosco", "Fito"};
        //Varibale que indica que elija un nombre al azar entre los 10 que hay en la lista
        int cantidad = rand.nextInt(10);
        //Variable que indica el nombre que se escogio al azar
        Nombre = nombres [cantidad];
        System.out.println("Nombre: " +Nombre);
        return Nombre;
    }

    //Creacion de una lista llamada datosperrito que contendra las variables anteriores
    List<String> datosperrito = new ArrayList<String>();

    /**
     * Metodo que agrega las variables dentro de la lista creada anteriormente y la devuelve e imprime
     * @return datosperrito
     * @param NuevoPerro Define a un objeto tipo perro
     */
    public List<String> Perro(NuevoPerro nuevoperro){ 
        datosperrito.add(Nombre);
        datosperrito.add(Raza);
        datosperrito.add(Edad);
        //datosperrito.add("-");
        System.out.println("\nDatos Perrito: " +datosperrito);
        return datosperrito;
    }

    /**
     * Metodo que agrega la lista de datosperrito dentro de otra lista para saber que estan asignados a la perrera
     * @return pperrera
     * @param NuevoPerro Define a un objeto tipo perro
     */
    public List<String> Perrera(NuevoPerro nuevoperro){
            List<String> pperrera = new ArrayList<String>(datosperrito);
            System.out.println(pperrera);
            return pperrera;
    }

    /**
     * Metodo que agrega la lista de datosperrito dentro de otra lista para saber que estan asignados a una familia
     * @return familiadop
     * @param NuevoPerro Define a un objeto tipo perro
     */
    public List<String> FamAdoptiva(NuevoPerro nuevoperro){
        List<String> familiadop = new ArrayList<String>(datosperrito);
        System.out.println(familiadop);
        return familiadop;
    }

}