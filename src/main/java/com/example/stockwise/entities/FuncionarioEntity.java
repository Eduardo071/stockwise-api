package com.example.stockwise.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Funcionario")
public class FuncionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFuncionario;

    @Column(name = "nome_funcionario", nullable = false)
    private String nomeFuncionario;

    @Column(nullable = false)
    private String cargo;
}
