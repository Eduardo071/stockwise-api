package com.example.stockwise.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDTO {
    private Long idFuncionario;
    private String nomeFuncionario;
    private String cargo;
}
