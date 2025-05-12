package web.services.calling.server;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PutAPI {

	public static void main(String []args)
	{
	HttpClient client =HttpClient.newHttpClient();
	
	String url="https://reqres.in/api/users/2";
	
	JobRequest np=new JobRequest("morpheus","zion resident");
	
	ObjectMapper map= new ObjectMapper();
	try {
	String data=map.writeValueAsString(np);
	
    HttpRequest request=HttpRequest.newBuilder().PUT(BodyPublishers.ofString(data)).header("Content-Type", "application/json").header("x-api-key", "reqres-free-v1").uri(URI.create(url)).build();	
		HttpResponse<String>  response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		System.out.println(response.statusCode());
		
	} catch (IOException | InterruptedException e) {
		
		e.printStackTrace();
	}
	}
}
