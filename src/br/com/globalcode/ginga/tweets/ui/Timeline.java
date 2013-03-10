package br.com.globalcode.ginga.tweets.ui;

import java.awt.Color;
import java.io.IOException;

import br.com.globalcode.ginga.tweets.model.Tweet;

import com.sun.dtv.lwuit.Container;
import com.sun.dtv.lwuit.Font;
import com.sun.dtv.lwuit.Image;
import com.sun.dtv.lwuit.Label;
import com.sun.dtv.lwuit.geom.Dimension;
import com.sun.dtv.lwuit.layouts.BoxLayout;
import com.sun.dtv.lwuit.layouts.FlowLayout;
import com.sun.dtv.lwuit.plaf.Border;
import com.sun.dtv.lwuit.plaf.Style;

/**
 * Componente de timeline do ginga-tweets.
 * 
 * @author Newton Rhomel Beck Angelini [newton.beck@gmail.com]
 * @author Cesar Augusto Nogueira [cesarnogueira1210@gmail.com]
 * 
 */
public class Timeline extends Container {

	public Timeline() {
		super(new BoxLayout(BoxLayout.Y_AXIS));
		this.getStyle().setBgColor(new Color(192, 222, 237));
		this.getStyle().setBgTransparency(200);
		
		Label busca = new Label("Tweets com a hashcode #gingajava");
		Style buscaStyle = busca.getStyle();
		buscaStyle.setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL));
		buscaStyle.setFgColor(Color.WHITE);
		buscaStyle.setBgTransparency(0);
		
		this.addComponent(busca);
	}

	public void addTweet(Tweet tweet) {
		Label lblImagem = new Label();
		Image imagem = tweet.getImagem();
		
		if(imagem!=null) {
			lblImagem.setIcon(imagem);
		} else {
			try {
				Image semImagem = Image.createImage("image/noimage.png");
				lblImagem.setIcon(semImagem);
			} catch (IOException e) {
				lblImagem.setText("Sem imagem");
			}
		}
		
		Style messageStyle = lblImagem.getStyle();
		messageStyle.setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_MEDIUM));
		messageStyle.setFgColor(Color.WHITE);
		messageStyle.setBgTransparency(0);
		
		Style imageStyle = lblImagem.getStyle();
		imageStyle.setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL));
		imageStyle.setFgColor(Color.WHITE);
		imageStyle.setBgTransparency(0);
		
		Style usuarioStyle = lblImagem.getStyle();
		usuarioStyle.setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL));
		usuarioStyle.setFgColor(Color.WHITE);
		usuarioStyle.setBgTransparency(0);
		
		Label lblUsuario = new Label(tweet.getUsuario());
		lblUsuario.setPreferredSize(new Dimension(152, 40));
		
		Label lblTweet = new Label(tweet.getConteudo());
		lblTweet.getStyle().setBorder(Border.createLineBorder(3));
		lblTweet.getBaseline(100, 10);
		lblTweet.setPreferredSize(new Dimension(400, 60));
		
		lblImagem.setPreferredSize(new Dimension(48,48));
				
		lblImagem.setStyle(imageStyle);
		lblUsuario.setStyle(usuarioStyle);
		lblTweet.setStyle(messageStyle);
		
		Container container = new Container();
		container.setLayout(new FlowLayout());
		
		container.addComponent(lblImagem);
		container.addComponent(lblUsuario);
		this.addComponent(container);
		this.addComponent(lblTweet);
		
		
	}	

}
