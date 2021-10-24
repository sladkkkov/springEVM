package ru.sladkkov.database.springEVM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sladkkov.database.springEVM.model.Buyer;
import ru.sladkkov.database.springEVM.model.Realization;
import ru.sladkkov.database.springEVM.repository.RealizationRepository;

import java.util.List;
@Service
public class RealizationService {
    private final RealizationRepository realizationRepository;
    @Autowired
    public RealizationService(RealizationRepository realizationRepository) {
        this.realizationRepository = realizationRepository;
    }


    public Realization fingById(Integer id) {
        return realizationRepository.getById(id);
    }

    public List<Realization> findAll() {
        return realizationRepository.findAll();
    }

    public void saveRealization(Realization realization) {
        realizationRepository.save(realization);
    }

    public void deleteById(Integer id) {
        realizationRepository.deleteById(id);
    }
}
