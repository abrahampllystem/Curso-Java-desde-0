public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3,5,4);
        System.out.println("=====================");
        imprimirNumeros(1,2);
    }

    private static void imprimirNumeros(int ... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos: "+ numeros[i]);
        }
    }
}
