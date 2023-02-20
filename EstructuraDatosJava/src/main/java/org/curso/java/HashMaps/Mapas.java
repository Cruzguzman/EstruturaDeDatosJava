package org.curso.java.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map<String, String> alumnos= new HashMap<>();

        //insertar elementos
        alumnos.put("Miguel", "Cruz");
        alumnos.put("Angel", "Guzman");
        alumnos.put("Abcd",null);


        //utilizando el constructor de la interfaz
        Map<String, String> copiaAlumnos= new HashMap<>(alumnos);

        //Añadir valor si hay null
        alumnos.putIfAbsent("Abcd","Total");
        System.out.println("El apellido de Abcd es: " + alumnos.get("Abcd"));

        //Obteniendo valores de un Map

        String alumnoUno= alumnos.get("Miguel");
        System.out.println("El apellido de Miguel es: "+ alumnoUno);

        String desconocido= alumnos.getOrDefault("Miguel Angel","No esta en la coleccion");
        System.out.println("El registro " +desconocido);


        if (alumnos.containsKey("Miguel")){
            System.out.println("El apellido de Miguel es: " +alumnos.get("Miguel"));


        }else {
            System.out.println("No se encuentra el nombre del alumno");
        }


        //coincidencias
        System.out.println("Alumno con apellido: " +alumnos.containsValue("Guzman"));


        //Lista alumnos registrados
        System.out.println("####################################3");
        System.out.println(alumnos.keySet());


        //Lista de apellidos
        System.out.println("###########Lista de apellidos##############");
        System.out.println(alumnos.values());

        //No funciona
      alumnos.replace("Total","Deaquino");
        System.out.println(alumnos.get("Total"));


        //Eliminar llave-valor
        System.out.println("######################################33");
        System.out.println("Elinando primera entrada: "+alumnos.containsKey("Miguel"));
        alumnos.remove("Miguel");

        //Tamaño del mapa
        System.out.println("##############################");
        System.out.println("El tamaño del mapa es: " +alumnos.size());

        //Verificar contenido del mapa

        System.out.println("###############################");
        if (alumnos.isEmpty()){
            System.out.println("Sin registros");
        }else {
            System.out.println("Registros encontrados");
            System.out.println(copiaAlumnos.keySet());

        }
        //Limpiar mapa
        System.out.println("Limpiando mapa");
        alumnos.clear();
        System.out.println(alumnos.size());

    }
}
