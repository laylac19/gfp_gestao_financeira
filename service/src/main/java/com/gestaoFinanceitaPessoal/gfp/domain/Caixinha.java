package com.gestaoFinanceitaPessoal.gfp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "caixinha")
@Getter
@Setter
public class Caixinha implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_caixinha")
    @SequenceGenerator(name = "seq_caixinha", sequenceName = "seq_caixinha", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banco_id", referencedColumnName = "id", nullable = false)
    private Banco banco;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "valorTotal", nullable = false)
    private Double valorTotal;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @OneToMany(mappedBy = "caixinha", orphanRemoval = true)
    private Set<Aplicacao> aplicacoes = new LinkedHashSet<>();

}
