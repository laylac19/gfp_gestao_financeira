package com.gestaoFinanceitaPessoal.gfp.service.mapper;

import com.gestaoFinanceitaPessoal.gfp.domain.Movimentacao;
import com.gestaoFinanceitaPessoal.gfp.service.dto.MovimentacaoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovimentacaoMapper extends EntityMapper<MovimentacaoDTO, Movimentacao> {
}
