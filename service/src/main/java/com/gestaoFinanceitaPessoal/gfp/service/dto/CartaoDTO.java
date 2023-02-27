package com.gestaoFinanceitaPessoal.gfp.service.dto;

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

    @NotNull(message = MensagemBancoUtil.ID_BANCO_NULL)
    private Long idBanco;

    @NotNull(message = MensagemBancoUtil.NOME_BANCO_NULL)
    @NotEmpty(message = MensagemBancoUtil.NOME_BANCO_VAZIO)
    private String nomeBanco;

    @NotNull(message = MensagemBandeiraUtil.ID_BANDEIRA_NULL)
    private Long idBandeira;

    @NotNull(message = MensagemBandeiraUtil.NOME_BANDEIRA_NULL)
    @NotEmpty(message = MensagemBandeiraUtil.NOME_BANDEIRA_VAZIO)
    private String bandeira;

    @NotNull(message = MensagemCartaoUtil.LIMITE_CARTAO_NULL)
    private Double limite;

    @NotNull(message = MensagemCartaoUtil.APELIDO_CARTAO_NULL)
    @NotEmpty(message = MensagemCartaoUtil.APELIDO_CARTAO_VAZIO)
    private String apelido;

    @NotNull(message = MensagemCartaoUtil.ID_CARTAO_VIRTUAL_NULL)
    private Long idCartaoVirtual;

    @NotNull(message = MensagemCartaoUtil.NOME_CARTAO_VIRTUAL_NULL)
    @NotEmpty(message =MensagemCartaoUtil.NOME_CARTAO_VIRTUAL_VAZIO)
    private String apelidoCartaoVirtual;

    private Boolean status = false;
}
