package com.gestaoFinanceitaPessoal.gfp.service;

import com.gestaoFinanceitaPessoal.gfp.domain.Conta;
import com.gestaoFinanceitaPessoal.gfp.repository.ContaRepository;
import com.gestaoFinanceitaPessoal.gfp.service.dto.ContaDTO;
import com.gestaoFinanceitaPessoal.gfp.service.exception.EntityNotFoundException;
import com.gestaoFinanceitaPessoal.gfp.service.mapper.ContaMapper;
import com.gestaoFinanceitaPessoal.gfp.service.util.ConstanteUtil;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemContaUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@RequiredArgsConstructor
@Transactional
public class ContaService {
    private final ContaRepository repository;
    private final ContaMapper mapper;

    public Conta findEntity(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(MensagemContaUtil.ENTITY_NOT_FOUND));
    }

    public ContaDTO findByID(Long id) {
        return mapper.toDto(findEntity(id));
    }

    public ContaDTO save(ContaDTO dto) {
        validateAccountCreationMoment(dto);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public void delete(Long id) {
        Conta account = findEntity(id);
        account.setStatus(true);
        repository.save(account);
    }

    private void validateAccountCreationMoment(ContaDTO dto) {
        if (Objects.isNull(dto.getId())) {
            dto.setSaldo(ConstanteUtil.SET_ZERO_BALANCE);
        }
    }
}
