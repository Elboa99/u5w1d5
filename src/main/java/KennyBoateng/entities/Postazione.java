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
    @Id
    @GeneratedValue
    private long id;
    private String descrizione;




    private int NumMaxOccupanti;

    @ManyToOne
    @JoinColumn(name ="edificio_id" )
    private Edificio edificio;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;

    public enum TipoPostazione{
        PRIVATO, OPENSPACE, SALA_RIUNIONI;


    }

    public Postazione(long id, String descrizione, int numMaxOccupanti, Edificio edificio, TipoPostazione tipoPostazione) {
        this.id = id;
        this.descrizione = descrizione;
        NumMaxOccupanti = numMaxOccupanti;
        this.edificio = edificio;
        this.tipoPostazione = tipoPostazione;
    }


}
