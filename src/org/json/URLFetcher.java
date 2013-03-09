package org.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.sun.dtv.lwuit.Image;

public class URLFetcher {
	public static String getURLContent(String url) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(
				getISFromURL(url)));

		StringBuffer sb = new StringBuffer();
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line).append("\n");
		}

		return sb.toString();

	}

	public static InputStream getISFromURL(String url) throws IOException {
		URL urlAddress = new URL(url);

		HttpURLConnection connection = (HttpURLConnection) urlAddress
				.openConnection();
		connection.setRequestMethod("GET");

		connection.connect();
		return connection.getInputStream();
	}

	public static Image getImageFromURL(String url) throws IOException {
		return Image.createImage(getISFromURL(url));
	}
}
