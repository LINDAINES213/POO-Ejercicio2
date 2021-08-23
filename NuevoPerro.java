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


    Random rand = new Random();

    public String getEdad(NuevoPerro nuevoperro){
        //Creacion de lista de colores
        String[] edades = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        //Varible que indica que eliga uno al azar entre los 4 elementos de la lista
        int cantidad = rand.nextInt(10);
        //Variable que indica el color que se escogio al azar
        Edad = edades [cantidad];
        System.out.println("Edad: " +Edad);
        return Edad;
    }

    /**
     * Metodo que da una raza aleatoria entre la lista de razas
     */
    public String getRaza(NuevoPerro Nuevoperro){
        //Creacion de lista de razas
        String[] razas = new String[] {"Pit bull terrier", "Dogo Guatemalteco", "Doberman", "Bulldog americano", "Rottweiler", "Mestizo", "Labrador", "Golden Retriever", "Beagle", "Pug"};
        //Variable que indica que se elija una raza al azar entre las 5 que hay en la lista
        int cantidad = rand.nextInt(10);
        //Variable que indica la raza que se escogio al azar
        Raza = razas [cantidad];
        System.out.println("Raza: " +Raza);
        return Raza;
    }

    /**
     * Metodo que da un nombre aleatorio entre la lista de colores
     */
    public String getNombre(NuevoPerro nuevoperro){
        //Creacion de lista nombres
        String[] nombres = new String[] {"Burbuja", "Dulce", "Kitty", "Kira", "Harry", "Camila", "Molly", "Jack", "Rosco", "Fito"};
        //Varibale que indica que elija un nombre al azar entre los 7 que hay en la lista
        int cantidad = rand.nextInt(10);
        //Variable que indica el nombre que se escogio al azar
        Nombre = nombres [cantidad];
        System.out.println("Nombre: " +Nombre);
        return Nombre;
    }

    List<String> datosperrito = new ArrayList<String>();


    public List<String> Perro(NuevoPerro nuevoperro){ 
        datosperrito.add(Nombre);
        datosperrito.add(Raza);
        datosperrito.add(Edad);
        //datosperrito.add("-");
        System.out.println("\nDatos Perrito: " +datosperrito);
        return datosperrito;
        
    }

    public List<String> Perrera(NuevoPerro nuevoperro){
            List<String> pperrera = new ArrayList<String>(datosperrito);
            System.out.println(pperrera);
            return pperrera;
    }

    public List<String> FamAdoptiva(NuevoPerro nuevoperro){
        List<String> familiadop = new ArrayList<String>(datosperrito);
        System.out.println(familiadop);
        return familiadop;
    }

}