package br.edu.ifsul.cstsi.orm_springdata_maven.model;

import jakarta.persistence.*;

@Entity(name = "Socioendereco")
@Table(name = "socioendereco")
@Embeddable
public class SocioEndereco {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private  String logradouro;
    private String bairro;
    private String complemento;
}
