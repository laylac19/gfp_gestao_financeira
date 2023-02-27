package com.gestaoFinanceitaPessoal.gfp.domain;

import com.gestaoFinanceitaPessoal.gfp.domain.enums.TipoMovimentacao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "movimentacao")
@Getter
@Setter
public class Movimentacao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_movimentacao")
    @SequenceGenerator(name = "seq_movimentacao", sequenceName = "seq_movimentacao", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "dataLancamento", nullable = false)
    private LocalDate dataLancamento;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @Column(name = "tipoMovimentacao", nullable = false)
    private TipoMovimentacao movimentacao;

    @Column(name = "dataVencimento")
    private LocalDate dataVencimento;

    @Column(name = "dataPagEfetuado")
    private LocalDate dataPagEfetuado;

    @Column(name = "status", nullable = false)
    private Boolean status;
}
