package com.gestaoFinanceitaPessoal.gfp.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoCartao {
    CREDITO_VIRTUAL(1, "Crédito Virtual"),
    CREDITO_FISICO(2, "Crédito Físico"),
    DEBITO(3, "Débito");

    private final Integer id;
    private final String value;
}
