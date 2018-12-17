package tk.ungarscool1.cachetConnector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class General {
	
	
	public static boolean ping(String url) {
		url = url + "/api/v1/ping";
		try {
			URL uri = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
			connection.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer stringBuffer = new StringBuffer();
			String res ;
			while ((res = in.readLine()) != null) {
				stringBuffer.append(res);
			}
			boolean pinged = (stringBuffer.toString().equals("{\"data\":\"Pong!\"}"));
			in.close();
			if (pinged) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean ping() {
		return ping("http://localhost");
	}
	
	public static String version(String url) {
		url = url + "/api/v1/version";
		try {
			URL uri = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
			connection.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer stringBuffer = new StringBuffer();
			String res ;
			while ((res = in.readLine()) != null) {
				stringBuffer.append(res);
			}
			in.close();
			JsonElement jsonElement = new JsonParser().parse(stringBuffer.toString());
			JsonObject jsonObject = jsonElement.getAsJsonObject();
			return jsonObject.get("data").getAsString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public static String version() {
		return version("http://localhost");
	}
	
}
