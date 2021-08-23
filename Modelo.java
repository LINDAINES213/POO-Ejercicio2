import java.util.ArrayList;
import  java.util.Arrays;

public class Modelo {

    NuevaFamilia nuevafamilia = new NuevaFamilia();
    NuevoPerro nuevoperro = new NuevoPerro();

    int opcion2;
    int opcion3;
    
    public void nuevafam(Modelo modelo){
        nuevafamilia.getId(nuevafamilia);
        nuevafamilia.getApellido(nuevafamilia);
        nuevafamilia.getNiños(nuevafamilia);
        nuevafamilia.getMascotas(nuevafamilia);
    }
 
    public void nuevoperrito (Modelo modelo){
        nuevoperro.getNombre(nuevoperro);
        nuevoperro.getRaza(nuevoperro);
        nuevoperro.getEdad(nuevoperro);
    }

    public void datosingresados(Modelo modelo){
        nuevafamilia.Familia(nuevafamilia);
        nuevoperro.Perro(nuevoperro);
    }

    public void asignarperrera(Modelo modelo){
        nuevoperro.Perrera(nuevoperro);
    }

    public void asignarfam(Modelo modelo){
        nuevoperro.FamAdoptiva(nuevoperro);
    }
}
