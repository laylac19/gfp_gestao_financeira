package com.gestaoFinanceitaPessoal.gfp.service.dto;

import com.gestaoFinanceitaPessoal.gfp.domain.enums.TipoMovimentacao;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemMovimentacaoUtil;
import jakarta.validation.constraints.NotEmpty;
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
public class MovimentacaoDTO implements Serializable {

    private Long id;

    @NotNull(message = MensagemMovimentacaoUtil.DATA_LANCAMENTO_NULL)
    private LocalDate dataLancamento;

    @NotNull(message = MensagemMovimentacaoUtil.DESCRICAO_NULL)
    @NotEmpty(message = MensagemMovimentacaoUtil.DESCRICAO_VAZIA)
    private String descricao;

    @NotNull(message = MensagemMovimentacaoUtil.VALOR_NULL)
    @NotEmpty(message = MensagemMovimentacaoUtil.VALOR_VAZIO)
    private Double valor;

    @NotNull(message = MensagemMovimentacaoUtil.TIPO_MOVIMENTACAO_NULL)
    private TipoMovimentacao movimentacao;

    private LocalDate dataVencimento;

    private LocalDate dataPagEfetuado;

    private Boolean status = false;
}
