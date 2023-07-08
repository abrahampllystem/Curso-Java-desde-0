package clases;

import lombok.Getter;
import lombok.Setter;

public class EjemploClase {


    public static void main(String[] args) {
        Persona objPerso;
        objPerso =new Persona();
        objPerso.setNombre("carlitos");
        objPerso.setApellido("tevez");
        objPerso.desplegarInfo();


    }
}

@Setter
@Getter
class Persona{
    private String nombre;
    private String apellido;

    public void desplegarInfo(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

}