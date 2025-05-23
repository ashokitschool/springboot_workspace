package in.ashokit.report;

import org.springframework.stereotype.Component;

@Component(value="pdf")
public class PdfReport implements IReport{
	
	@Override
	public void generateReport() {
		System.out.println("Pdf Report Generating...");
	}

}
