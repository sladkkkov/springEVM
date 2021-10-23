package ru.sladkkov.database.springEVM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sladkkov.database.springEVM.model.Contract;
import ru.sladkkov.database.springEVM.repository.ContractRepository;

import java.util.List;

@Service
public class ContractService {
    private final ContractRepository contractRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public Contract getById(Integer id) {
        return contractRepository.getById(id);
    }

    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    public void saveContract(Contract contract) {
        contractRepository.save(contract);
    }

    public void deleteById(Integer id) {
        contractRepository.deleteById(id);
    }
}
