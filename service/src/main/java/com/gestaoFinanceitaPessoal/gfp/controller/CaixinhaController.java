package com.gestaoFinanceitaPessoal.gfp.controller;

import com.gestaoFinanceitaPessoal.gfp.service.CaixinhaService;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CaixinhaDTO;
import com.gestaoFinanceitaPessoal.gfp.service.dto.CaixinhaListDTO;
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
@RequestMapping("api/caixinha")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class CaixinhaController {

    private final CaixinhaService service;

    @GetMapping
    public ResponseEntity<Page<CaixinhaListDTO>> findAll(Pageable pageable) {
        return new ResponseEntity<>(service.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{idCaixinha}")
    public ResponseEntity<CaixinhaDTO> findByID(@PathVariable("idCaixinha") Long idDoctor) {
        return new ResponseEntity<>(service.findByID(idDoctor), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CaixinhaDTO> save(@RequestBody CaixinhaDTO dto) {
        return new ResponseEntity<>(service.save(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{idCaixinha}")
    public ResponseEntity<Void> delete(@PathVariable("idCaixinha") Long idCaixinha) {
        service.delete(idCaixinha);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
