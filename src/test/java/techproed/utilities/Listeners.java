package techproed.utilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listeners implements ITestListener {
    /*
    ITestListener is an interface
    We use this interface to customize testNG framework
    onStart,onFinish,onTestStart,onTestFinish,onTestSuccess,onTestFailure are special method names are used to LISTEN the test methods
    We especially use listeners for adding a special condition such as test pass, fail, or skipped
     */
    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart - Execute ONCE before ALL tests : "+context.getName());
    }
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish - Execute ONCE after ALL tests : "+context.getName());
    }
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart - Execute ONCE before EACH @Test : "+result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess - Execute AFTER EACH PASSED @Test : "+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure - Execute AFTER EACH FAILED @Test : "+result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped - Execute AFTER EACH SKIPPED @Test : "+result.getName());
    }
}