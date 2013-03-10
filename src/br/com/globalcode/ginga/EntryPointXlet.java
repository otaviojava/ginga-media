package br.com.globalcode.ginga;

import java.io.IOException;
import java.util.List;

import javax.microedition.xlet.Xlet;
import javax.microedition.xlet.XletContext;
import javax.microedition.xlet.XletStateChangeException;

import org.json.JSONException;

import br.com.globalcode.ginga.engine.Parser;
import br.com.globalcode.ginga.engine.ParserFactory;
import br.com.globalcode.ginga.engine.ProdutoParser;

/**
 * Ponto de entrada da aplicação Ginga-J.
 * 
 * @author Newton Rhomel Beck Angelini [newton.beck@gmail.com]
 * 
 */
public class EntryPointXlet implements Xlet {

	/**
	 * lista de conteudos oriundo do Twitter
	 */
	private List conteudos;
	public void destroyXlet(boolean arg0) throws XletStateChangeException {

	}

	public void initXlet(XletContext arg0) throws XletStateChangeException {

	}

	public void pauseXlet() {

	}

	public void startXlet() throws XletStateChangeException {
		Parser parser=ParserFactory.createParser(ParserFactory.PARSER_PRODUTO);
		try {
			conteudos=parser.parse("gingaJava");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
