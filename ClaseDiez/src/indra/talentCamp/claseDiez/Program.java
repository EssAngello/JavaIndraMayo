package indra.talentCamp.claseDiez;

import java.time.*;
import java.util.*;

public class Program {

    public static void main(String[] args) {
        //Manejo de fechas
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        LocalDateTime fechaYHora = LocalDateTime.now();
        System.out.println(fechaYHora);

        //LocalDate fechaEspecifica = LocalDate.of(2023, Month.FEBRUARY, 10);
        LocalDate cumpleBorja = LocalDate.of(2023, Month.DECEMBER, 24);
        System.out.printf("Feliz cumple el %d del mes %d del año %d", cumpleBorja.getDayOfMonth(), cumpleBorja.getMonthValue(), cumpleBorja.getYear());

        LocalDate navidad = cumpleBorja.plusDays(1);
        System.out.println("Feliz Navidad");
        System.out.println(navidad);

        if(cumpleBorja.isBefore(navidad)){
            System.out.println("Borja cumple antes de la navidad");
        }

        Period periodo = Period.between(cumpleBorja, navidad);
        System.out.printf("Hay %d anyos, %d meses, %d días entre el cumple de Borja y la Navidad\n",
                periodo.getYears(),
                periodo.getMonths(),
                periodo.getDays());

        Duration duracion = Duration.between(LocalTime.now(), LocalTime.now().plusHours(1));
        System.out.println(duracion.getSeconds());

        //manejo strings
        String textoo = "Hola que tal como estan todos";
        List<String> palabrass = Arrays.asList(textoo.split(" "));
        palabrass.forEach(System.out::println);

        //Diccionarios
        Map<String, String> diccionarioo = new HashMap<>();
        diccionarioo.put("casa", "Lugar donde vive la gente");
        if(!diccionarioo.containsKey("auto")){
            diccionarioo.put("auto", "Vehiculo que te lleva de un lado a otro");
        }

        for (var entrada : diccionarioo.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        //ejercicio
        /*---------------------------------------------------------------------------------------*/
        System.out.println();
        System.out.println();
        System.out.println("EJERCICIO");
        System.out.println();
        System.out.println();

        String texto = "Texto ejemplo para el ejercicio de la Clase Diez de Java";

        Map<String, Integer> diccionario = new HashMap<>();

        List<String> palabras = Arrays.asList(texto.split(" ")); // Dividir por espacios en blanco

        for (String palabra : palabras) {

            int ocurrencia = diccionario.getOrDefault(palabra, 0);

            diccionario.put(palabra, ocurrencia + 1);
        }

        for (Map.Entry<String, Integer> entry : diccionario.entrySet()) {
            String palabra = entry.getKey();
            int ocurrencia = entry.getValue();
            System.out.println("Palabra: " + palabra + ", Ocurrencias: " + ocurrencia);
        }

        //Ejemplo de SET
        Set<String> conjunto = new HashSet<>();
        conjunto.add("casa");
        conjunto.add("casa");
        conjunto.add("casa");
        conjunto.add("mesa");
        conjunto.add("mesa");
        conjunto.add("mesa");

        System.out.println(conjunto.size());

        for(var e: conjunto){
            System.out.println(e);
        }

        //Priority Queue
        Queue<Integer> prioridades = new PriorityQueue<>();
        prioridades.offer(9);
        prioridades.offer(19);
        prioridades.offer(49);
        prioridades.offer(2);
        prioridades.offer(4);

        System.out.println("Valor mas alto: " + prioridades.peek());

        System.out.println("Valor mas alto: " + prioridades.poll());
        prioridades.offer(1);
        System.out.println("Valor mas alto: " + prioridades.poll());


    }

}
