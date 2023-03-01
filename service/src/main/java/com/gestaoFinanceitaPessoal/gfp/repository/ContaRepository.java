package com.gestaoFinanceitaPessoal.gfp.repository;

import com.gestaoFinanceitaPessoal.gfp.domain.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
}
