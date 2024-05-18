public class Informacion {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    // Constructor vacio
    public Informacion(){
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }

    public String getapellido(){
        return apellido;
    }

    public void setapellido(String apellido){
        this.apellido=apellido;
    }

    public String getgenero(){
        return genero;
    }

    public void setgenero(String genero){
        this.genero=genero;
    }
    
    public int getedad(){
        return edad;
    }

    public void setedad(int edad){
        this.edad=edad;
    }
}