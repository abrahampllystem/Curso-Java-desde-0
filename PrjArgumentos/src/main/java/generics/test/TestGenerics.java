package generics.test;

import generics.ClaseGeneric;

public class TestGenerics {
    public static void main(String[] args) {

        ClaseGeneric<Integer>  objeto = new ClaseGeneric<>(15);
        objeto.obtenerType();
    }
}
