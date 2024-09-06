package KennyBoateng.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Username;
    private String NomeCognome;
    private String Email;

    public Utente(Long id, String username, String nomeCognome, String email) {
        this.id = id;
        Username = username;
        NomeCognome = nomeCognome;
        Email = email;
    }
}
