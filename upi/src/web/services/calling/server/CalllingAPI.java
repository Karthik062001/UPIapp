package web.services.calling.server;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;

public class CalllingAPI {

	public static void main(String[] args) {

		String url="https://api.github.com/users/LearnCodeWithDurgesh";
		
		HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        var client=HttpClient.newBuilder().build();
        
        try {
        	HttpResponse<String>	responce=client.send(request, HttpResponse.BodyHandlers.ofString());
        	
        	System.out.println(responce.statusCode());
        	System.out.println(responce.body());
        	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      
	}

}
