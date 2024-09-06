package KennyBoateng.repositories;

import KennyBoateng.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EdificioRepositoy extends JpaRepository<Edificio,Long> {

}
