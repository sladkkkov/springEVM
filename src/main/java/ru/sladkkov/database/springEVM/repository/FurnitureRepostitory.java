package ru.sladkkov.database.springEVM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sladkkov.database.springEVM.model.Furniture;

public interface FurnitureRepostitory extends JpaRepository<Furniture, Integer> {
}
