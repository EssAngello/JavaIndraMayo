package indra.utils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Consola {

	public static boolean esNumerico(String numero){
        //quiero que haga captura de excepciones
        //y me devuelva si el string ingresado es numerico
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int readInt(){
        //lea un entero de la entrada estandar
        //si el user ingresa otra cosa que no sea un numero se lo vuelve a preguntar
        // usar while...

        String numero = null;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("ingrese un numero");
            numero = in.nextLine();
        }while(!esNumerico(numero));
        in.close();
        return Integer.valueOf(numero);

    }

    public static int readInt(String prompt){ //Sobrecarga
        //lea un entero de la entrada estandar
        //si el user ingresa otra cosa que no sea un numero se lo vuelve a preguntar
        // usar while...

        String numero = null;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(prompt);
            numero = in.nextLine();
        }while(!esNumerico(numero));
       
        return Integer.valueOf(numero);

    }
    
    public static void adivinarElNumero() {
    	Random r = new Random();
    	int numeroAleatorio = r.nextInt(1,101);
    	
    	int numero;
    	Scanner in = new Scanner(System.in);
    	for(int i = 0; i<5; i++) {
    		System.out.println("Ingresa un numero");
    		numero = in.nextInt();
    		if(numero==numeroAleatorio) {
    			System.out.println("Enhorabuena, encontraste el numero");
    			return;
    		}
    	}
    	
    	System.out.println("No encontraste el numero");
    	return;
    }
    
    static final int CANTIDAD_OPORTUNIDADES = 5;
    static final int MAX_VALUE = 100;
    
    public static void adivinarElNumeroSolucionFormador() {
    	Random r = new Random();
    	int secreto = r.nextInt(1,MAX_VALUE);
    	
    	boolean adivino = false;
    	int turnoActual = 1;
    	
    	System.out.println("Bienvenidos al juego. Tiene 5 oportunidades para adivinar el numero");
    	
    	while((!adivino)&&(turnoActual<=CANTIDAD_OPORTUNIDADES)) {
    		int adivinanza = readInt(turnoActual + ". Ingrese un numero");
    		
    		if(adivinanza < secreto) {
    			System.out.println("el numero ingresado es menor al secreto");
    		}else if(adivinanza>secreto) {
    			System.out.println("El numero ingresado es mayor al secreto");
    		}else {
    			System.out.println("Felicitaciones has adivinado");
    			adivino = true;
    		}
    		turnoActual++;
    	}
    	
    	if(!adivino) {
    		System.out.println("lo siento has perdido, el numero secreto era el " +  secreto);
    	}
    }    
    
    public static boolean esPrimo(int numero) {
    	//Este operador para el resto de una division %
    	//Este hacerlo con un for...
    	//Dado un numero...me diga si es primo o no...
    	if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

}
