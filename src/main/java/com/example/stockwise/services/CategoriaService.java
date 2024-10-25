package com.example.stockwise.services;

import com.example.stockwise.DTO.CategoriaDTO;
import com.example.stockwise.config.ModelMapperConfig;
import com.example.stockwise.entities.CategoriaEntity;
import com.example.stockwise.repositories.CategoriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaDTO> findAll() {
        return ModelMapperConfig.mapList(categoriaRepository.findAll(), CategoriaDTO.class);
    }

}
