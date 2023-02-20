package org.curso.java.Conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntosInterseccion {
    public static void main(String[] args) {
        // Interseccion de conjuntos(cadenas)

        Set<String> hashSet= new HashSet<>();
        hashSet.add("Soporte");
        hashSet.add("Celular");
        hashSet.add("Brocha");
        hashSet.add("Raton");
        hashSet.add("Laptop");
        hashSet.add("Lentes");
        hashSet.add("Lentes");
        hashSet.add("Audifonos");

        System.out.println("Lista de objetos: " +hashSet);

        Set<String> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add("Arbol");
        linkedHashSet.add("Casa");
        linkedHashSet.add("Perro");
        linkedHashSet.add("Gato");
        linkedHashSet.add("Hormiga");
        linkedHashSet.add("Hormiga");
        linkedHashSet.add("Arbol");
        linkedHashSet.add("Escoba");

        System.out.println("Lista de objetos: " +linkedHashSet);

    }
}
