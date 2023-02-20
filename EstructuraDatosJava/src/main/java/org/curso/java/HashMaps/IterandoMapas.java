package org.curso.java.HashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterandoMapas {

    public static void main(String[] args) {
        Map<String, Integer> asignaturas= new HashMap<>();

        asignaturas.put("POO", 5);
        asignaturas.put("EDD", 5);
        asignaturas.put("FUND. DE PROG.",5);
        asignaturas.put("FISICA",4);

        Set<Map.Entry<String,Integer>> entries =asignaturas.entrySet();
        for (Map.Entry<String,Integer> entry:entries){
            System.out.println("Asignatura: "+entry.getKey() +"  Creditos: "+entry.getValue());
        }

        //Lista asiganturas
        System.out.println("Lista de asignaturas----------");
        for (String lista: asignaturas.keySet()){
            System.out.println("Nombre de las asigantura: " +lista);
        }

        //Lista asiganturas otra forma
        System.out.println("Lista de asignaturas----------");
        for (Integer materias: asignaturas.values()){
            System.out.println("Nombre de las asigantura: " + materias);
        }


        System.out.println("Usando la interfaz iterator");
        for (Iterator<Map.Entry<String,Integer>> iter=asignaturas.entrySet().iterator(); iter.hasNext();){
            Map.Entry<String,Integer> entry=iter.next();
            String asignatura=entry.getKey();
            String creditos= String.valueOf(entry.getValue());

            System.out.println("Asignatura: " +asignatura + " Creditos: " +creditos);
        }

    }
}
