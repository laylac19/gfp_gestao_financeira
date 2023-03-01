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

    @NotNull(message = MensagemMovimentacaoUtil.RELEASE_DATE_NULL)
    private LocalDate dataLancamento;

    @NotNull(message = MensagemMovimentacaoUtil.NULL_DESCRIPTION)
    @NotEmpty(message = MensagemMovimentacaoUtil.EMPTY_DESCRIPTION)
    private String descricao;

    @NotNull(message = MensagemMovimentacaoUtil.VALUE_NULL)
    @NotEmpty(message = MensagemMovimentacaoUtil.EMPTY_VALUE)
    private Double valor;

    @NotNull(message = MensagemMovimentacaoUtil.NULL_MOVEMENT_TYPE)
    private TipoMovimentacao movimentacao;

    private LocalDate dataVencimento;

    private LocalDate dataPagEfetuado;

    private Boolean status = false;
}
