package web.services.calling.server;

	import java.io.IOException;
	import java.net.URI;
	import java.net.http.HttpClient;
	import java.net.http.HttpRequest;
	import java.net.http.HttpRequest.BodyPublishers;
	import java.net.http.HttpResponse;
	import java.util.ArrayList;
	import java.util.LinkedHashMap;

	import com.fasterxml.jackson.core.JsonProcessingException;
	import com.fasterxml.jackson.databind.ObjectMapper;

	public class Trial {

	    public static void main(String[] args) throws JsonProcessingException {

	        JobRequest jobRequest = new JobRequest("karthik", "Intern");
	        SchoolRequest schoolRequest = new SchoolRequest("VTU", "BE");

	        ObjectMapper mapper = new ObjectMapper();

	        String jobRequestJson = mapper.writeValueAsString(new RequestWrapper(jobRequest));
	        String schoolRequestJson = mapper.writeValueAsString(new RequestWrapper(schoolRequest));

	        System.out.println(jobRequestJson);
	        System.out.println(schoolRequestJson);

	        ArrayList<Object> requestList = new ArrayList<>();
	        requestList.add(jobRequest);
	        requestList.add(schoolRequest);

	 
	        LinkedHashMap<String, Object> request = new LinkedHashMap<>();
	        request.put("request", requestList);

	        String jsonRequest = mapper.writeValueAsString(request);
 
	      // System.out.println(jsonRequest);
	   
	        String url = "https://reqres.in/api/users";
	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest req = HttpRequest.newBuilder().POST(BodyPublishers.ofString(jsonRequest))
	                .uri(URI.create(url)).header("Content-Type", "application/json").header("x-api-key", "reqres-free-v1")
	                .build();

	        try {
	          
	            HttpResponse<String> apiResponse = client.send(req, HttpResponse.BodyHandlers.ofString());
	            String jsonResponse = jsonRequest.replaceFirst("\"request\"", "\"response\"");
	            System.out.println( jsonResponse);
	          
	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

	


