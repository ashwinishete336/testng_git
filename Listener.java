package testng1;



import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;


public class Listener implements  ITestListener {

@Override
public void onFinish(ITestContext arg0) {
// TODO Auto-generated method stub

}

@Override
public void onStart(ITestContext arg0) {
// TODO Auto-generated method stub

}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
// TODO Auto-generated method stub

}

@Override
public void onTestFailure(ITestResult arg0) {
// TODO Auto-generated method stub
System.out.println("fail");

}

@Override
public void onTestSkipped(ITestResult arg0) {
// TODO Auto-generated method stub

}

@Override
public void onTestStart(ITestResult arg0) {
// TODO Auto-generated method stub

}

@Override
public void onTestSuccess(ITestResult arg0) {
// TODO Auto-generated method stub
System.out.println("success");

}



}



