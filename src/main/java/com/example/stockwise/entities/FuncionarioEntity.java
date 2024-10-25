package com.example.stockwise.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Funcionario")
@Getter
@Setter
public class FuncionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFuncionario;

    @Column(name = "nome_funcionario", nullable = false)
    private String nomeFuncionario;

    @Column(nullable = false)
    private String cargo;
}
