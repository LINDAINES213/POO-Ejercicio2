import java.util.Scanner;

public class Vista {
    
    Scanner sn = new Scanner(System.in);
    Modelo modelo = new Modelo();

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

    public int op4(Vista vista){
        int opcion4;

        String op = "\nA donde desea enviar al perrito?\n" +
                    "1. Perrera\n" +
                    "2. Nueva Familia\n";
        
        System.out.println(op);
        opcion4 = sn.nextInt();
        return opcion4;
        
    }

    public void datosPerro(Vista vista){
        System.out.println("Datos del perrito: ");
        modelo.nuevoperrito(modelo);
    }

    public void imprimirdatos(Vista vista){
        System.out.println("DATOS");
        modelo.datosingresados(modelo);
    }

    public void datosFamilia(Vista vista){
        System.out.println("Datos de la familia: ");
        modelo.nuevafam(modelo);
    }

    public void perrosperrera(Vista vista){
        System.out.println("Perros en la perrera: ");
        modelo.asignarperrera(modelo);
    }

    public void perrosfamilia(Vista vista){
        System.out.println("Perros con familia: ");
        modelo.asignarfam(modelo);
    }

    public void Salir(Vista vista){
        System.out.println("Gracias por su colaboración");
    }
}