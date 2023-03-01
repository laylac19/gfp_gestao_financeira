package com.gestaoFinanceitaPessoal.gfp.controller;

import com.gestaoFinanceitaPessoal.gfp.service.CartaoService;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CartaoDTO;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CartaoListDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cartao")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class CartaoController {

    private final CartaoService service;

    @GetMapping
    public ResponseEntity<Page<CartaoListDTO>> findAll(Pageable pageable) {
        return new ResponseEntity<>(service.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{idCartao}")
    public ResponseEntity<CartaoDTO> findByID(@PathVariable("idCartao") Long idCartao) {
        return new ResponseEntity<>(service.findByID(idCartao), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CartaoDTO> save(@RequestBody CartaoDTO dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{idCartao}")
    public ResponseEntity<Void> delete(@PathVariable("idCartao") Long idCartao) {
        service.delete(idCartao);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
