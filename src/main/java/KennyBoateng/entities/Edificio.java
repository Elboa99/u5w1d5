package KennyBoateng.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table (name = "edificio")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String indirizzo;
    private String città;

    public Edificio(long id, String nome, String indirizzo, String città) {
        this.id = id;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.città = città;
    }
}
