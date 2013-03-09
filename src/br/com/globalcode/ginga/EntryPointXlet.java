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
		StringBuffer json=new StringBuffer();
		json.append("'itens': { ");
		json.append(" { ");
		json.append("	imagem: 'http://www.flickr.com/photos/maikondrums/5981195125/', ");
		json.append("	descricao: 'Criação da Logo LEVEL UP', ");
		json.append("	nome: 'pera' ");		
		json.append(" }, ");
		json.append(" { ");
		json.append("	imagem: 'http://www.flickr.com/photos/maikondrums/5981195125/', ");
		json.append("	descricao: 'Criação da Logo LEVEL UP', ");
		json.append("  nome: 'pera' ");		
		json.append(" } ");
		json.append(" }; ");
		
		
		formulario.show();
	}

}
