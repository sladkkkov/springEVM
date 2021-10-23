package ru.sladkkov.database.springEVM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.sladkkov.database.springEVM.model.Buyer;
import ru.sladkkov.database.springEVM.model.Contract;
import ru.sladkkov.database.springEVM.service.ContractService;

import java.util.List;

@Controller
public class ContractController {
    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/contracts")
    public String findAll(Model model) {
        List<Contract> contracts = contractService.findAll();
        model.addAttribute("contracts", contracts);
        return "/contract-list";
    }

    @GetMapping("/contract-create")
    public String createContractForm(Contract contract) {
        return "contract-create";
    }

    @PostMapping("/contract-create")
    public String createContract(Contract contract) {
        contractService.saveContract(contract);
        return "redirect:/contracts";
    }

    @GetMapping("/contract-update/{id}")
    public String updateContractForm(@PathVariable("id") Integer id, Model model) {
        Contract contract = contractService.getById(id);
        model.addAttribute("contracts", contract);
        return "/contract-update";
    }
    @PostMapping("/contract-update")
    public String updateContract(Contract contract) {
        contractService.saveContract(contract);
        return "redirect:/contracts";
    }

    @GetMapping("/contract-delete/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        contractService.deleteById(id);
        return "redirect:/contracts";
    }
}

