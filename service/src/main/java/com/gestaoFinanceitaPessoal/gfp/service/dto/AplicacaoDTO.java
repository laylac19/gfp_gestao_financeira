package com.gestaoFinanceitaPessoal.gfp.service.dto;

import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemAplicacaoUtil;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemCaixinhaUtil;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AplicacaoDTO implements Serializable {

    private Long id;

    @NotNull(message = MensagemAplicacaoUtil.VALOR_APLICACAO_NULLO)
    private Double valor;

    @NotNull(message = MensagemAplicacaoUtil.DATA_LANCAMENTO_APLICACAO_NULLO)
    private LocalDateTime dataLancamento;

    private Boolean status = false;

    @NotNull(message = MensagemCaixinhaUtil.ID_CAIXINHA_NULL)
    private Long idCaixinha;

    @NotNull(message = MensagemCaixinhaUtil.NOME_CAIXINHA_NULL)
    @NotEmpty(message = MensagemCaixinhaUtil.NOME_CAIXINHA_VAZIO)
    private String nomeCaixinha;

}
