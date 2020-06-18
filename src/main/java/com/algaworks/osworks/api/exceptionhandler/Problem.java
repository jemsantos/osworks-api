/**
 * 
 */
package com.algaworks.osworks.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Jose Eustaquio Muniz
 *
 */
@JsonInclude(Include.NON_NULL)
public class Problem {

	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	private List<Campo> campos;

	public static class Campo {
		private String nome;
		private String mensagem;

		/**
		 * @param nome
		 * @param mensagem
		 */
		public Campo(String nome, String mensagem) {
			super();
			this.nome = nome;
			this.mensagem = mensagem;
		}

		/**
		 * @return the nome
		 */
		public String getNome() {
			return nome;
		}

		/**
		 * @param nome the nome to set
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}

		/**
		 * @return the mensagem
		 */
		public String getMensagem() {
			return mensagem;
		}

		/**
		 * @param mensagem the mensagem to set
		 */
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the dataHora
	 */
	public LocalDateTime getDataHora() {
		return dataHora;
	}

	/**
	 * @param dataHora the dataHora to set
	 */
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the campos
	 */
	public List<Campo> getCampos() {
		return campos;
	}

	/**
	 * @param campos the campos to set
	 */
	public void setCampos(List<Campo> campos) {
		this.campos = campos;
	}

}
