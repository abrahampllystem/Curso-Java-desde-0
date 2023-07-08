package variables;

public class TestVariables {
    public static void main(String[] args) {
        int miVariable=10;

        System.out.println(miVariable);
        //modificando la variable
        miVariable=20;
        System.out.println(miVariable);

        //var inferencia de tipos de en java
        var mivariable2=20;
        System.out.println("mi variable2 :"+mivariable2);

        // no aceptan caracteres especiales pero si el _ y el $ , no debe comenzar con numero
        var _e=12;
        System.out.println(_e);

        //concatenacion de cadenas
        var user= "juan" ;
        var title= "Ingeniero";
        var union= title + " "+user;
        System.out.println("concatenacion :"+union);
    }
}
