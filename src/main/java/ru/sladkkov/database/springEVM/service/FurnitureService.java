package ru.sladkkov.database.springEVM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sladkkov.database.springEVM.model.Furniture;
import ru.sladkkov.database.springEVM.repository.FurnitureRepostitory;

import java.util.List;

@Service
public class FurnitureService {
    private final FurnitureRepostitory furnitureRepostitory;

    @Autowired
    public FurnitureService(FurnitureRepostitory furnitureRepostitory) {
        this.furnitureRepostitory = furnitureRepostitory;
    }

    public Furniture getById(Integer id) {
        return furnitureRepostitory.getById(id);
    }

    public List<Furniture> findAll() {
        return furnitureRepostitory.findAll();
    }

    public void saveFurniture(Furniture furniture) {
        furnitureRepostitory.save(furniture);
    }
    public void deleteById(Integer id) {
        furnitureRepostitory.deleteById(id);
    }
}
