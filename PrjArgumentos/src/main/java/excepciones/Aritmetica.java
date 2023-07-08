package excepciones;

import excepciones.OperacionesExcepcion;

public class Aritmetica {

    public static int  division(int numerador, int denominador)
            {

        if (denominador == 0) {
            //throw arroja un excepion
            throw new OperacionesExcepcion("Division entre Cero");
        }
    return numerador/denominador;

    }
}
