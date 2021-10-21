package ru.sladkkov.database.springEVM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.sladkkov.database.springEVM.model.Buyer;
import ru.sladkkov.database.springEVM.service.BuyerService;

import java.util.List;

@Controller
public class BuyerController {
    private final BuyerService buyerService;

    @Autowired
    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @GetMapping("/buyers")
    public String findAll(Model model) {
        List<Buyer> buyers = buyerService.findAll();
        model.addAttribute("buyers", buyers);
        return "buyer-list";
    }

    @GetMapping("/buyers-create")
    public String createBuyerForm(Buyer buyer) {
        return "buyers-create";
    }

    @PostMapping("/buyers-create")
    public String createBuyer(Buyer buyer) {
        buyerService.saveBuyer(buyer);
        return "redirect:/buyers";
    }

    @GetMapping("/buyers-update/{id}")
    public String updateUserForm(@PathVariable("id") Integer id, Model model) {
        Buyer buyer = buyerService.fingById(id);
        model.addAttribute("buyers", buyer);
        return "buyers-update";
    }

    @PostMapping("/buyers-update")
    public String updateBuyer(Buyer buyer) {
        buyerService.saveBuyer(buyer);
        return "redirect:/buyers";
    }

    @GetMapping("/buyers-delete/{id}")
    public String deleteBuyer(@PathVariable("id") Integer id) {
        buyerService.deleteById(id);
        return "redirect:/buyers";
    }
}
