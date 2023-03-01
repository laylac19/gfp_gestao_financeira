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

    @NotNull(message = MensagemAplicacaoUtil.NULL_INCOME_AMOUNT)
    private Double valor;

    @NotNull(message = MensagemAplicacaoUtil.INCOME_INPUT_DATE_NULL)
    private LocalDateTime dataLancamento;

    private Boolean status = false;

    @NotNull(message = MensagemCaixinhaUtil.BOX_ID_NULL)
    private Long idCaixinha;

    @NotNull(message = MensagemCaixinhaUtil.BOX_NAME_NULL)
    @NotEmpty(message = MensagemCaixinhaUtil.BOX_NAME_EMPTY)
    private String nomeCaixinha;

}
