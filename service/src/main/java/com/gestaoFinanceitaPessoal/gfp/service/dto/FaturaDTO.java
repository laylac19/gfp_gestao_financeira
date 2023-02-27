package com.gestaoFinanceitaPessoal.gfp.service.dto;

import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemCartaoUtil;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemFaturaUtil;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FaturaDTO implements Serializable {
    private Long id;

    @NotNull(message = MensagemCartaoUtil.ID_CARTAO_NULL)
    private Long idCartao;

    @NotNull(message = MensagemCartaoUtil.APELIDO_CARTAO_NULL)
    private String apelidoCartao;

    @NotNull(message = MensagemFaturaUtil.MES_NULL)
    private String mes;

    @NotNull(message = MensagemFaturaUtil.DATA_FECHAMENTO_NULL)
    private LocalDate dataFechamento;

    @NotNull(message = MensagemFaturaUtil.DATA_VENCIMENTO_NULL)
    private LocalDate dataVenciemnto;

    private Double valorDisonivel;

    private Double valorTotal;

    private Boolean pagamentoRealizado = false;

    private Boolean status = false;
}
