package KennyBoateng.repositories;

import KennyBoateng.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EdificioRepository extends JpaRepository<Edificio,Long> {

}
