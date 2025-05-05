package web.services.calling.server;

import java.util.ArrayList;

import org.json.JSONObject;

public class Jsonobj {

	public static void main(String[] args) {
		
		JSONObject obj1=new JSONObject();
		obj1.put("name", "karan");
		obj1.put("job", "teacher");
		
		JSONObject obj2=new JSONObject();
		obj2.put("name", "charan");
		obj2.put("job", "developer");
		
		ArrayList<JSONObject> arr=new ArrayList<JSONObject>();
		arr.add(obj2);
		arr.add(obj1);
		
		

	}

}
