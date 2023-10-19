package br.edu.ifsul.cstsi.orm_springdata_maven.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity(name = "Socio")
@Table(name = "socios")
public class Socio {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String telefone;
    private LocalDate aniversario;
    @Embedded
    private SocioEndereco endereco;
}
