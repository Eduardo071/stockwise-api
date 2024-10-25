package com.example.stockwise.repositories;

import com.example.stockwise.entities.MovimentacaoEstoqueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MovimentacaoEstoqueRepository extends JpaRepository<MovimentacaoEstoqueEntity, Long> {
    List<MovimentacaoEstoqueEntity> findAll();
}
