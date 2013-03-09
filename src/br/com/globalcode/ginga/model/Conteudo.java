package br.com.globalcode.ginga.model;

/**
 * Modelo de conteúdos que serão exibidos na TV.
 * 
 * @author otaviojava
 * @author newton.beck
 * 
 */
public class Conteudo {

	/**
	 * Descrição do conteúdo.
	 */
	private String descricao;

	/**
	 * Caminho da imagem relacionada ao conteúdo.
	 */
	private String imagem;

	/**
	 * Nome do conteúdo.
	 */
	private String nome;

	public Conteudo(String descricao, String nome) {
		this.descricao = descricao;
		this.nome = nome;
	}

	public Conteudo(String descricao, String imagem, String nome) {
		this.descricao = descricao;
		this.imagem = imagem;
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public String getNome() {
		return nome;
	}

}
