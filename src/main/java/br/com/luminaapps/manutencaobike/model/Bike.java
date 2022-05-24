package br.com.luminaapps.manutencaobike.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String brand;
    private String model;
    private Integer modelYear;
    private Integer manufactureYear;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
