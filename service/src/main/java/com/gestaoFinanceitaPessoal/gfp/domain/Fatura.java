package com.gestaoFinanceitaPessoal.gfp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "fatura")
@Getter
@Setter
public class Fatura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fatura")
    @SequenceGenerator(name = "seq_fatura", sequenceName = "seq_fatura", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cartao_id", referencedColumnName = "id")
    private Cartao cartao;

    @Column(name = "mesReferente", nullable = false)
    private String mesReferente;

    @Column(name = "dataFechamento", nullable = false)
    private LocalDate dataFechamento;

    @Column(name = "dataVenciemnto", nullable = false)
    private LocalDate dataVenciemnto;

    @Column(name = "valorDisonivel")
    private Double valorDisonivel;

    @Column(name = "valorTotal", nullable = false)
    private Double valorTotal;

    @Column(name = "pagamentoRealizado", nullable = false)
    private Boolean pagamentoRealizado;

    @Column(name = "status", nullable = false)
    private Boolean status;
}
