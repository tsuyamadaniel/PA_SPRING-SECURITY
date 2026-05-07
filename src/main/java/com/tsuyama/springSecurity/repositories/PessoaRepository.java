package com.tsuyama.springSecurity.repositories;


import com.tsuyama.springSecurity.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}