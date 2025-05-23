package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.report.ReportService;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService reportService = ctxt.getBean(ReportService.class);
		reportService.createReport();
	}

}
