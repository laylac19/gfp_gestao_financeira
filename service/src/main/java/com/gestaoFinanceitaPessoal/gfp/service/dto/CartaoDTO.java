package com.gestaoFinanceitaPessoal.gfp.service.dto;

import com.gestaoFinanceitaPessoal.gfp.domain.enums.TipoCartao;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemBancoUtil;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemBandeiraUtil;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemCartaoUtil;
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
public class CartaoDTO implements Serializable {

    private Long id;

    @NotNull(message = MensagemBancoUtil.NULL_BANK_ID)
    private Long idBanco;

    @NotNull(message = MensagemCartaoUtil.NULL_IDENTIFIER)
    private Integer identificador;

    @NotNull(message = MensagemBancoUtil.BANK_NAME_NULL)
    @NotEmpty(message = MensagemBancoUtil.BANK_NAME_EMPTY)
    private String nomeBanco;

    @NotNull(message = MensagemBandeiraUtil.NULL_CARD_FLAG_ID)
    private Long idBandeira;

    @NotNull(message = MensagemBandeiraUtil.NULL_CARD_FLAG_NAME)
    @NotEmpty(message = MensagemBandeiraUtil.EMPTY_CARD_FLAG_NAME)
    private String bandeira;

    @NotNull(message = MensagemCartaoUtil.NULL_CARD_LIMIT)
    private Double limite;

    @NotNull(message = MensagemCartaoUtil.NICKNAME_CARD_LIMIT)
    @NotEmpty(message = MensagemCartaoUtil.NICKNAME_CARD_LIMIT)
    private String apelido;

    @NotNull(message = MensagemCartaoUtil.NULL_CARD_TYPE)
    private TipoCartao tipoCartao;

    @NotNull(message = MensagemCartaoUtil.NULL_VIRTUAL_CARD_ID)
    private Long idCartaoVirtual;

    @NotNull(message = MensagemCartaoUtil.NAME_VIRTUAL_CARD_NULL)
    @NotEmpty(message =MensagemCartaoUtil.NAME_EMPTY_VIRTUAL_CARD)
    private String apelidoCartaoVirtual;

    private Boolean status = false;
}
