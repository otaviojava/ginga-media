package br.com.globalcode.ginga.engine;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

public interface Parser {

	 List parse(String queryString) throws IOException, JSONException;
}
