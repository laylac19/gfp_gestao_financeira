package com.gestaoFinanceitaPessoal.gfp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "cartao")
@Getter
@Setter
public class Cartao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cartao")
    @SequenceGenerator(name = "seq_cartao", sequenceName = "seq_cartao", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banco_id", referencedColumnName = "id", nullable = false)
    private Banco banco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bandeira_id", referencedColumnName = "id", nullable = false)
    private Bandeira bandeira;

    @Column(name = "limite", nullable = false)
    private Double limite;

    @Column(name = "apelido", nullable = false)
    private String apelido;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cartao_id", referencedColumnName = "id")
    private Cartao cartaoVirtual;

    @Column(name = "status", nullable = false)
    private Boolean status;
}
