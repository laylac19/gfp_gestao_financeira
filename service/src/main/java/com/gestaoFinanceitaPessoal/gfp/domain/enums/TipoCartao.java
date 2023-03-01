package com.gestaoFinanceitaPessoal.gfp.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoCartao {
    CREDITO_VIRTUAL(0, "Crédito Virtual"),
    CREDITO_FISICO(1, "Crédito Físico"),
    DEBITO(2, "Débito");

    private final Integer id;
    private final String value;
}
