package schemaValidation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

public class HamcrestValidation {
	
	
	@Test
	public void hamcrestValidation()
	{
		File inputJson=new File("src/test/resorces/input.json");
		String jsonContent=FileUtils.readFileToByteArray(inputJson)
		MatcherAssert.assertThat(inputJson, JsonSchemaValidator.matchesJsonSvhems(jsonSchema));
	}

}
