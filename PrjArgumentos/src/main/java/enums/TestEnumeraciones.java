package enums;

public class TestEnumeraciones{

    public static void main(String[] args) {
        System.out.println("dia 0 :"+ EjemploEnumeraciones.DOMINGO);
        indicarDiaSemana(EjemploEnumeraciones.DOMINGO);

        System.out.println("Continente 4 :"+ Continentes.AFRICA);
        System.out.println("Nº de paises en el 4to continente :"+ Continentes.AFRICA.getPaises());


    }

    private static void indicarDiaSemana(EjemploEnumeraciones dia){
        switch (dia){
            case LUNES -> System.out.println("Primer dia de la semana");
            case MARTES -> System.out.println("Segundo dia de la semana");
            default -> System.out.println("No existe dia");
        }
    }
}
