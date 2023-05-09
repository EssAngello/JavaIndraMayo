import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import indra.utils.Consola;

public class Program {

    public static void EjemploBufferedReaderSinThrows() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese su nombre:");

        String nombre = null;
        try {
            nombre = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ingrese su edad:");

        String edadAsString = null;
        try {
            edadAsString = reader.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        int edadAsInt = Integer.parseInt(edadAsString);

        System.out.println("Hola " + nombre + " de edad " + edadAsInt);

        System.out.println("Cerrando el BufferedReader");
        try {
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());;
        }
    }


    public static void main(String[] args) {
        /*Program.EjemploBufferedReaderSinThrows();*/

/*        Scanner in = new Scanner(System.in);
        System.out.println("Su nombre es...");
        String nombre = in.nextLine();
        System.out.println("Su edad es..");
        int edad = in.nextInt();
        System.out.println("Hola " + nombre + " de edad " + edad);*/

        /*try(Scanner in = new Scanner(System.in)){
            System.out.println("Su nombre es...");
            String nombre = in.nextLine();
            System.out.println("Su edad es..");
            int edad = in.nextInt();
            System.out.println("Hola " + nombre + " de edad " + edad);
        }*/// hace el close solito, se llama try with resources

        /*Scanner in = new Scanner(System.in);
        System.out.println("ingrese un numero");
        String numero = in.nextLine();

        if (esNumerico(numero)){
            System.out.println("Muy bien! Ingresaste un numero");
        } else{
            System.out.printf("No me hiciste caso");
        }
        in.close();*/

        /*System.out.println(readInt());*/
        /*System.out.println(readInt("Ingrese su edad"));*/
    	
    	/*int num = Consola.readInt("Ingrese su edad");
    	System.out.println(num);*/
    	
    	//Consola.adivinarElNumero();
    	//Consola.adivinarElNumeroSolucionFormador();

        //comentario de prueba para hacer commit y push

    	System.out.println(Consola.esPrimo(11));
    }

}
