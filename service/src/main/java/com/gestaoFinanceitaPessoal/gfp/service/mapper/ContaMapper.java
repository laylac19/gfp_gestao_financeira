package com.gestaoFinanceitaPessoal.gfp.service.mapper;

import com.gestaoFinanceitaPessoal.gfp.domain.Conta;
import com.gestaoFinanceitaPessoal.gfp.service.dto.ContaDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ContaMapper extends EntityMapper<ContaDTO, Conta> {

    @Override
    @Mapping(source = "banco.id", target = "idBanco")
    @Mapping(source = "banco.nome", target = "nomeBanco")
    ContaDTO toDto(Conta entity);

    @Override
    @InheritInverseConfiguration
    Conta toEntity(ContaDTO dto);
}
