package in.ashokit.report;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "excel")
@Primary
public class ExcelReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("ExcelReport Generating...");
	}

}
