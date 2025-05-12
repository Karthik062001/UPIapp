package web.services.calling.server;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostAPI {

	public static void main(String[] args) throws JsonProcessingException {

		String url = "https://reqres.in/api/users";

		HttpClient client = HttpClient.newHttpClient();
		ObjectMapper mapper = new ObjectMapper();

		JobRequest request1 = new JobRequest("morpheus", "leader");
		SchoolRequest request2 = new SchoolRequest("VTU", "B.E");

		ArrayList<Object> list1= new ArrayList<>();
		list1.add(request1);
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add(request2);

	
		RequestWrapper responseWrap1 = new RequestWrapper(list1);
		System.out.println(mapper.writeValueAsString(responseWrap1));
		
		RequestWrapper responseWrap2 = new RequestWrapper(list2);
		System.out.println(mapper.writeValueAsString(responseWrap2));

//		LinkedHashMap<String, Object> response = new LinkedHashMap();
//        response.put("request", Arrays.asList(request1, request2));
		List<Object> list3=Arrays.asList(request1, request2);
		RequestWrapper responseWrap3 = new RequestWrapper(list3);
	System.out.println(mapper.writeValueAsString(responseWrap3));
		String jsonvalue = mapper.writeValueAsString(responseWrap3);
	 
		HttpRequest request = HttpRequest.newBuilder().POST(BodyPublishers.ofString(jsonvalue.toString()))
				.uri(URI.create(url)).header("Content-Type", "application/json").header("x-api-key", "reqres-free-v1")
				.build();

		try {
			HttpResponse response1 = client.send(request, HttpResponse.BodyHandlers.ofString());
			 String jsonResponse = jsonvalue.replaceFirst("\"request\"", "\"response\"");
		        System.out.println(jsonResponse);
			

		} catch (IOException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
