package com.tsuyama.springSecurity.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.rmi.server.UID;
import java.util.List;

@Entity
public class JobModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UID id;
    private String nome;
    @OneToMany
    private List<PessoaModel> pessoaModels;

}
