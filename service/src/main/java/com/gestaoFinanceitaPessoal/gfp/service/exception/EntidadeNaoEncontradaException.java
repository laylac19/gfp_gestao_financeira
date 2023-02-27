package com.gestaoFinanceitaPessoal.gfp.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class EntidadeNaoEncontradaException extends ResponseStatusException {

	public EntidadeNaoEncontradaException(String razao) {
		super(HttpStatus.NOT_FOUND, razao);
	}

}
