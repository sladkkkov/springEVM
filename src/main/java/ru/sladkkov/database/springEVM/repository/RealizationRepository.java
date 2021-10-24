package ru.sladkkov.database.springEVM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sladkkov.database.springEVM.model.Realization;

public interface RealizationRepository extends JpaRepository<Realization,Integer> {
}
