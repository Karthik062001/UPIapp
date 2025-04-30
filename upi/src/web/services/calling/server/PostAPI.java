package web.services.calling.server;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.practice.jav.Json;
import json.practice.jav.JsonObject;

public class PostAPI {

	
	public static void main(String[] args) throws JsonProcessingException {

		String url="https://reqres.in/api/users";
		
		HttpClient client=HttpClient.newHttpClient();
		
		Input pa=new Input("morpheus","leader");
		
		Map<Object, Object> obj=new HashMap<Object,Object>();
		obj.put("name", pa.getName());
		obj.put("job", pa.getJob());
		

		
		HttpRequest request=HttpRequest.newBuilder()
				.POST(buildFormDataFromMap(obj))
				.uri(URI.create(url))
				 .header("Content-Type", "application/x-www-form-urlencoded")
	                .header("x-api-key", "reqres-free-v1") 
				.build();
		
		try {
			HttpResponse response=client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.body());
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	 private static HttpRequest.BodyPublisher buildFormDataFromMap(Map<Object, Object> data) {
	        var builder = new StringBuilder();
	        for (Map.Entry<Object, Object> entry : data.entrySet()) {
	            if (builder.length() > 0) {
	                builder.append("&");
	            }
	            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
	            builder.append("=");
	            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
	        }
	       
	        return HttpRequest.BodyPublishers.ofString(builder.toString());
	    }

}
