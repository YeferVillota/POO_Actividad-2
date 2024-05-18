import java.util.ArrayList;
import java.util.List;
public class Lista_datos {  
    
    private List<Informacion> ListaDatos;

    //constructor
    public Lista_datos(){
        this.ListaDatos = new ArrayList<Informacion>();
    }
   
    public void agregarInformacion(Informacion nombre){
        ListaDatos.add(nombre);
    }

    public Informacion buscarNombre(String apellido){
        for(Informacion nombre : ListaDatos){
            if(nombre.getapellido().equals(apellido)){
                return nombre;
            }
        }
        return null;
    }
}
