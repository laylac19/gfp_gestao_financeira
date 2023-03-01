package com.gestaoFinanceitaPessoal.gfp.repository;

import com.gestaoFinanceitaPessoal.gfp.domain.Caixinha;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CaixinhaListDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CaixinhaRepository extends JpaRepository<Caixinha, Long> {

    @Query( " SELECT NEW com.gestaoFinanceitaPessoal.gfp.service.dto.CaixinhaListDTO(C.id, C.nome, " +
            " C.descricao, C.valorTotal) " +
            " FROM Caixinha C WHERE C.status = false " )
    Page<CaixinhaListDTO> listAll(Pageable pageable);
}
