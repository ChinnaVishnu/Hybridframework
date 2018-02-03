package com.jocata.hybrid.commons.datahandlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.testng.Assert;

import com.jocata.hybrid.commons.dto.UserDTO;

public class MoodleExcelManager {

	File file  =null;
	FileInputStream fis = null;
	HSSFWorkbook workbook = null;
	HSSFSheet sheet = null;
	public MoodleExcelManager(String sheetName){
		init(sheetName);
	}
	
	public void init(String sheetName){
		try {
			file = new File("./src/test/resources/User_data.xls");
			fis = new FileInputStream(file);
			workbook = new HSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Map<Integer , List<String>> getData(){
		
		int totalRows = sheet.getPhysicalNumberOfRows();
		Map<Integer , List<String>> map = new HashMap<Integer , List<String>>();
		for (int i = 1; i < totalRows; i++) {
			HSSFRow row =  sheet.getRow(i);
			
			int totalCells =  row.getPhysicalNumberOfCells();
			List<String> rowData  = new ArrayList<String>();
			//Iteration for cells  -----  total number of cells  - 6
			for(int j = 0 ; j<totalCells ;j++){
				HSSFCell cell = row.getCell(j);
				String cellValue = "";
				if(cell!=null){
					if(cell.getCellType() == Cell.CELL_TYPE_STRING){
						cellValue = cell.getStringCellValue();
					}if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){
						int d = (int)cell.getNumericCellValue();
						cellValue = String.valueOf(d);
					}
				}
				rowData.add(cellValue);
			}
			
			map.put(i, rowData);
		}
		return map;
	}
	
	
	

	public Map<Integer , UserDTO> getDataDTOS(){
		
		int totalRows = sheet.getPhysicalNumberOfRows();
		Map<Integer , UserDTO> map = new HashMap<Integer , UserDTO>();
		for (int i = 1; i < totalRows; i++) {
			HSSFRow 	row   = 	sheet.getRow(i);
			UserDTO user = new UserDTO();
			for (int j = 0; j < 6; j++) {
				HSSFCell cell =  row.getCell(j);
					String cellValue = "";
					if(cell!=null){
						if(cell.getCellType() == Cell.CELL_TYPE_STRING){
							cellValue = cell.getStringCellValue();
						}if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){
							int d = (int)cell.getNumericCellValue();
							cellValue = String.valueOf(d);
						}
					}
					switch (j) {
					case 0:
						user.setUsername(cellValue);
						break;
					case 1:
						user.setAuthMode(cellValue);
						break;
						
					case 2:
						user.setPassword(cellValue);
						break;
						
					case 3:
						user.setFirstname(cellValue);
						break;
						
					case 4:
						user.setSurname(cellValue);
						break;
						
					case 5:
						user.setEmail(cellValue);
						break;
					default:
						Assert.fail("Extra values");
						break;
					}
			}
			map.put(i, user);
		}
		return map;
	}
	
public static void main(String[] args) {
	
	
	MoodleExcelManager manager  = new MoodleExcelManager("moodle");
	 Map<Integer , List<String>> map = manager.getData();
	
	 
	 Set<Integer> keys = map.keySet();
	 
	 for (Integer key : keys) {
		 
		// System.out.println( "Key is  " + key);
		 List<String> li =  map.get(key);
		// System.out.println("data for row is :: ");
		 for (String string : li) {
			System.out.print(" " + string);
		}
		 System.out.println();
	}
	 
	 
}
}
