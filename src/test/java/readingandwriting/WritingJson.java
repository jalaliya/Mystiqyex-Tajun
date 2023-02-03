package readingandwriting;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WritingJson {
	
	public static void main(String[] args) throws IOException
	{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("Name","Jalaliya");
		jsonObject.put("Age", "25");
		JSONArray array=new JSONArray();
		array.add("angry");
		array.add("Reminding favours");
		array.add("magnetic eyes");
		jsonObject.put("special qualities", array);
		FileWriter writer=new FileWriter("sample.json");
		writer.write(jsonObject.toJSONString());
		writer.close();
	}
	

}
