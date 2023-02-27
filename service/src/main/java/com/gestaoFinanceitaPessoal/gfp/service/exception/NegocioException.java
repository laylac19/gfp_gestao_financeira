package com.gestaoFinanceitaPessoal.gfp.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NegocioException extends ResponseStatusException {

	public NegocioException(String razao) {
		super(HttpStatus.BAD_REQUEST, razao);
	}

}
