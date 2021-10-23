package ru.sladkkov.database.springEVM.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "contract")
public class Contract {
    public Contract(int buyerId, int contractId, Date dateOfDeclaration, Date dateOfExecution) {
        this.buyerId = buyerId;
        this.contractId = contractId;
        this.dateOfDeclaration = dateOfDeclaration;
        this.dateOfExecution = dateOfExecution;
    }
    @Id
    @Column(name = "contract_id")
    private int contractId;
    @Column(name = "fk_buyer_id")
    private int buyerId;
    @Column(name = "date_of_declaration")
    private Date dateOfDeclaration;
    @Column(name = "date_of_execution")
    private Date dateOfExecution;

    public Contract() {

    }
}
