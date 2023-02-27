package com.gestaoFinanceitaPessoal.gfp.service.mapper;

import com.gestaoFinanceitaPessoal.gfp.domain.Caixinha;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CaixinhaDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {AplicacaoMapper.class})
public interface CaixinhaMapper extends EntityMapper<CaixinhaDTO, Caixinha>{
    @Override
    @Mapping(source = "banco.id", target = "idBanco")
    CaixinhaDTO toDto(Caixinha entity);

    @Override
    @InheritInverseConfiguration
    Caixinha toEntity(CaixinhaDTO dto);
}
