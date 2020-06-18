/**
 * 
 */
package com.algaworks.osworks.domain.exception;

/**
 * @author Jose Eustaquio Muniz
 *
 */
public class NegocioException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/* poderia se chamar DomainNegocio */
	public NegocioException(String message) {
		super(message);
	}

}
