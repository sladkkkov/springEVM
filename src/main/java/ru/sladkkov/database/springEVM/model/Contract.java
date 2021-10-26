package ru.sladkkov.database.springEVM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contract")
public class Contract {

    @Id
    @Column(name = "contract_id")
    private int contractId;
    @Column(name = "fk_buyer_id")
    private int buyerId;
    @Column(name = "date_of_declaration")
    private Date dateOfDeclaration;
    @Column(name = "date_of_execution")
    private Date dateOfExecution;


}
