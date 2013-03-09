package br.com.globalcode.ginga.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.URLFetcher;

import br.com.globalcode.ginga.model.Conteudo;

/**
 * Parser de conteúdos.
 * 
 * @author otaviojava
 * @author newton.beck
 * 
 */
public class ConteudoParser {

	/**
	 * Realiza o parse do arquivo e gera uma lista de conteúdos.
	 * 
	 * @param url
	 *            URL que será requisitada
	 * @return lista de conteúdos do arquivo
	 * @throws IOException
	 *             caso ocorra algum erro durante a leitura do arquivo
	 * @throws JSONException
	 *             caso ocorra algum erro durante o parse do JSON
	 */
	public static List parse(String url) throws IOException, JSONException {
		// Recupera os itens da web service
		String resposta = URLFetcher.getURLContent(url);

		List conteudos = new ArrayList();

		// Realiza o parse do JSON
		JSONArray itens = new JSONArray(resposta);

		for (int i = 0; i < itens.length(); i++) {
			JSONObject objeto = itens.getJSONObject(i);

			String imagem = objeto.get("imagem").toString();
			String descricao = objeto.get("descricao").toString();
			String nome = objeto.get("nome").toString();

			Conteudo conteudo = new Conteudo(descricao, imagem, nome);

			conteudos.add(conteudo);
		}

		return conteudos;
	}

}
