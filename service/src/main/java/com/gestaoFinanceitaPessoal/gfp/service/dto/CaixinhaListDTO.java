package com.gestaoFinanceitaPessoal.gfp.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CaixinhaListDTO implements Serializable {

    private Long id;
    private String nomeCaixinha;
    private String descricao;
    private Double valorTotal;
    private Set<AplicacaoDTO> aplicacoes = new LinkedHashSet<>();

    public CaixinhaListDTO(Long id, String nomeCaixinha, String descricao, Double valorTotal) {
        this.id = id;
        this.nomeCaixinha = nomeCaixinha;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }
}
