package KennyBoateng.service;

import KennyBoateng.repositories.EdificioRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
    @Autowired
    private EdificioRepositoy edificioRepositoy;
}
