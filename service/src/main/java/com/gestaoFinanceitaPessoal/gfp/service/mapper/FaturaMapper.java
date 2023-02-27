package com.gestaoFinanceitaPessoal.gfp.service.mapper;

import com.gestaoFinanceitaPessoal.gfp.domain.Fatura;
import com.gestaoFinanceitaPessoal.gfp.service.dto.FaturaDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapping;

public interface FaturaMapper extends EntityMapper<FaturaDTO, Fatura> {

    @Override
    @Mapping(source = "cartao.id", target = "idCartao")
    @Mapping(source = "cartao.apelido", target = "apelidoCartao")
    FaturaDTO toDto(Fatura entity);

    @Override
    @InheritInverseConfiguration
    Fatura toEntity(FaturaDTO dto);
}
