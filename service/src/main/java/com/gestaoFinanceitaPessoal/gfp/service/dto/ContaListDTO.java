package com.gestaoFinanceitaPessoal.gfp.service.dto;

import com.gestaoFinanceitaPessoal.gfp.domain.enums.TipoConta;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ContaListDTO implements Serializable {

    private Long id;
    private String nomeBanco;
    private TipoConta tipoConta;
    private Double saldo;

    public ContaListDTO(Long id, String nomeBanco, TipoConta tipoConta, Double saldo) {
        this.id = id;
        this.nomeBanco = nomeBanco;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }
}
