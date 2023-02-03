package readingandwriting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class ReadingJson {
	
	public static void main(String[] args) throws IOException, ParseException
	{
		JSONParser parser=new JSONParser();
		FileReader reader=new FileReader("sample.json");
		Object parsedObject=parser.parse(reader);
		JSONObject jsonObject=(JSONObject)parsedObject;
		String Name=(String) jsonObject.get("Name");
		int age=(int) jsonObject.get("Age");
		JSONArray array=(JSONArray) jsonObject.get("special qualities");
		Iterator itr=array.iterator();
		while(itr.hasNext())
		{
			System.out.println("special qualities :" +itr.next());
		}
	}

}
