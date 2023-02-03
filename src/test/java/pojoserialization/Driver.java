package pojoserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
	
	public static void main(String[] args) throws JsonProcessingException
	{
		Employee emp=new Employee();
		emp.setAge(23);
		emp.setEmpNAme("Tajun");
		emp.setEmpid(23456);
		emp.setEmail("tsghd@gmail.comn");
		
		
		ObjectMapper objectMapper=new ObjectMapper();
		String empJson=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		System.out.println(empJson);
		
	}

}
