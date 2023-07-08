package blockcode.domain;

import lombok.Getter;

@Getter
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    // bloque de inicializacion estatico
    //no se puede usar el this
    //se ejecuta una vez en el bloque de memoria
     static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
     }

     // bloque de inicializacion no estatico
    // se ejecuta antes del constructor
    // esto se ejecuta cada que se crea un objeto de la clase
    {
        System.out.println("Ejecucion  bloque no estatico");
        this.idPersona =Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }


    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                '}';
    }
}
