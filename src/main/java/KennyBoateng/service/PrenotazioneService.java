package KennyBoateng.service;

import KennyBoateng.entities.Postazione;
import KennyBoateng.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {
    private final PostazioneRepository postazioneRepository;


    @Autowired
    public PrenotazioneService(PostazioneRepository postazioneRepository) {
        this.postazioneRepository = postazioneRepository;
    }


    public List<Postazione> getAllPostazioni() {
        return postazioneRepository.findAll();
    }


    public Postazione getPostazioneById(Long id) {
        return postazioneRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Postazione non trovata con ID: " + id));
    }


    public Postazione savePostazione(Postazione postazione) {
        return postazioneRepository.save(postazione);
    }


    public void deletePostazione(Long id) {
        postazioneRepository.deleteById(id);
    }
}
