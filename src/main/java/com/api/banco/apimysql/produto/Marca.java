package com.api.banco.apimysql.produto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String endereco;
    @Getter
    @Setter
    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<Produto> produtos = new ArrayList<>();
}
