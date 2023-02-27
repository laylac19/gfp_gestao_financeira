package com.gestaoFinanceitaPessoal.gfp.service.exception;

public class RegraNegocioException extends RuntimeException {

	public RegraNegocioException(final String mensagem) {
		this(mensagem, null);
	}

	public RegraNegocioException(final String mensagem, final Throwable causa) {
		super(mensagem, causa);
	}

}
