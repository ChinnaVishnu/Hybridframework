package com.jocata.hybrid.commons.datahandlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.testng.Assert;




public class ExcelManager
{	
	
	public ExcelManager(String fileName ,String sheetname){
		configFileName = fileName;
		this.sheetname= sheetname;
		loadExcel();
	}
	private String fileSeperator = System.getProperty("file.separator");
	private String configFileName;
	private String sheetname;
	File file  =null;
	FileInputStream fis = null;
	HSSFWorkbook workbook = null;
	HSSFSheet sheet = null;
	
	public void loadExcel(){
		try {
		fis = new FileInputStream(getConfigFilePath(configFileName));
		workbook = new HSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetname);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public  ArrayList<String> readExcelRow(int number){
		
	HSSFRow row = sheet.getRow(number);
	ArrayList<String> list = new ArrayList<String>();
	int cellNumber = row.getPhysicalNumberOfCells();
	System.out.println(cellNumber);
	for (int i = 0; i < cellNumber; i++) {
		HSSFCell cell = row.getCell(i);
		String value ="";
		if(cell.getCellType()==cell.CELL_TYPE_STRING){
			value = cell.getStringCellValue();
		}else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){
			value = (int)cell.getNumericCellValue()+ "";
			//value =	Integer.toString((int)cell.getNumericCellValue());
		}else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN){
			value = cell.getBooleanCellValue()+ "";
		}else {
			value="";
		}
		
		list.add(i,value);
		}
	
	return list;
	}
	
	/*
	public  CustomerDTO  readExcelRow_CustomerDTO(int number){
		
		HSSFRow row = sheet.getRow(number);
		CustomerDTO dto = new CustomerDTO();
		
		for (int i = 0; i < 16; i++) {
			
			HSSFCell cell = row.getCell(i);
			String value = "";
			if(cell!=null){
				if(cell.getCellType()==HSSFCell.CELL_TYPE_STRING){
					value = cell.getStringCellValue();
				}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
					value = (int)cell.getNumericCellValue()+ "";
					//value =	Integer.toString((int)cell.getNumericCellValue());
				}else if(cell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
					value = cell.getBooleanCellValue()+ "";
				}else if(cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
					value =  "";
				}else{
					value="";
				}
			}
			
			
			switch (i) {
			case 0:
				dto.setName(value);
				break;
			case 1:
				dto.setLeagalName(value);
				break;
			case 2:
				dto.setType(value);
				break;
			case 3:
				dto.setBoard_view(value);
				break;
			case 4:
				dto.setStatus(value);
				break;
			case 5:
				dto.setTax(value);
				break;
			case 6:
				dto.setTerms(value);
				break;
			case 7:
				dto.setSales_rep(value);
				break;
			case 8:
				dto.setPrimary_name(value);
				break;
			case 9:
				dto.setEmail(value);
				break;
			case 10:
				dto.setPrimary_email(value);
				break;
			case 11:
				dto.setPrimary_phone(value);
				break;
			case 12:
				dto.setExt(value);
				break;
			case 13:
				dto.setIndustry(value);
				break;
			case 14:
				dto.setLead_source(value);
				break;
			case 15:
				dto.setPricing(value);
				break;
			case 16:
				dto.setCredit_limit(value);
				break;
			default:
				
				break;
			}
			
		}
		
		return dto;
		}*/
	
	/*public  HashMap<Integer,CustomerDTO>   readAllRows(){
			HashMap<Integer,CustomerDTO> map  =  new HashMap<Integer,CustomerDTO>();
			int rows= sheet.getPhysicalNumberOfRows();
			for (int j = 1; j < rows; j++) {
			HSSFRow row = sheet.getRow(j);
			CustomerDTO dto = new CustomerDTO();
		
		for (int i = 0; i < 16; i++) {
			
			HSSFCell cell = row.getCell(i);
			String value = "";
			if(cell!=null){
				if(cell.getCellType()==HSSFCell.CELL_TYPE_STRING){
					value = cell.getStringCellValue();
				}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
					value = (int)cell.getNumericCellValue()+ "";
					//value =	Integer.toString((int)cell.getNumericCellValue());
				}else if(cell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
					value = cell.getBooleanCellValue()+ "";
				}else if(cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
					value =  "";
				}else{
					value="";
				}
			}
			
			
			switch (i) {
			case 0:
				dto.setName(value);
				break;
			case 1:
				dto.setLeagalName(value);
				break;
			case 2:
				dto.setType(value);
				break;
			case 3:
				dto.setBoard_view(value);
				break;
			case 4:
				dto.setStatus(value);
				break;
			case 5:
				dto.setTax(value);
				break;
			case 6:
				dto.setTerms(value);
				break;
			case 7:
				dto.setSales_rep(value);
				break;
			case 8:
				dto.setPrimary_name(value);
				break;
			case 9:
				dto.setEmail(value);
				break;
			case 10:
				dto.setPrimary_email(value);
				break;
			case 11:
				dto.setPrimary_phone(value);
				break;
			case 12:
				dto.setExt(value);
				break;
			case 13:
				dto.setIndustry(value);
				break;
			case 14:
				dto.setLead_source(value);
				break;
			case 15:
				dto.setPricing(value);
				break;
			case 16:
				dto.setCredit_limit(value);
				break;
			default:
				
				break;
			}
			
		}
		
		map.put(j, dto);
		}
			return map;
		}*/
	/**
	 * 
	 * This method is used to get the path of specified properties file name
	 *
	 * @param File , Need to pass the name of properties file
	 * @return , returns the file path of the specified properties file
	 */
	public String getConfigFilePath(String File)
	{
		String configFilePath;
		configFilePath = getConfigFolderPath()+fileSeperator+File+".xls";
		return configFilePath;	
	}
	
	/**
	 * 
	 * This method is used to get the location of 'ConfigFiles' folder
	 *
	 * @return, Returns the path of 'ConfigFiles' folder
	 */
	public String getConfigFolderPath()
	{
		return System.getProperty("user.dir")+fileSeperator+"src" +fileSeperator+"test" +fileSeperator+"resources" ;
	}

	
	public static void main(String[] args) {
		 ExcelManager shopVox_Excel = new ExcelManager("JBR_ShopVox","shopvox");
	/*	CustomerDTO dto = shopVox_Excel.readExcelRow_CustomerDTO(2);
		 
				System.out.println(dto.getName());
			System.out.println("Type is  = " + dto.getType());
			System.out.println(dto);
			System.out.println(shopVox_Excel.readExcelRow(1));
			*/
			
			/*HashMap<Integer,CustomerDTO> map =shopVox_Excel.readAllRows();
			
			Set<Integer> set = map.keySet();
			for (Integer key : set) {
				CustomerDTO dto1 = map.get(key);
				if(!dto1.getBoard_view().contains("false"))
					System.out.println(dto1);
			}*/
		 
		 shopVox_Excel.readallRows();
	}

	
	
	public  void readallRows(){
		
		int rows = sheet.getPhysicalNumberOfRows();
		for (int j = 1; j < rows; j++) {
		HSSFRow row = sheet.getRow(j);
		ArrayList<String> list = new ArrayList<String>();
		int cellNumber = row.getPhysicalNumberOfCells();
		boolean flag = row.getCell(3).getBooleanCellValue();
		if(flag){
	
		for (int i = 0; i < cellNumber; i++) {
			HSSFCell cell = row.getCell(i);
			
			String value ="";
			if(cell.getCellType()==cell.CELL_TYPE_STRING){
				value = cell.getStringCellValue();
			}else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){
				value = (int)cell.getNumericCellValue()+ "";
				//value =	Integer.toString((int)cell.getNumericCellValue());
			}else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN){
				value = cell.getBooleanCellValue()+ "";
			}else {
				value="";
			}
			
			System.out.print( value + "  ");
			}
		
		System.out.println();
		}
		}
	}
}

