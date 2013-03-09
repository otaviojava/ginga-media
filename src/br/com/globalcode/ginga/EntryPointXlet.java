package br.com.globalcode.ginga;

import java.io.IOException;

import javax.microedition.xlet.Xlet;
import javax.microedition.xlet.XletContext;
import javax.microedition.xlet.XletStateChangeException;

import org.json.JSONException;

import br.com.globalcode.ginga.engine.ConteudoParser;

/**
 * Ponto de entrada da aplicação Ginga-J.
 * 
 * @author Newton Rhomel Beck Angelini [newton.beck@gmail.com]
 * 
 */
public class EntryPointXlet implements Xlet {

	public void destroyXlet(boolean arg0) throws XletStateChangeException {

	}

	public void initXlet(XletContext arg0) throws XletStateChangeException {

	}

	public void pauseXlet() {

	}

	public void startXlet() throws XletStateChangeException {
		// TODO
		try {
			ConteudoParser.parse(null);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
