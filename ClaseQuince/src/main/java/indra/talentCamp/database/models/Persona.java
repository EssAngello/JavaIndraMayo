package indra.talentCamp.database.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Persona {

    @Getter @Setter
    private int id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private int edad;

}
