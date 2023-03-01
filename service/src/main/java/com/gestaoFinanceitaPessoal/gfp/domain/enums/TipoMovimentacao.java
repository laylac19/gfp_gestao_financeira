package com.gestaoFinanceitaPessoal.gfp.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoMovimentacao {
    ENTRADA(0, "Entrada"),
    SAIDA(1, "Saída"),
    DESPESA_FIXA(2, "Despesa Fixa"),
    COMPRA_CARTAO_CREDITO(3, "Compra no Cartão de Crédito");

    private final Integer id;
    private final String value;
}
