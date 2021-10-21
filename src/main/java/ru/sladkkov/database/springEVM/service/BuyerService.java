package ru.sladkkov.database.springEVM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sladkkov.database.springEVM.model.Buyer;
import ru.sladkkov.database.springEVM.repository.BuyerRepository;

import java.util.List;

@Service
public class BuyerService {

    private final BuyerRepository buyerRepository;

    @Autowired
    public BuyerService(BuyerRepository buyerRepository) {
        this.buyerRepository = buyerRepository;
    }

    public Buyer fingById(Integer id) {
        return buyerRepository.getById(id);
    }

    public List<Buyer> findAll() {
        return buyerRepository.findAll();
    }

    public void saveBuyer(Buyer buyer) {
        buyerRepository.save(buyer);
    }

    public void deleteById(Integer id) {
        buyerRepository.deleteById(id);
    }

}
