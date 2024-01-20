    package test.java.generic;
    import org.testng.ITestContext;
    import org.testng.ITestListener;
    import org.testng.ITestResult;
    public class TestngListeners implements ITestListener{
        BaseTest b=new BaseTest();
    @Override
    public void onTestStart(ITestResult result){
    //TODOAuto-generatedmethodstub
        }
    @Override
    public void onTestSuccess(ITestResult result){
    //TODOAuto-generatedmethodstub
        }
    @Override
    public void onTestFailure(ITestResult result){
        String testmethodName=result.getName();
        b.takeScreenshot("TestValidLogin");
        }
    @Override
    public void onTestSkipped(ITestResult result){
    //TODOAuto-generatedmethodstub
        }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
    //TODOAuto-generatedmethodstub
        }
    @Override
    public void onStart(ITestContext context){
    //TODOAuto-generatedmethodstub
        }
    @Override
    public void onFinish(ITestContext context){
    //TODOAuto-generatedmethodstub
        }
    }
