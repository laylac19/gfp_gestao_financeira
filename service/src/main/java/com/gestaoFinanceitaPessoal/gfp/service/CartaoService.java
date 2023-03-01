package com.gestaoFinanceitaPessoal.gfp.service;

import com.gestaoFinanceitaPessoal.gfp.domain.Cartao;
import com.gestaoFinanceitaPessoal.gfp.domain.enums.TipoCartao;
import com.gestaoFinanceitaPessoal.gfp.repository.CartaoRepository;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CartaoDTO;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CartaoListDTO;
import com.gestaoFinanceitaPessoal.gfp.service.exception.EntityNotFoundException;
import com.gestaoFinanceitaPessoal.gfp.service.mapper.CartaoMapper;
import com.gestaoFinanceitaPessoal.gfp.service.util.MensagemCartaoUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
@Transactional
public class CartaoService {
    private final CartaoRepository repository;
    private final CartaoMapper mapper;

    public Cartao findEntity(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(MensagemCartaoUtil.ENTITY_NOT_FOUND));
    }

    public Page<CartaoListDTO> findAll(Pageable pageable) {
        return repository.listAll(pageable);
    }

    public CartaoDTO findByID(Long id) {
        return mapper.toDto(findEntity(id));
    }

    public CartaoDTO save(CartaoDTO dto) {
        validateCardType(dto);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public void delete(Long id) {
        Cartao account = findEntity(id);
        account.setStatus(true);
        repository.save(account);
    }

    private void validateDuplicateMainCard(CartaoDTO dto) {
        if (Boolean.FALSE.equals(repository.duplicatePhysicalCardIdentifier(dto.getIdentificador()))) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, MensagemCartaoUtil.DUPLICATE_IDENTIFIER);
        }
    }

    private void validateCardType(CartaoDTO dto) {
        if (dto.getTipoCartao().equals(TipoCartao.CREDITO_FISICO)) {
            validateDuplicateMainCard(dto);
        }
    }
}
