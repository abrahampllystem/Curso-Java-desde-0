package variables;

public class OperadoresCondicionales {

    public static void main(String[] args) {
        var num1=10;
        var valorMin=0;
        var valorMax=10;

        // el numero es mayor que 0 y menor igual que 10
        // true && true
        var resultado =  num1>=40 && num1 <=10;

        System.out.println("resultado = " + resultado);

        var resultado2 = num1>=20 & num1 <=20;
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = num1>=20 | num1 <=20;
        System.out.println("resultado2 = " + resultado3);


        var resultado4 = num1>=20 || num1 <=20;
        System.out.println("resultado2 = " + resultado4);
    }
}
