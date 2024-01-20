package test.java.scripts;

//import scripts.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
//import pomPages.LoginPage;
import test.java.generic.BaseTest;
import test.java.pomPages.LoginPage;

public class TestLogin extends BaseTest{
    WebDriver driver;
//BaseTest bs = new BaseTest();
@Test
public void testLogin(){
        LoginPage l=new LoginPage(driver);
        l.clickOnLoginBtn();
//        String un=Lib.getCellValue(EXCEL_PATH,"ValidLogin",1,0);
//        String pw=Lib.getCellValue(EXCEL_PATH,"ValidLogin",1,1);
//        l.setUsername(un);
//        l.setPassword(pw);
        l.clickOnLoginBtn();
    }
}