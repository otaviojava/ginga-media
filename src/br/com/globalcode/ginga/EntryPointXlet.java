package br.com.globalcode.ginga;

import javax.microedition.xlet.Xlet;
import javax.microedition.xlet.XletContext;
import javax.microedition.xlet.XletStateChangeException;

import com.sun.dtv.lwuit.Form;

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
		Form formulario = new Form("Ginga-media");
		
		
		
		formulario.show();
	}

}
