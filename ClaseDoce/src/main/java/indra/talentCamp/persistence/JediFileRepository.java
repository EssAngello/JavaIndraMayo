package indra.talentCamp.persistence;

import indra.talentCamp.models.Jedi;
import indra.talentCamp.persistence.interfaces.Repository;
import jdk.jshell.spi.ExecutionControl;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JediFileRepository implements Repository<Jedi> {

    private int getJediCount(){
        File archivo = new File("./jedis");
        return archivo.listFiles().length;
    }

    public void save(Jedi jedi) throws SaveErrorException{

        jedi.setId(this.getJediCount() + 1);

        File archivo = new File(String.format("./jedis/%d.txt", jedi.getId()));
        try {
            archivo.createNewFile();

            try(FileWriter writer = new FileWriter(archivo)) {
                writer.write(String.format("%d;%s;%d;%d",
                        jedi.getId(),
                        jedi.getNombre(),
                        jedi.getNivelDeFuerza(),
                        jedi.getColorLightSaber().getRGB()));
            }

        } catch (Exception e) {
            throw new SaveErrorException();
        }

    }

    public Jedi findById(int id) throws NotFoundException {
        File archivo = new File(String.format("./jedis/%d.txt", id));

        if(!archivo.exists()) {
            throw new NotFoundException();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea = reader.readLine();
            String[] lineas = linea.split(";");

            Jedi jedi = new Jedi(lineas[1], Integer.valueOf(lineas[2]), new Color(Integer.valueOf(lineas[3])));

            jedi.setId(Integer.valueOf(lineas[0]));

            return jedi;
        } catch (Exception e) {
            throw new NotFoundException();
        }
    }

    public List<Jedi> findAll(){

        List<Jedi> jedis = new ArrayList<Jedi>();
        try {
            File directorio = new File("./jedis");
            File[] archivos = directorio.listFiles();

            for(File archivo:archivos){
                String nombre = archivo.getName();
                nombre = nombre.replaceAll(".txt", "");
                Jedi jedi = this.findById(Integer.valueOf(nombre));
                jedis.add(jedi);
                System.out.println(nombre);
            }

            return jedis;
        } catch (Exception e) {
            throw new Error("Esto es inesperado");
        }

    }

    public void update (Jedi jedi) {

    }

    public void delete (int id) throws NotFoundException {
        File file = new File(String.format("%d.txt", id));
        if(!file.exists()){
            throw new NotFoundException();
        }
        file.delete();
    }

}
