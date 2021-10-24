package ru.sladkkov.database.springEVM.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.sladkkov.database.springEVM.model.Buyer;
import ru.sladkkov.database.springEVM.model.Realization;
import ru.sladkkov.database.springEVM.service.RealizationService;

import java.util.List;

@Controller
public class RealizationController {
    private final RealizationService realizationService;
    @Autowired
    public RealizationController(RealizationService realizationService) {
        this.realizationService = realizationService;
    }
    @GetMapping("/realizations")
    public String findAll(Model model) {
        List<Realization> realizations = realizationService.findAll();
        model.addAttribute("realizations", realizations);
        return "realization-list";
    }

    @GetMapping("/realization-create")
    public String createRealizationForm(Realization realization) {
        return "realization-create";
    }

    @PostMapping("/realization-create")
    public String createRealization(Realization realization) {
        realizationService.saveRealization(realization);
        return "redirect:/realizations";
    }

    @GetMapping("/realization-update/{id}")
    public String updateUserForm(@PathVariable("id") Integer id, Model model) {
        Realization realization = realizationService.fingById(id);
        model.addAttribute("realizations", realization);
        return "realization-update";
    }

    @PostMapping("/realization-update")
    public String updateRealization(Realization realization) {
        realizationService.saveRealization(realization);
        return "redirect:/realizations";
    }

    @GetMapping("/realization-delete/{id}")
    public String deleteBuyer(@PathVariable("id") Integer id) {
        realizationService.deleteById(id);
        return "redirect:/realizations";
    }
}