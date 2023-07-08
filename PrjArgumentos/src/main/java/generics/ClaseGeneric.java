package generics;

public class ClaseGeneric<T>  {

    private T objeto;

    public ClaseGeneric(T objeto){
        this.objeto=objeto;
    }

    public void obtenerType(){
        System.out.println("El tipo T es :" + this.objeto.getClass().getSimpleName());
    }
}
