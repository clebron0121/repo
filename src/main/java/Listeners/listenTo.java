package Listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.browsers;

public class listenTo extends browsers implements ITestListener{

	
	
	public void onTestSuccess(ITestResult result) {
		try {
			screenshots("/Users/chrislebron/eclipse-workspace/testing1/Pics/Passed/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestFailure(ITestResult result) {
		try {
			screenshots("/Users/chrislebron/eclipse-workspace/testing1/Pics/Failed/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
