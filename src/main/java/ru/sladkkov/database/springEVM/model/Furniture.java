package ru.sladkkov.database.springEVM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "furniture_model")
public class Furniture {
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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_model_id")
    private List<Realization> realizations;
}
