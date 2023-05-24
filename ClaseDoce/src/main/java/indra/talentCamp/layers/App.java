package indra.talentCamp.layers;

import indra.talentCamp.models.Jedi;
import indra.talentCamp.persistence.JediFileRepository;
import indra.talentCamp.persistence.SaveErrorException;

import java.awt.*;

public class App {

    public static void main(String[] args) {
        System.out.println("Bienvenidos a una nueva hermosa clase");

        JediFileRepository prueba = new JediFileRepository();

        /*try {
            prueba.save(new Jedi("Anakin", 10000, Color.RED));
        } catch (SaveErrorException e) {
            e.printStackTrace();
        }*/

        /*Jedi jedi;
        try {
            jedi = prueba.findById(1);
            System.out.println(jedi);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        prueba.findAll();


    }

}
