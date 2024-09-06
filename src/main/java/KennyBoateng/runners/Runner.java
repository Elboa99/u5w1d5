package KennyBoateng.runners;


import KennyBoateng.entities.Edificio;
import KennyBoateng.entities.Postazione;
import KennyBoateng.entities.Prenotazione;
import KennyBoateng.entities.Utente;
import KennyBoateng.service.EdificioService;
import KennyBoateng.service.PostazioneService;
import KennyBoateng.service.PrenotazioneService;
import KennyBoateng.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private UtenteService utenteService;

    @Autowired
    PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args){

        Edificio edificio1 = new Edificio();
        edificio1.setNome("EdificioAlpha");
        edificio1.setIndirizzo("Via Diaz, 22");
        edificio1.setCitta("Belluno");

        Edificio edificio2 = new Edificio();
        edificio2.setNome("EdificioBeta");
        edificio2.setIndirizzo("Via Roma, 13");
        edificio2.setCitta("Savona");

        edificioService.saveEdificio(edificio1);
        edificioService.saveEdificio(edificio2);


        Postazione postazione1 = new Postazione();
        postazione1.setDescrizione("Postazione Privata");
        postazione1.setNumMaxOccupanti(1);
        postazione1.setEdificio(edificio1);

        Postazione postazione2 = new Postazione();
        postazione2.setDescrizione("Sala Riunioni");
        postazione2.setNumMaxOccupanti(10);
        postazione2.setEdificio(edificio2);

        postazioneService.savePostazione(postazione1);
        postazioneService.savePostazione(postazione2);


        Utente utente1 = new Utente();
        utente1.setUsername("mario.rossi");
        utente1.setNomeCognome("Mario Rossi");
        utente1.setEmail("mario.rossi@gmail.com");

        Utente utente2 = new Utente();
        utente2.setUsername("lucia.bianchi");
        utente2.setNomeCognome("Lucia Bianchi");
        utente2.setEmail("lucia.negri@gmail.com");

        utenteService.saveUtente(utente1);
        utenteService.saveUtente(utente2);


        Prenotazione prenotazione1 = new Prenotazione();
        prenotazione1.setUtente(utente1);
        prenotazione1.setPostazione(postazione1);
        prenotazione1.setDataPrenotazione(LocalDate.now());

        Prenotazione prenotazione2 = new Prenotazione();
        prenotazione2.setUtente(utente2);
        prenotazione2.setPostazione(postazione2);
        prenotazione2.setDataPrenotazione(LocalDate.now().plusDays(1));

        prenotazioneService.savePrenotazione(prenotazione1);
        prenotazioneService.savePrenotazione(prenotazione2);





    }



    }
