package br.com.globalcode.ginga.tweets.model;

import java.io.IOException;

import org.json.URLFetcher;

import com.sun.dtv.lwuit.Image;

/**
 * Modelo de tweet.
 * 
 * @author Newton Rhomel Beck Angelini [newton.beck@gmail.com]
 * @author Cesar Augusto Nogueira [cesarnogueira1210@gmail.com]
 *
 */
public class Tweet {

	private String imagem;
	
	private String usuario;
	
	private String conteudo;

	public Tweet(String imagem, String usuario, String conteudo) {
		System.out.println("Imagem " + imagem);
		System.out.println("Usuario " + usuario);
		System.out.println("Conteudo " + conteudo);
		
		this.imagem = imagem;
		this.usuario = usuario;
		this.conteudo = conteudo;
	}

	public Image getImagem() {
		try {
			return URLFetcher.getImageFromURL(imagem);
		} catch (IOException e) {
			return null;
		}
	}

	public String getUsuario() {
		return "@" + usuario;
	}

	public String getConteudo() {
		return conteudo;
	}
	
}
