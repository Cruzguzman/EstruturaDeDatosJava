package org.curso.java.comparadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparadores {
    public static void main(String[] args) {
        List<String> cosas= new ArrayList<>();

        cosas.add("Zacatin");
        cosas.add("Brocha");
        cosas.add("Lampara");
        cosas.add("Mochila");
        cosas.add("Raton");
        cosas.add("Alambre");

        System.out.println("Lista de cosas");
        System.out.println(cosas);

        //ordenando lista
        Collections.sort(cosas);
        System.out.println("Lista ordenada");
        System.out.println(cosas);

        //ordenacion inversa

        System.out.println("Lista desordena");
        Collections.sort(cosas,Collections.reverseOrder());
        System.out.println(cosas);


        //Lista con numeros

        List<Integer> numeros= new ArrayList<>();

        numeros.add(3);
        numeros.add(5);
        numeros.add(67);
        numeros.add(5);
        numeros.add(8);
        numeros.add(1);

        System.out.println("Lista de numeros");
        System.out.println(numeros);

        //ordenando lista
        Collections.sort(numeros);
        System.out.println("Lista ordenada");
        System.out.println(numeros);

        //ordenacion inversa

        System.out.println("Lista desordena");
        Collections.sort(numeros,Collections.reverseOrder());
        System.out.println(numeros);

    }

}
