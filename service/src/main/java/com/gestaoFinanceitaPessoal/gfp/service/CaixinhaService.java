package com.gestaoFinanceitaPessoal.gfp.service;

import com.gestaoFinanceitaPessoal.gfp.domain.Caixinha;
import com.gestaoFinanceitaPessoal.gfp.repository.CaixinhaRepository;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CaixinhaDTO;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CaixinhaListDTO;
import com.gestaoFinanceitaPessoal.gfp.service.exception.EntityNotFoundException;
import com.gestaoFinanceitaPessoal.gfp.service.mapper.CaixinhaMapper;
import com.gestaoFinanceitaPessoal.gfp.service.util.ConstanteUtil;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemCaixinhaUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@RequiredArgsConstructor
@Transactional
public class CaixinhaService {

    private final CaixinhaRepository repository;
    private final CaixinhaMapper mapper;

    public Caixinha findEntity(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(MensagemCaixinhaUtil.ENTITY_NOT_FOUND));
    }

    public Page<CaixinhaListDTO> findAll(Pageable pageable) {
        return repository.listAll(pageable);
    }

    public CaixinhaDTO findByID(Long id) {
        return mapper.toDto(findEntity(id));
    }

    public CaixinhaDTO save(CaixinhaDTO dto) {
        validateBoxCreationMoment(dto);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public void delete(Long id) {
        Caixinha box = findEntity(id);
        box.setStatus(true);
        repository.save(box);
    }

    private void validateBoxCreationMoment(CaixinhaDTO dto) {
        if (Objects.isNull(dto.getId())) {
            dto.setValorTotal(ConstanteUtil.SET_ZERO_BALANCE);
        }
    }
}
