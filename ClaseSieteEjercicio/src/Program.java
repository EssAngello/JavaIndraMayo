import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Alberto" , 99),
                new Estudiante("Carlos" , 89),
                new Estudiante("Maria" , 96),
                new Estudiante("Laura" , 48),
                new Estudiante("Angel" , 39),
                new Estudiante("Carmen" , 55)
        );

        estudiantes.stream().filter(estudiante -> estudiante.getCalificacion() >= 90).forEach(System.out::println);

        System.out.println();

        List<Integer> enteros = Arrays.asList(
                99,
                50,
                45,
                33,
                199
        );

        enteros.stream().max(Integer::compareTo).ifPresent(System.out::println);

        System.out.println();

        List<Integer> enterosSumatorioPares = Arrays.asList(
                99,
                50,
                44,
                34,
                199
        );

        int sumasPares = enterosSumatorioPares.stream().filter(numero -> numero % 2 == 0).mapToInt(Integer::valueOf).sum();
        System.out.println("La suma de los numeros pares es: " + sumasPares);
        System.out.println();


        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Producto 1", 10.99));
        productos.add(new Producto("Producto 2", 5.99));
        productos.add(new Producto("Producto 3", 15.99));
        productos.add(new Producto("Producto 4", 8.99));
        productos.add(new Producto("Producto 5", 12.99));

        Producto productoMasCaro = productos.stream()
                .max(Comparator.comparingDouble(Producto::getPrecio))
                .orElse(null);

        if (productoMasCaro != null) {
            System.out.println("El producto mas caro es: " + productoMasCaro.getNombre() + " con un precio de " + productoMasCaro.getPrecio());
        } else {
            System.out.println("No hay productos en la lista.");
        }
    }


}
