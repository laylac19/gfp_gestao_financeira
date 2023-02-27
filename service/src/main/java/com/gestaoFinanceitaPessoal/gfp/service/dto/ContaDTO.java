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

    @NotNull(message = MensagemBancoUtil.ID_BANCO_NULL)
    private Long idBanco;

    @NotNull(message = MensagemBancoUtil.NOME_BANCO_NULL)
    @NotEmpty(message = MensagemBancoUtil.NOME_BANCO_VAZIO)
    private String nomeBanco;

    @NotNull(message = MensagemContaUtil.TIPO_CONTA_NULL)
    @NotEmpty(message = MensagemContaUtil.TIPO_CONTA_VAZIO)
    private TipoConta tipoConta;

    @NotNull(message = MensagemContaUtil.SALDO_APLICACAO_NULLO)
    private Double saldo;

    private Boolean status = false;
}
