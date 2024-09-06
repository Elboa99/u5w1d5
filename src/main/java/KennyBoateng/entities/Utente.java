package KennyBoateng.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "utente")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String nomeCognome;
    private String email;

    public Utente(Long id, String username, String nomeCognome, String email) {
        this.id = id;
        this.username = username;
        this.nomeCognome = nomeCognome;
        this.email = email;
    }
}
