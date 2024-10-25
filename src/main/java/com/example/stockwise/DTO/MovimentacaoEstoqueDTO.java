package com.example.stockwise.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovimentacaoEstoqueDTO {
    private Long idMovimentacao;
    private LocalDate dataMovimentacao;
    private String tipoMov;
    private Integer quantMovimentacao;
    private ProdutoDTO produto;
    private FuncionarioDTO funcionario;
}
