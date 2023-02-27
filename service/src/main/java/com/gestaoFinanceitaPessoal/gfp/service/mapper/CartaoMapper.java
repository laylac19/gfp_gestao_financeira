package com.gestaoFinanceitaPessoal.gfp.service.mapper;

import com.gestaoFinanceitaPessoal.gfp.domain.Cartao;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CartaoDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartaoMapper extends EntityMapper<CartaoDTO, Cartao> {

    @Override
    @Mapping(source = "banco.id", target = "idBanco")
    @Mapping(source = "banco.nome", target = "nomeBanco")
    @Mapping(source = "bandeira.id", target = "idBandeira")
    @Mapping(source = "bandeira.nome", target = "bandeira")
    @Mapping(source = "cartaoVirtual.id", target = "idCartaoVirtual")
    @Mapping(source = "cartaoVirtual.apelido", target = "apelidoCartaoVirtual")
    CartaoDTO toDto(Cartao entity);

    @Override
    @InheritInverseConfiguration
    Cartao toEntity(CartaoDTO dto);
}

