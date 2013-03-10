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
abstract class ConteudoParser implements Parser{
	
/**
 * URL base para os serviços do twitter	
 */
private static final String URL_BASE="http://otaviojava.com.br/ginga-media-server/resources/";

/**
 * Retorna o base resource que será utilizada
 * @return o recurso que será utilizado
 */
public abstract String getResource();

private static final int TAMANHO_MINIMO=5;
public List parse(String queryString) throws IOException, JSONException {
	return parse(queryString, TAMANHO_MINIMO);
}

	/**
	 * Realiza o parse do arquivo e gera uma lista de conteúdos.
	 * 
	 * @param hashTag
	 *            URL que será requisitada
	 * @return lista de conteúdos do arquivo
	 * @throws IOException
	 *             caso ocorra algum erro durante a leitura do arquivo
	 * @throws JSONException
	 *             caso ocorra algum erro durante o parse do JSON
	 */
	public List parse(String queryString,int tamanho) throws IOException, JSONException {
		// Recupera os itens da web service
		StringBuffer urlString=new StringBuffer();
		urlString.append(URL_BASE);
		urlString.append(getResource());
		urlString.append(queryString);
		if(tamanho!=0){
			urlString.append("?quantidade=");
			urlString.append(tamanho);
		}
		String resposta = URLFetcher.getURLContent(urlString.toString());

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
