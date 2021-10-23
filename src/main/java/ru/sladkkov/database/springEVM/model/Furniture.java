package ru.sladkkov.database.springEVM.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "furniture_model")
public class Furniture {
    public Furniture(int furnitureModelId, String modelName, String modelColor, int price, String description) {
        this.furnitureModelId = furnitureModelId;
        this.modelName = modelName;
        this.modelColor = modelColor;
        this.price = price;
        this.description = description;
    }

    @Id
    @Column(name = "furniture_model_id")
    private int furnitureModelId;
    @Column(name = "model_name")
    private String modelName;
    @Column(name = "model_color")

    private String modelColor;
    @Column(name = "price")

    private int price;
    @Column(name = "description")
    private String description;

    public Furniture() {

    }
}
