package com.example.stockwise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockwise.DTO.ProdutoDTO;
import com.example.stockwise.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/save")
    public ProdutoDTO save(@RequestBody ProdutoDTO produtoDTO) {
        return produtoService.save(produtoDTO);
    }
}
