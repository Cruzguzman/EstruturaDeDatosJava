package org.curso.java.Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Listas {
    public static void main(String[] args) {
        //primera forma o opcion
        List<String> list= new ArrayList<>();

        //agregando elementos
        list.add("Java");
        list.add("Python");
        list.add("C #");


        //otra forma
        String[] versiones={"Version 1.0", "Version 8", "Version 2023"};

        List<String> listVersiones= Arrays.asList(versiones);

        //construir lista  aprtir de otra lista
        List<String> hijaList= new ArrayList<>(list);

        //Agregando elementos de otra coleccion
        hijaList.addAll(listVersiones);

        System.out.println("---lista de versiones----");
        listVersiones.forEach(System.out::println);
        System.out.println("---Lista Lenguajes----");
        list.forEach(System.out::println);
        System.out.println("---Lista Lenguajes y Versiones----");
        hijaList.forEach(System.out::println);

        ListIterator<String> iterador= list.listIterator();

        System.out.println("\n Iterando listas");

        while (iterador.hasNext()){
            System.out.println("Lenguaje: " + iterador.next());
        }

        System.out.println("\n Iteracion inversa");

        while (iterador.hasPrevious()){
            System.out.println("Lenguaje: " + iterador.previous());
        }

        System.out.println("\n Iteracion eliminando elemento");

        while (iterador.hasNext()){
            if (iterador.next().equals("C #")){
                iterador.remove();

            }
            System.out.println("\n Sin C #");

            for (ListIterator<String> miIterador= list.listIterator(); miIterador.hasNext();){
                System.out.println("Lenguajes: " + miIterador.next());
            }
        }
    }
}
