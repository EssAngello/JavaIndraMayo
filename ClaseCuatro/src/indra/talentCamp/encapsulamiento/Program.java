package indra.talentCamp.encapsulamiento;

import indra.talentCamp.encapsulamiento.models.Student;
import indra.talentCamp.encapsulamiento.models.Teacher;
import indra.talentCamp.utils.Console;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);

        //try {

            /*Student padawan = new Student();*/

            System.out.println("Bienvenidos al talent camp de JAVA");

            /*System.out.println("Como es su nombre?");*/
            /*padawan.name = in.nextLine();*/
            /*String nombre = in.nextLine();*/
            /*padawan.setName(in.nextLine());*/
            /*padawan.setName(Console.readString("Como es su nombre?"));*/

            /*System.out.println("Cual es su documento");*/
            /*padawan.document = Integer.valueOf(in.nextLine());*/
            /*int documento = Integer.valueOf(in.nextLine());*/
            /*padawan.setDocument(Integer.valueOf(in.nextLine()));*/
            /*padawan.setDocument(Console.readInt("Cual es su documento"));*/

            /*System.out.println("Cual es su direccion?");*/
            /*padawan.address = in.nextLine();*/
            /*String direccion = in.nextLine();*/
            /*padawan.setAddress(in.nextLine());*/
            /*padawan.setAddress(Console.readString("Cual es su direccion?"));*/

            /*System.out.println("Te gusta el frontend? (S/N)");*/
            /*String respuesta = Console.readString("Te gusta el frontend? (S/N) ");*/
            /*padawan.prefersFrontEnd = (respuesta.equalsIgnoreCase("S"));*/
            /*boolean prefiereFront = (respuesta.equalsIgnoreCase("S"));*/
            /*padawan.setPrefersFrontEnd(respuesta.equalsIgnoreCase("S"));*/


            /*Student padawan = new Student(
                    Console.readString("Como es su nombre?"),
                    Console.readInt("Cual es su documento"),
                    Console.readString("Cual es su direccion?")
                    //Console.readString("Te gusta el frontend? (S/N)").equalsIgnoreCase("S")
            );

            String respuesta = Console.readString("Te gusta el frontend? (S/N) ");
            padawan.setPrefersFrontEnd(respuesta.equalsIgnoreCase("S"));*/

            Student padawan = new Student(
                    Console.readString("Como es su nombre?"),
                    Console.readInt("Cual es su documento"),
                    Console.readString("Cual es su direccion?"),
                    Console.readString("Te gusta el frontend? (S/N)").equalsIgnoreCase("S")
            );

            /*System.out.println("Bienvenido " + padawan.getName() + " al Talent Camp de Java");
            System.out.println("Su documento es " + padawan.getDocument() + " y vive en " + padawan.getAddress());

            if (padawan.isPrefersFrontEnd()){
                System.out.println("Esperemos que luego se le adigne un proyecto en front");
            } else{
                System.out.println("Esperemos que luego se le adigne un proyecto en backend");
            }*/

            System.out.println(padawan);

        Teacher teacher = new Teacher(
                Console.readString("Quien va a impartir el curso?"),
                Console.readInt("Cual es su documento"),
                Console.readString("Cual es su direccion?"),
                Console.readString("Cual es su idioma preferido?")
        );

        System.out.println(teacher);

        //} finally {
            //in.close();
        //}

    }

}
