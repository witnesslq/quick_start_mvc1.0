package com.tcj.common.poi.util;

import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelUtil {

	public static void fillExcelData(ResultSet rs,Workbook wb,String[] headers)throws Exception{
		int rowIndex=0;
		Sheet sheet=wb.createSheet();
		Row row=sheet.createRow(rowIndex++);
		for(int i=0;i<headers.length;i++){
			row.createCell(i).setCellValue(headers[i]);
		}
		while(rs.next()){
			row=sheet.createRow(rowIndex++);
			for(int i=0;i<headers.length;i++){
				row.createCell(i).setCellValue(rs.getObject(i+1).toString());
			}
		}
	}
	
	public static Workbook fillExcelDataWithTemplate(ResultSet rs,String templateFileName)throws Exception{
		InputStream inp=ExcelUtil.class.getResourceAsStream("/com/java1234/template/"+templateFileName);
		POIFSFileSystem fs=new POIFSFileSystem(inp);
		Workbook wb=new HSSFWorkbook(fs);
		Sheet sheet=wb.getSheetAt(0);
		// ��ȡ����
		int cellNums=sheet.getRow(0).getLastCellNum();
		int rowIndex=1;
		while(rs.next()){
			Row row=sheet.createRow(rowIndex++);
			for(int i=0;i<cellNums;i++){
				row.createCell(i).setCellValue(rs.getObject(i+1).toString());
			}
		}
		return wb;
	}
	
	public static String formatCell(HSSFCell hssfCell){
		if(hssfCell==null){
			return "";
		}else{
			if(hssfCell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
				return String.valueOf(hssfCell.getBooleanCellValue());
			}else if(hssfCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
				return String.valueOf(hssfCell.getNumericCellValue());
			}else{
				return String.valueOf(hssfCell.getStringCellValue());
			}
		}
	}
	public static int formatCell1(HSSFCell hssfCell2){
		if(hssfCell2==null){
			return 0;
		}else{
			if(hssfCell2.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
				return Integer.valueOf((int) hssfCell2.getNumericCellValue());
			}else if(hssfCell2.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
				return Integer.valueOf((int)hssfCell2.getNumericCellValue());
			}else{
				return Integer.valueOf(hssfCell2.getStringCellValue());
			}
		}
	}
	public static Date formatCell2(HSSFCell hssfCell3){
		if(hssfCell3==null){
			return null;
		}else{
			if(hssfCell3.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
				return Date(hssfCell3.getDateCellValue());
			}else if(hssfCell3.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
				return Date(hssfCell3.getDateCellValue());
			}else{
				return Date(hssfCell3.getDateCellValue());
			}
		}
	}

	private static Date Date(Date dateCellValue) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
