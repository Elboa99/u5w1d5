package KennyBoateng.service;



import KennyBoateng.entities.Utente;

import KennyBoateng.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;


    public List<Utente> findAll() {
        return utenteRepository.findAll();
    }

    public Utente findById(Long id) {
        return utenteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utente non trovato con ID: " + id));
    }



    public Utente save(Utente utente) {
        return utenteRepository.save(utente);
    }


    public void deleteById(Long id) {
        utenteRepository.deleteById(id);
    }


}
