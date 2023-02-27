package com.gestaoFinanceitaPessoal.gfp.domain;

import com.gestaoFinanceitaPessoal.gfp.domain.enums.TipoConta;
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

@Entity
@Table(name = "conta")
@Getter
@Setter
public class Conta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta")
    @SequenceGenerator(name = "seq_conta", sequenceName = "seq_conta", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banco_id", referencedColumnName = "id", nullable = false)
    private Banco banco;

    @Column(name = "tipoConta", nullable = false)
    private TipoConta tipoConta;

    @Column(name = "saldo", nullable = false)
    private Double saldo;

    @Column(name = "status", nullable = false)
    private Boolean status;
}
