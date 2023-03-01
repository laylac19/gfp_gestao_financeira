package com.gestaoFinanceitaPessoal.gfp.repository;

import com.gestaoFinanceitaPessoal.gfp.domain.Conta;
import com.gestaoFinanceitaPessoal.gfp.service.dto.ContaListDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    @Query( " SELECT NEW com.gestaoFinanceitaPessoal.gfp.service.dto.ContaListDTO(C.id, C.banco.nome, " +
            " C.tipoConta, C.saldo) " +
            " FROM Conta C WHERE C.status = false " )
    Page<ContaListDTO> listAll(Pageable pageable);
}
