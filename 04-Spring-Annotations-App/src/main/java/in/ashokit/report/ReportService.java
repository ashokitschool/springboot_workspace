package in.ashokit.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	@Autowired
	@Qualifier("pdf")
	private IReport report;

	public void createReport() {
		report.generateReport();
	}

}
