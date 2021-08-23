import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

class NuevaFamilia{

    Scanner sn = new Scanner(System.in);

    String id = "";
    String apellido = "";
    String niños = "";
    String mascotas = "";

    public String getId(NuevaFamilia nuevafamilia){
        System.out.println("ID: ");
        id = sn.nextLine();
        return id;
    }

    public String getApellido(NuevaFamilia nuevafamilia){
        System.out.println("Apellido: ");
        apellido = sn.nextLine();
        return apellido;
        }

    public String getNiños(NuevaFamilia nuevafamilia){
        System.out.println("Niños: ");
        niños = sn.nextLine();
        return niños;
    }

    public String getMascotas(NuevaFamilia nuevafamilia){
        System.out.println("Mascotas: ");
        mascotas = sn.nextLine();
        return mascotas;
    }

    public List<String> Familia(NuevaFamilia nuevafamilia){
        List<String> datosfam = Arrays.asList(id, apellido, niños, mascotas);        
        System.out.println("Datos Familia: " +datosfam);
        return datosfam;
    }
}