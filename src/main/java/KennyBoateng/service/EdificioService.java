package KennyBoateng.service;

import KennyBoateng.entities.Edificio;
import KennyBoateng.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {
    private final EdificioRepository edificioRepository;

    @Autowired
    public EdificioService(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }


    public List<Edificio> getAllEdifici() {
        return edificioRepository.findAll();
    }


    public Edificio getEdificioById(Long id) {
        return edificioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Edificio non trovato con ID: " + id));
    }


    public Edificio saveEdificio(Edificio edificio) {
        return edificioRepository.save(edificio);
    }


    public void deleteEdificio(Long id) {
        edificioRepository.deleteById(id);
    }
}
