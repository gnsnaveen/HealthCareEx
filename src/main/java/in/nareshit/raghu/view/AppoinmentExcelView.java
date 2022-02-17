package in.nareshit.raghu.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import in.nareshit.raghu.entity.Appoinment;

public class AppoinmentExcelView extends AbstractXlsxView{
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unchecked")
		List<Appoinment> list = (List<Appoinment>) model.get("list");
		//2. Create Sheet
		Sheet sheet = workbook.createSheet("SPECIALIZATIONS");
		
		//3. create Rows and Cells
		setHeader(sheet);
		setBody(sheet,list);
		
		
	}
	private void setBody(Sheet sheet, List<Appoinment> list) {
		// TODO Auto-generated method stub
		int rowNum=1;
		
		for(Appoinment spec:list) {
			Row row =  sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(spec.getId());
			row.createCell(1).setCellValue(spec.getAppDate());
			row.createCell(2).setCellValue(spec.getDetails());
			row.createCell(3).setCellValue(spec.getNoOfSlots());
			}
	}

	private void setHeader(Sheet sheet) {
		// TODO Auto-generated method stub
		int rowNum=0;
		
		Row row=sheet.createRow(rowNum);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("CODE");
		row.createCell(2).setCellValue("NAME");
		row.createCell(3).setCellValue("NOTE");
	}
}
