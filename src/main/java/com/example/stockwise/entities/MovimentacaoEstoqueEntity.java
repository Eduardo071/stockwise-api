package com.example.stockwise.entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Movimentacao_Estoque")
public class MovimentacaoEstoqueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovimentacao;

    @Column(name = "data_movimentacao", nullable = false)
    private LocalDate dataMovimentacao;

    @Column(name = "tipo_mov", nullable = false)
    private String tipoMov;

    @Column(name = "quant_movimentacao", nullable = false)
    private Integer quantMovimentacao;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private ProdutoEntity produto;

    @ManyToOne
    @JoinColumn(name = "funcionario_id", nullable = false)
    private FuncionarioEntity funcionario;
}
