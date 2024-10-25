package com.example.stockwise.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    @Column(name = "nome_categoria", nullable = false)
    private String nomeCategoria;
}