package com.gestaoFinanceitaPessoal.gfp.service.dto;

import com.gestaoFinanceitaPessoal.gfp.domain.enums.TipoCartao;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CartaoListDTO implements Serializable {

    private Long id;
    private Integer identificador;
    private String nomeBanco;
    private String bandeira;
    private Double limite;
    private String apelido;
    private TipoCartao tipoCartao;

    public CartaoListDTO(Long id, Integer identificador, String nomeBanco, String bandeira, Double limite,
                         String apelido, TipoCartao tipoCartao) {
        this.id = id;
        this.identificador = identificador;
        this.nomeBanco = nomeBanco;
        this.bandeira = bandeira;
        this.limite = limite;
        this.apelido = apelido;
        this.tipoCartao = tipoCartao;
    }
}
