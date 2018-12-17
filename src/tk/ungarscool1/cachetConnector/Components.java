package tk.ungarscool1.cachetConnector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Timestamp;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import tk.ungarscool1.cachetConnector.entities.Component;
import tk.ungarscool1.cachetConnector.enums.ComponentStatus;

public class Components {
	private static String url;
	
	@SuppressWarnings("static-access")
	public Components(String url) {
		this.url = url + "/api/v1/components";
	}
	
	public static Component[] getComponents() {
		StringBuffer stringBuffer = new StringBuffer();
		
		try {
			URL uri = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
			connection.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String res ;
			while ((res = in.readLine()) != null) {
				stringBuffer.append(res);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		JsonElement jsonElement = new JsonParser().parse(stringBuffer.toString());
		JsonObject josnntm = jsonElement.getAsJsonObject();
		JsonArray jsonArray = josnntm.get("data").getAsJsonArray();
		Component[] response = new Component[jsonArray.size()];
		for(int i = 0; i < jsonArray.size(); i++) {
			JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();
			response[i] = new Component(jsonObject.get("id").getAsInt(), jsonObject.get("name").getAsString(), jsonObject.get("description").getAsString(), jsonObject.get("link").getAsString(), ComponentStatus.valueOf(jsonObject.get("status_name").getAsString().toUpperCase()), jsonObject.get("order").getAsInt(), jsonObject.get("group_id").getAsInt(), Timestamp.valueOf(jsonObject.get("created_at").getAsString()), Timestamp.valueOf(jsonObject.get("updated_at").getAsString()), Timestamp.valueOf(jsonObject.get("deleted_at").getAsString()), null);
		}
		return response;
	}
	
	public static Component getComponent(int id) {
		try {
			URL uri = new URL(url+"/"+id);
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
			JsonObject josntmp = jsonElement.getAsJsonObject();
			JsonObject jsonObject = josntmp.get("data").getAsJsonObject();
			return new Component(id, jsonObject.get("name").getAsString(), jsonObject.get("description").getAsString(), jsonObject.get("link").getAsString(), ComponentStatus.valueOf(jsonObject.get("status_name").getAsString().toUpperCase()), jsonObject.get("order").getAsInt(), jsonObject.get("group_id").getAsInt(), Timestamp.valueOf(jsonObject.get("created_at").getAsString()), Timestamp.valueOf(jsonObject.get("updated_at").getAsString()), Timestamp.valueOf(jsonObject.get("deleted_at").getAsString()), null);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void updateComponent(Component component) {
		
	}
	
	public static void createComponent(Component component) {
		
	}
	
}
