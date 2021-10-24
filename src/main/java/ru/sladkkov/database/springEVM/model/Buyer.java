package ru.sladkkov.database.springEVM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "buyer")
public class Buyer {
    @Id
    @Column(name = "buyers_id")
    private int buyerId;

    @Column(name = "buyers_name")
    private String buyerName;

    @Column(name = "buyers_phone_number")
    private String buyerPhoneNumber;

    @Column(name = "buyers_address")
    private String buyerAddress;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_buyer_id")
    private List<Contract> contracts;

}
