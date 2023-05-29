package indra.talentCamp.database.persistence;

import indra.talentCamp.database.models.Persona;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaRepository implements Repository{

    @Getter @Setter
    private String connectionString;

    @Override
    public void save(Object nuevo) {
        throw new Error("Not implemented YET");
    }

    @Override
    public void update(Object existente) {
        throw new Error("Not implemented YET");
    }

    @Override
    public void delete(int id) {
        throw new Error("Not implemented YET");
    }

    @Override
    public List<Persona> findAll() {
        Connection conn = null;
        List<Persona> p = new ArrayList<Persona>();

        try {
            try {
                conn = DriverManager.getConnection(this.connectionString);

                Statement select = conn.createStatement();
                ResultSet resultSet = select.executeQuery("SELECT * FROM Persona");
                while(resultSet.next()) {

                    Persona pe = new Persona();
                    pe.setId(resultSet.getInt("id"));
                    pe.setNombre(resultSet.getString("nombre"));
                    pe.setEdad(resultSet.getInt("edad"));

                    p.add(pe);
                }

            } finally {
                if (conn != null) {
                    conn.close();
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        return p;
    }

    @Override
    public Object findById(int id) throws NotFoundException {
        return null;
    }
}
