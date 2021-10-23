package ru.sladkkov.database.springEVM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.sladkkov.database.springEVM.model.Contract;
import ru.sladkkov.database.springEVM.model.Furniture;
import ru.sladkkov.database.springEVM.service.FurnitureService;

import java.util.List;

@Controller
public class FurnitureController {
    private final FurnitureService furnitureService;
    @Autowired
    public FurnitureController(FurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }
    @GetMapping("/furnitures")
    public String findAll(Model model){
        List<Furniture> furnitures = furnitureService.findAll();
        model.addAttribute("furnitures", furnitures);
        return "/furniture-list";
    }

    @GetMapping("/furniture-update/{id}")
    public String furnitureUpdateForm(@PathVariable("id") Integer id, Model model){
        Furniture furniture = furnitureService.getById(id);
        model.addAttribute("furnitures", furniture);
        return "/furniture-update";
    }
    @PostMapping("/furniture-update")
    public String updateFurniture(Furniture furniture) {
        furnitureService.saveFurniture(furniture);
        return "redirect:/furnitures";
    }

    @GetMapping("/furniture-create")
    public String createContractForm(Furniture furniture) {
        return "furniture-create";
    }

    @PostMapping("/furniture-create")
    public String createFurniture(Furniture furniture) {
        furnitureService.saveFurniture(furniture);
        return "redirect:/furnitures";
    }

    @GetMapping("/furniture-delete/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        furnitureService.deleteById(id);
        return "redirect:/furnitures";
    }
}
