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

    @NotNull(message = MensagemBancoUtil.ID_BANCO_NULL)
    private Long idBanco;

    @NotNull(message = MensagemBancoUtil.NOME_BANCO_NULL)
    @NotEmpty(message = MensagemBancoUtil.NOME_BANCO_VAZIO)
    private String nomeBanco;

    @NotNull(message = MensagemCaixinhaUtil.NOME_CAIXINHA_NULL)
    @NotEmpty(message = MensagemCaixinhaUtil.NOME_CAIXINHA_VAZIO)
    private String nomeCaixinha;

    @NotNull(message = MensagemCaixinhaUtil.DESCRICAO_CAIXINHA_NULL)
    @NotEmpty(message = MensagemCaixinhaUtil.DESCRICAO_CAIXINHA_VAZIA)
    private String descricao;

    @NotNull(message = MensagemCaixinhaUtil.VALOR_TOTAL_CAIXINHA_NULL)
    private Double valorTotal;

    private Boolean status = false;

    private Set<AplicacaoDTO> aplicacoes = new LinkedHashSet<>();
}
