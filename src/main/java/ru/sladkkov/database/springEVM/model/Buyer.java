package ru.sladkkov.database.springEVM.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "buyer")
public class Buyer {
    public Buyer(int buyerId, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.buyerId = buyerId;
        this.buyerName = buyerName;
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    @Id
    @Column(name = "buyers_id")
    private int buyerId;

    @Column(name = "buyers_name")
    private String buyerName;

    @Column(name = "buyers_phone_number")
    private String buyerPhoneNumber;

    @Column(name = "buyers_address")
    private String buyerAddress;

    public Buyer() {

    }
}
