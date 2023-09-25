package ngothanhcong.movie.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.mysql.cj.xdevapi.JsonArray;

import ngothanhcong.movie.entity.ServiceModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class DemoMain {

	public static void main(String[] args)  throws IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
//		File serviceModel  = new  File(".\\Json\\Movie.json");
		File serviceModel  = new  File(".\\src\\main\\webapp\\resources\\json\\movie.json");
		
		
		ServiceModel[] serviceModels =  objectMapper.readValue(serviceModel,ServiceModel[].class);
		
		
		
		System.out.println(Arrays.asList(serviceModels));
		
		
		
		
		
	}

}
