package com.gestaoFinanceitaPessoal.gfp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
import java.time.LocalDateTime;

@Entity
@Table(name = "aplicacao_caixinha")
@Getter
@Setter
public class Aplicacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_aplicacao")
    @SequenceGenerator(name = "seq_aplicacao", sequenceName = "seq_aplicacao", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @Column(name = "dataLancamento", nullable = false)
    private LocalDateTime dataLancamento;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @ManyToOne(optional = false)
    @JoinColumn(name = "caixinha_id", nullable = false, unique = true)
    private Caixinha caixinha;

}
