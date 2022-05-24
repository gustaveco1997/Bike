package br.com.luminaapps.manutencaobike.model;

import jdk.jfr.StackTrace;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate birthDate;
    @OneToMany(mappedBy = "owner")
    private List<Bike> bikes;
}
