package LearnTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener{

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Going to Start");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test is Success");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test is Failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("TestCase is Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test is Almost Passed");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Before Start");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("After Done");
    }
}
