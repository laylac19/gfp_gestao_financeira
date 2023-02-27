package com.gestaoFinanceitaPessoal.gfp.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoConta {
    CORRENTE(1, "Conta Corrente"),
    POUPANCA(2, "Conta Poupança"),
    SALARIO(3, "Conta Salário"),
    PAGAMENTOS(4, "Conta Pagamentos");

    private final Integer id;
    private final String value;
}
