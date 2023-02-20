package org.curso.java.Conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Set<Integer> a= new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Set<Integer> b= new HashSet<>(Arrays.asList(8,9,10,11));

        //union de conjuntos(suma de elementos sin repeticion
        Set<Integer> union= new HashSet<>(a);
        union.addAll(b);

        System.out.println("La union del conjunto a, b es: " + union);

        //interseccion de conjuntos
        Set<Integer> interseccion= new HashSet<>(a);
        interseccion.retainAll(b);
        System.out.println("La interseccion del conjunto a y b es: " + interseccion);

        //Diferencia de conjuntos
        Set<Integer> diferencia= new HashSet<>(a);
        diferencia.removeAll(b);
        System.out.println("Conjunto a: "+ a);
        System.out.println("Conjunto b: " + b);
        System.out.println("La diferencia entre los conjuntos a-b es: " +diferencia);
    }
}
