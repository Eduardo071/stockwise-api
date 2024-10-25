package com.example.stockwise.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockwise.DTO.ProdutoDTO;
import com.example.stockwise.config.ModelMapperConfig;
import com.example.stockwise.entities.ProdutoEntity;
import com.example.stockwise.repositories.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoDTO save(ProdutoDTO produtoDTO) {
        
        ProdutoEntity produtoEntity = produtoRepository.save(ModelMapperConfig.map(produtoDTO, new ProdutoEntity()));
        return ModelMapperConfig.map(produtoEntity, new ProdutoDTO());
    }
}
