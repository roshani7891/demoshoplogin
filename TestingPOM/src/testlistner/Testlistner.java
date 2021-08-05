package testlistner;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testlistner implements ITestListener
{
static Logger log =Logger.getLogger(Testlistner.class.getName());
	@Override
	public void onTestStart(ITestResult result) 
	{
		log.info("OnTest start method");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		log.info("ontestSuccess method");
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		log.info("onTestFailure method");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		log.info("onTestSkipped method");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		log.info("onTestFailedButWithinSuccessPercentage method");
	}

	@Override
	public void onStart(ITestContext context) {
		log.info("onstart method");
	}

	@Override
	public void onFinish(ITestContext context) {
		log.info("onfinish method");
	}

}
