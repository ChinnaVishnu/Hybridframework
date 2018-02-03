package com.jocata.hybrid.commons.datahandlers;

import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.jocata.hybrid.commons.dto.UserDTO;

public class DataProviderImpl {

	
	
	
	@DataProvider(name="user")
	public static Object[][] userData(){
		
		MoodleExcelManager manager = new MoodleExcelManager("moodle");
		Map<Integer , List<String>> map  = manager.getData();
		Object[][] obj = new Object[map.size()][6];
		
		for (int i = 0; i < map.size(); i++) {
			 List<String> row = map.get(i+1);
			 
			 for (int j = 0; j < row.size(); j++) {
				 obj[i][j] =  row.get(j);
			}
		}
	
		return obj;
		
	}
	
	
	
	@DataProvider(name="userDTO")
	public static Object[][] userDataDTO(){
		
		MoodleExcelManager manager = new MoodleExcelManager("moodle");
		Map<Integer , UserDTO> map  = manager.getDataDTOS();
		Object[][] obj = new Object[map.size()][1];
		
		for (int i = 0; i < map.size(); i++) {
			 UserDTO row = map.get(i+1);
			 obj[i][0] = row;
		}
	
		return obj;
		
	}
}
