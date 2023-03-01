package com.gestaoFinanceitaPessoal.gfp.repository;

import com.gestaoFinanceitaPessoal.gfp.domain.Cartao;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CartaoListDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {

    @Query( " SELECT CASE WHEN COUNT(C.id) > 0 THEN false ELSE true END " +
            " FROM Cartao C " +
            " WHERE C.tipoCartao = 2 AND C.identificador = :identifier ")
    Boolean duplicatePhysicalCardIdentifier(@Param("identifier") Integer identifier);

    @Query( " SELECT NEW com.gestaoFinanceitaPessoal.gfp.service.dto.CartaoListDTO(C.id, C.identificador, " +
            " C.banco.nome, C.bandeira.nome, C.limite, C.apelido, C.tipoCartao) " +
            " FROM Cartao C WHERE C.status = false ")
    Page<CartaoListDTO> listAll(Pageable pageable);
}
