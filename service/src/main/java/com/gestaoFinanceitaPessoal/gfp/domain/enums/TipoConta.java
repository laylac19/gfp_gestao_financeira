package com.gestaoFinanceitaPessoal.gfp.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoConta {
    CORRENTE(0, "Conta Corrente"),
    POUPANCA(1, "Conta Poupança"),
    SALARIO(2, "Conta Salário"),
    PAGAMENTOS(3, "Conta Pagamentos");

    private final Integer id;
    private final String value;
}
