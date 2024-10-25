package com.example.stockwise.repositories;

import com.example.stockwise.entities.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {
    List<FuncionarioEntity> findAll();
}
