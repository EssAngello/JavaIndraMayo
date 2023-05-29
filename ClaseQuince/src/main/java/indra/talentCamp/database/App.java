package indra.talentCamp.database;

import indra.talentCamp.database.models.Persona;
import indra.talentCamp.database.persistence.PersonaRepository;
import indra.talentCamp.database.services.PersonaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("JDBC es la hostia!");
        Connection conn = null;
        ApplicationContext iocContainer = null;
        PersonaRepository repository = new PersonaRepository();

        try {
            try {
                iocContainer = new FileSystemXmlApplicationContext("applicationContext.xml");
                Persona daniel = (Persona) iocContainer.getBean("dany");
                System.out.println("Mi bean creado por Spring");
                System.out.println(daniel);

                conn = DriverManager.getConnection("jdbc:sqlite:indra.db");

                System.out.println("Creando la base de datos indra.db...");

                /*Statement createStatement = conn.createStatement();
                createStatement.executeUpdate(
                        "CREATE TABLE IF NOT EXISTS Persona(" +
                                "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "Nombre TEXT NOT NULL," +
                                "Edad INTEGER NOT NULL)"
                );

                System.out.println("Base de datos creada...");

                System.out.println("Insertando un par de personas...");
                String theChosenOnes  = "Angello,Jean,Marcos,Carlos";

                for(String chosenOne: theChosenOnes.split(",")){
                    System.out.println("Insertando a " + chosenOne);

                    PreparedStatement insert = conn.prepareStatement("INSERT INTO Persona (Nombre, Edad) VALUES (?,?)");

                    insert.setString(1, chosenOne);
                    insert.setInt(2, 23);
                    insert.executeUpdate();
                }

                System.out.println("Persona insertadas...");*/


                PreparedStatement update = conn.prepareStatement("UPDATE Persona SET Edad = ? WHERE Nombre = ?");
                update.setInt(1, 23);
                update.setString(2, "Jean");
                update.executeUpdate();
                System.out.println("Edad modificada...");


                /*Statement select = conn.createStatement();
                ResultSet resultSet = select.executeQuery("SELECT * FROM Persona");
                List<Persona> cracksDeJava = new ArrayList<>();

                while(resultSet.next()){
                    Persona crack = Persona.builder().id(resultSet.getInt("id")).nombre(resultSet.getString("nombre")).edad(resultSet.getInt("edad")).build();

                    *//*crack.setId(resultSet.getInt("id"));
                    crack.setNombre(resultSet.getString("nombre"));
                    crack.setEdad(resultSet.getInt("edad"));*//*
                    cracksDeJava.add(crack);

                }*/

                //cracksDeJava.forEach(System.out::println);

                PersonaService service = (PersonaService) iocContainer.getBean("personaService");
                List<Persona> cracksDeJava = service.cracksDeJava();
                cracksDeJava.forEach(System.out::println);


            } finally {
                if (conn != null) {
                    conn.close();
                }

                if(iocContainer!=null) {

                }
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

}
