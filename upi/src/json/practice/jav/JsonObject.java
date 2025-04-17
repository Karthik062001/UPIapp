package json.practice.jav;

import org.json.JSONObject;

public class JsonObject {

	public static JSONObject JsonObject()
	{
		JSONObject obj1=new JSONObject();
		obj1.put("name", "Vijay");
		obj1.put("age", 23);
		
		return obj1;
		
	}
}
