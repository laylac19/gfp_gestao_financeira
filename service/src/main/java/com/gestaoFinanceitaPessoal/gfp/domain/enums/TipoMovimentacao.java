package com.gestaoFinanceitaPessoal.gfp.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoMovimentacao {
    ENTRADA(1, "Entrada"),
    SAIDA(2, "Saída"),
    DESPESA_FIXA(3, "Despesa Fixa"),
    COMPRA_CARTAO_CREDITO(4, "Compra no Cartão de Crédito");

    private final Integer id;
    private final String value;
}
