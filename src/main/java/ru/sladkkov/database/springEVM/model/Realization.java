package ru.sladkkov.database.springEVM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "realization")
public class Realization {
    @Id
    @Column(name = "fk_contract_id")
    private int fkContractId;
    @Column(name = "fk_model_id")
    private int fkModelId;

    @Column(name = "quantity")
    private int quantity;

}
