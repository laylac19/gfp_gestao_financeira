package com.gestaoFinanceitaPessoal.gfp.service.dto;

import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemBancoUtil;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemCaixinhaUtil;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
public class CaixinhaDTO implements Serializable {

    private Long id;

    @NotNull(message = MensagemBancoUtil.NULL_BANK_ID)
    private Long idBanco;

    @NotNull(message = MensagemBancoUtil.BANK_NAME_NULL)
    @NotEmpty(message = MensagemBancoUtil.BANK_NAME_EMPTY)
    private String nomeBanco;

    @NotNull(message = MensagemCaixinhaUtil.BOX_NAME_NULL)
    @NotEmpty(message = MensagemCaixinhaUtil.BOX_NAME_EMPTY)
    private String nomeCaixinha;

    @NotNull(message = MensagemCaixinhaUtil.DESCRIPTION_BOX_NULL)
    @NotEmpty(message = MensagemCaixinhaUtil.DESCRIPTION_EMPTY_BOX)
    private String descricao;

    @NotNull(message = MensagemCaixinhaUtil.TOTAL_VALUE_BOX_NULL)
    private Double valorTotal;

    private Boolean status = false;

    private Set<AplicacaoDTO> aplicacoes = new LinkedHashSet<>();
}
