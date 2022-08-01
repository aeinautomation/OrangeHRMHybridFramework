//package ExtendReport;
//
//import java.io.File;
//import java.util.List;
//
//import org.testng.ISuite;
//import org.testng.ISuiteResult;
//import org.testng.ITestContext;
//import org.testng.xml.XmlSuite;
//
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.IReporter;
//import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.model.Test;
//
//public class ExtendReportListeners implements IReporter
//{
//	private ExtendReports extent;
//	
//	public void generateReport(List<XmlSuite> xmlsuites, List<ISuite> suites, String outputDirectory)
//{
//	extent = new ExtentReports(outputDirectory + File.separator + "Extent.html" ,true);
//	for (ISuiteResult r : result.values())
//	{
//		ITestContext context = r.getTestContext();
//		buildTestNodes(context.getPassedTests(), LogStatus.PASS);
//		buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
//		buildTestNodes(context.getSkippedTests(),LogStatus.SKIP);
//		
//	}
//}
//extent.flush();
//extent.close();
//}
//
// 