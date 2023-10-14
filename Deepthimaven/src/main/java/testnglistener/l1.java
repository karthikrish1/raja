package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener => builtin interface=> onstart, onfinish, ontestsucess, ontestfailure, ontestskipped
//class<=> interface :    implements interfacename 
//rightclick=> source=> override/implement methods 

public class l1 implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		System.out.println("sucess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
	}

	public void onStart(ITestContext context) {
		System.out.println("started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finished ");
	}
	


}
