package excepciones.test;

import excepciones.OperacionesExcepcion;

import static excepciones.Aritmetica.division;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado =0;
        try {
            resultado = division(resultado, 0);
            //siempre las de menor jerarquia y al final de la mayor jerarquia
        }catch (OperacionesExcepcion e){
            System.out.println("Ocurrion un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrio un error  de tipo Exception: ");
//            e.printStackTrace(System.out);
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("se reviso la division entre cero");
        }
        System.out.println("resultado :"+ resultado);
    }
}
