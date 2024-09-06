package KennyBoateng.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "postazione")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Postazione {
    private long id;
    private String descrizione;




    private int NumMaxOccupanti;

    @ManyToOne
    @JoinColumn(name ="edificio_id" )
    private Edificio edificio;

    public enum TipoPostazione{
        PRIVATO, OPENSPACE, SALA_RIUNIONI
    }
}
