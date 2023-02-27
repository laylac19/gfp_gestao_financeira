package com.gestaoFinanceitaPessoal.gfp.service.mapper;

import com.gestaoFinanceitaPessoal.gfp.domain.Aplicacao;
import com.gestaoFinanceitaPessoal.gfp.service.dto.AplicacaoDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AplicacaoMapper extends EntityMapper<AplicacaoDTO, Aplicacao> {

    @Override
    @Mapping(source = "caixinha.id", target = "idCaixinha")
    AplicacaoDTO toDto(Aplicacao entity);

    @Override
    @InheritInverseConfiguration
    Aplicacao toEntity(AplicacaoDTO dto);
}
