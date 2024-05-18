public class Main {
    public static void main(String[] args) {
        Informacion persona1=new Informacion();
        persona1.setnombre("Andres");
        persona1.setapellido("Velazques");
        persona1.setgenero("Masculino");
        persona1.setedad(19);

        Informacion persona2=new Informacion();
        persona2.setnombre("Maria");
        persona2.setapellido("Pantoja");
        persona2.setgenero("Femenino");
        persona2.setedad(34);

        Informacion persona3=new Informacion();
        persona3.setnombre("luz");
        persona3.setapellido("Ceron");
        persona3.setgenero("Femenino");
        persona3.setedad(28);

        Informacion persona4=new Informacion();
        persona4.setnombre("Alirio");
        persona4.setapellido("Villota");
        persona4.setgenero("Masculino");
        persona4.setedad(47);

        Informacion persona5=new Informacion();
        persona5.setnombre("Anderson");
        persona5.setapellido("Martinez");
        persona5.setgenero("Masculino");
        persona5.setedad(25);

        //crear lista de personas
        Lista_datos listado = new Lista_datos();
        listado.agregarInformacion(persona1);
        listado.agregarInformacion(persona2);
        listado.agregarInformacion(persona3);
        listado.agregarInformacion(persona4);
        listado.agregarInformacion(persona5);

        //Procedimiento
        System.out.println("Primera persona = Nombre: " + persona1.getnombre() + ", Apellido: " + persona1.getapellido() + ", Genero: " + persona1.getgenero() + ", Edad: " + persona1.getedad());

        System.out.println("segunda persona = Nombre: " + persona2.getnombre() + ", Apellido: " + persona2.getapellido() + ", Genero: " + persona2.getgenero() + ", Edad: " + persona2.getedad());

        System.out.println("tercera persona = Nombre: " + persona3.getnombre() + ", Apellido: " + persona3.getapellido() + ", Genero: " + persona3.getgenero() + ", Edad: " + persona3.getedad());

        System.out.println("cuarta persona = Nombre: " + persona4.getnombre() + ", Apellido: " + persona4.getapellido() + ", Genero: " + persona4.getgenero() + ", Edad: " + persona4.getedad());

        System.out.println("quinta persona = Nombre: " + persona5.getnombre() + ", Apellido: " + persona5.getapellido() + ", Genero: " + persona5.getgenero() + ", Edad: " + persona5.getedad());

        System.out.println("el promedio total de las edades es : " + (persona1.getedad() + persona2.getedad() + persona3.getedad() + persona4.getedad() + persona5.getedad()));
  
        //contador de generos
        String genero1 = persona1.getgenero();
        String genero2 = persona2.getgenero();
        String genero3 = persona3.getgenero();
        String genero4 = persona4.getgenero();
        String genero5 = persona5.getgenero();

        //procedimiento de contadores
        int masculino = 0;
        int femenino = 0;

        String[] generos = {genero1, genero2, genero3, genero4, genero5};

        for (String genero : generos){
            if (genero.equalsIgnoreCase("masculino")){
                masculino++;
            }else if (genero.equalsIgnoreCase("femenino")){
                femenino++;
            }
        }
        System.out.println("el numero de personas con genero masculino es: " + masculino);
        System.out.println("el numero de personas con genero femenino es: " + femenino);
    }
}
