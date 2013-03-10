package br.com.globalcode.ginga.engine;

/**
 * 
 * Classe responsável por estar criando os 
 * objetos parser
 * @author otaviojava
 *
 */
public final class ParserFactory {
public static final int PARSER_PRODUTO=0;
public static final int PARSER_PROGRAMA=1;
	
	public static final Parser createParser(int tipoParser){
		switch (tipoParser) {
		case PARSER_PRODUTO:
			return new ProdutoParser();
		case PARSER_PROGRAMA:
			return new ProgramaParser();

		default:
			return null;
		}
		
	}
	
}
