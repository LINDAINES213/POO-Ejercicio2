/**
 * Esta clase es el controlador del programa el cual contiene los if del menu donde invoca los metodos para el funcionamientol del programa
 * @author: Linda Ines Jimenez Vides
 * @version: 22 - agosto - 2021
 */

import java.util.Scanner;

public class Vista {

    //Creacion de contructor de la clase scanner
    Scanner sn = new Scanner(System.in);
    //Creacion de objeto tipo modelo
    Modelo modelo = new Modelo();

    //Vista del menu principal
    public int menuOp(Vista vista){
        
        int opcion;

        String menu = "\n¿Que opcion desea ejecutar?\n" +
                            "1. Nueva Familia\n" +
                            "2. Nuevo Perro\n" +
                            "3. Imprimir datos\n" +
                            "4. Asignar Mascota\n" +
                            "5. Salir\n";

        System.out.println(menu);
        opcion =  sn.nextInt();

        return opcion;
    }

    //Vista del menu cuando se elija la opcion 3 del menu principal
    public int op3(Vista vista){
        int opcion3;

        String ops = "Que datos desea ver?\n" +
                    "1. Datos recien ingresados\n" +
                    "2. Perros asignados a perrera\n" +
                    "3. Perros asignados a familia\n";

        System.out.println(ops);
        opcion3 = sn.nextInt();
        return opcion3;
    }

    //Vista del menu cuando se elija la opcion 4 del menu principal
    public int op4(Vista vista){
        int opcion4;

        String op = "\nA donde desea enviar al perrito?\n" +
                    "1. Perrera\n" +
                    "2. Nueva Familia\n";
        
        System.out.println(op);
        opcion4 = sn.nextInt();
        return opcion4;
        
    }

    /**
     * Metodo que llama a un metodo para brindar e imprimir los datos del perro
     * @param Vista Define a un nuevo objeto tipo vista 
     */
    public void datosPerro(Vista vista){
        System.out.println("Datos del perrito: ");
        modelo.nuevoperrito(modelo);
    }

    /**
     * Metodo que llama a un metodo para brindar e imprimir los datos recien dados e ingresados tanto del perro como de la familia
     * @param Vista Define a un nuevo objeto tipo vista 
     */
    public void imprimirdatos(Vista vista){
        System.out.println("DATOS");
        modelo.datosingresados(modelo);
    }

    /**
     * Metodo que llama a un metodo para brindar e imprimir los datos del la familia recien ingresada
     * @param Vista Define a un nuevo objeto tipo vista 
     */
    public void datosFamilia(Vista vista){
        System.out.println("Datos de la familia: ");
        modelo.nuevafam(modelo);
    }

    /**
     * Metodo que llama a un metodo para brindar e imprimir los datos de los perros en la perrera
     * @param Vista Define a un nuevo objeto tipo vista 
     */
    public void perrosperrera(Vista vista){
        System.out.println("Perros en la perrera: ");
        modelo.asignarperrera(modelo);
    }

    /**
     * Metodo que llama a un metodo para brindar e imprimir los datos de los perros asignados a una familia
     * @param Vista Define a un nuevo objeto tipo vista 
     */
    public void perrosfamilia(Vista vista){
        System.out.println("Perros con familia: ");
        modelo.asignarfam(modelo);
    }

    /**
     * Metodo que imprime un mensaje a la hora de terminar de utilizar el programa
     * @param Vista Define a un nuevo objeto tipo vista 
     */
    public void Salir(Vista vista){
        System.out.println("Gracias por su colaboración");
    }
}