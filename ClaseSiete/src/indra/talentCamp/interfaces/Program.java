package indra.talentCamp.interfaces;

import indra.talentCamp.generics.CajaFuerte;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Area> escenario = Arrays.asList(
                new Circulo(10.0),
                new Triangulo(12, 15, 16.36, 16.36),
                new Rectangulo(10, 10),
                new Planta()
        );
        System.out.println("El area total de mi dibujo es: ");
        System.out.println("Areas: " + escenario.stream().mapToDouble(figura -> figura.calcularArea()).sum());

        /*System.out.println("El perimetro total de mi dibujo es: ");
        System.out.println("Perimetro: " + escenario.stream().mapToDouble(figura -> figura.calcularPerimetro()).sum());*/

        //Bienvenidos al lado oscuro

        //Casteo "clasico"
        double perimetroTotal = 0.0;
        for (Area figura : escenario) {
            if (figura instanceof Perimetro) {
                //perimetroTotal += ((Perimetro) figura).calcularPerimetro();
                perimetroTotal += Perimetro.class.cast(figura).calcularPerimetro();
            }
        }

        //Casteo con expresion lambda
        escenario.stream()
                .filter(Perimetro.class::isInstance)
                .map(Perimetro.class::cast).mapToDouble(figura -> figura.calcularPerimetro()).sum();

        System.out.println("Perimetro total: " + perimetroTotal);


        //Ejemplo de una interfaz existente
        List<Figura> figuras = escenario.stream().filter(Figura.class::isInstance).map(Figura.class::cast).collect(Collectors.toList());

        //System.out.println(figuras.getClass());
        Collections.sort(figuras);
        figuras.forEach(System.out::println);

        //ejemplo uso de interfaz funcional
        /*Operacion<Integer> suma = (a, b) -> (a + b);
        int res = suma.operar(2,2);

        System.out.println("Suma 2+2 es " + res);*/

        OperacionInteger suma = (a, b) -> (a + b);
        int resInt = suma.operar(2,2);
        System.out.println("Sumar 2+2 es " +resInt);

        //Ejemplo caja fuerte
        CajaFuerte<String, String> claveTexto = new CajaFuerte<>("Abrete Sesamo");
        claveTexto.guardarValor("La clave del home banking");
        String claveOk = claveTexto.leerValor("Abrete Sesamo");
        System.out.println("La clave es: " + claveOk);

        System.out.println("Intentando acceder con una clave invalida");

        try{
            String claveMal = claveTexto.leerValor("Aassdfasdfasdf");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //Una caja fuerte que guarde Integers
        CajaFuerte<Integer, String> claveNumero = new CajaFuerte<>("Abrete Sesamo");
        claveNumero.guardarValor(566);
        Integer claveNumOk = claveNumero.leerValor("Abrete Sesamo");
        System.out.println("La clave es: " + claveNumOk);
        System.out.println("Intentando acceder con una clave invalida");
        try{
            Integer claveNumMal = claveNumero.leerValor("Aassdfasdfasdf");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }
}
