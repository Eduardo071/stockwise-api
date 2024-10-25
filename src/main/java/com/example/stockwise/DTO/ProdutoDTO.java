package com.example.stockwise.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {
    private Long idProduto;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private BigDecimal preco;
    private CategoriaDTO categoria;
}
