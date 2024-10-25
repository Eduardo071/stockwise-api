package com.example.stockwise.controllers;

import com.example.stockwise.DTO.CategoriaDTO;
import com.example.stockwise.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/buscar-todos")
    public List<CategoriaDTO> findAll() {
        return categoriaService.findAll();
    }
}