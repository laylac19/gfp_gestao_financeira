package com.gestaoFinanceitaPessoal.gfp.service.dto;

import com.gestaoFinanceitaPessoal.gfp.domain.enums.TipoConta;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemBancoUtil;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemContaUtil;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContaDTO implements Serializable {

    private Long id;

    @NotNull(message = MensagemBancoUtil.NULL_BANK_ID)
    private Long idBanco;

    @NotNull(message = MensagemBancoUtil.BANK_NAME_NULL)
    @NotEmpty(message = MensagemBancoUtil.BANK_NAME_EMPTY)
    private String nomeBanco;

    @NotNull(message = MensagemContaUtil.ACCOUNT_TYPE_NULL)
    @NotEmpty(message = MensagemContaUtil.ACCOUNT_TYPE_EMPTY)
    private TipoConta tipoConta;

    @NotNull(message = MensagemContaUtil.NULL_INVESTMENT_BALANCE)
    private Double saldo;

    private Boolean status = false;
}
