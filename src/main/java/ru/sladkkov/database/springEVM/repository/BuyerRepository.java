package ru.sladkkov.database.springEVM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sladkkov.database.springEVM.model.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
}
