package web.services.calling.server;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DeleteAPI {

	public static void main(String[] args) {
		
		String url="https://reqres.in/api/users/2";
		
		HttpClient client=HttpClient.newHttpClient();
		
		HttpRequest request=HttpRequest.newBuilder().DELETE().uri(URI.create(url)).header("Content-Type", "application/json").header("x-api-key", "reqres-free-v1").build();
		
		try {
			HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
			System.out.println(response.statusCode());
		} catch (IOException | InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
