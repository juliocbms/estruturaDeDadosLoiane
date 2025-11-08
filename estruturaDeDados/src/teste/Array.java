package teste;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {

            ArrayList<String> lista = new ArrayList<>();
            lista.add("A");
            lista.add("C");


        System.out.println(lista);
        lista.add(1,"B");

        System.out.println(lista);
        System.out.println(lista.contains("C"));
        System.out.println(lista.indexOf("B"));
    }
}
