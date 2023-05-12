package indra.talentCamp.lambda;

import indra.talentCamp.lambda.models.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        /*String frase = "Que la fuerza " + "este contigo";*/

        /*String frase = "Que la fuerza";
        frase+= "este";
        frase+= "contigo";*/

        /*StringBuilder builder = new StringBuilder();
        builder.append("Que la fuerza");
        builder.append(" este");
        builder.append(" contigo");

        System.out.println(builder.toString());*/

        //List<Persona> jedis = new ArrayList<>();
        //List<Persona> jedis = new LinkedList<>();

        /*jedis.add(new Persona("Anakin", 178));
        jedis.add(new Persona("Yoda", 178));
        jedis.add(new Persona("Asoka", 178));
        jedis.add(new Persona("Luke", 178));*/

        List<Persona> jedis = Arrays.asList(
                new Persona("Anakin", 178),
                new Persona("Yoda", 177),
                new Persona("Asoka", 176),
                new Persona("Luke", 175)
        );

        //System.out.println("La lista de jedis:");

        /*for (Persona jedi : jedis) {
            System.out.println(jedi.getNombre());
        }*/

        //iterando con expresiones lambda
        /*jedis.forEach(jedi -> {
            System.out.println(jedi.toString());
        });*/

        //Iterando con lambda de una manera particular...::
        //jedis.forEach(System.out::println);

        //List<Integer> numeros = Arrays.asList(4, 5, 656, 232, 54, 657, 865, 23, 433);
        //Hacer un fragmento de código que calcule el mas grande

        /*Integer maximo = numeros.stream()
                .max(Integer::compareTo)
                .orElse(0);

        System.out.println("El numero mas grande es: " + maximo);*/

        //el jedi mas alto con una expresion lambda
        /*Persona jediMasAlto = jedis.stream()
                .max((j1, j2) -> Integer.compare(j1.getCentimetrosAltura(), j2.getCentimetrosAltura()))
                .orElse(null);
        System.out.println("El jedi mas alto es: " + jediMasAlto);*/

        List<Integer> numeros = Arrays.asList(4, 5, 656, 232, 54, 657, 865, 23, 433);
        //sumatoria tradicional lista de numeros
        /*int sumatorio = 0;
        for(int num: numeros) {
            sumatorio += num;
        }

        System.out.println("Sumatorio: " + sumatorio);*/

        //sumatorio con expresion lambda
        //System.out.println(numeros.stream().mapToInt(i -> i).sum());

        //la sumatoria de la altura de todos los jedi
        //System.out.println(jedis.stream().mapToInt(Persona::getCentimetrosAltura).sum());

        //media tradicional lista de numeros
        /*int sumatorio = 0;
        for(int num: numeros) {
            sumatorio += num;
        }

        int media = sumatorio / numeros.size();

        System.out.println(media);*/

        //media con expresion lambda
        //System.out.printf("Media %.2f", numeros.stream().mapToDouble(n -> (double) n).average().orElse(0));

        //la media de las alturas de los jedis
        //System.out.printf("Media %.2f", jedis.stream().mapToDouble(Persona::getCentimetrosAltura).average().orElse(0));

        //filtrar elementos de una lista
        //numeros.stream().filter(n -> n > 100).forEach(System.out::println);
        //numeros.stream().filter(n -> n > 100).collect(Collectors.toList());
        //List<Integer> numerosMayores100 = numeros.stream().filter(n -> n > 100).collect(Collectors.toList());
        //System.out.println(numerosMayores100);

        //Mostrar la lista de jedis que miden mas de un metro.
        //List<Persona> jedisAltos = jedis.stream().filter(jedi -> jedi.getCentimetrosAltura() > 100).collect(Collectors.toList());
        //jedisAltos.forEach(System.out::println);

        //Map
        //
        //numeros.stream().map(n -> n * 2).forEach(System.out::println);
        //List<Integer> dobles = numeros.stream().map(n -> n * 2).collect(Collectors.toList());

        //Convertir la lista de jedis en una lista de alturas (int). Luego mostrarla.
        //List<Integer> alturas = jedis.stream().map(Persona::getCentimetrosAltura).collect(Collectors.toList());
        //alturas.forEach(System.out::println);

        //Reduce
        //
        numeros.stream().reduce((n1, n2) -> n1 + n2).ifPresent(System.out::println);
        //int numero = numeros.stream().reduce(0, (n1, n2) -> n1 + n2);
        //System.out.println(numero);

    }

}
