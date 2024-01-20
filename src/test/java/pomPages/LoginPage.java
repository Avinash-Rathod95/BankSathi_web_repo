package test.java.pomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage{
//declaration
    @FindBy(xpath = "//*[contains(text(), \"Login or Sign up\")]")
    private WebElement logBtn;
    @FindBy(id="username")
    private WebElement unTB;
    @FindBy(name="pwd")
    private WebElement pwTB;

//initialisation
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
//Utilisation
    public void clickOnLoginBtn(){
        logBtn.click();
    }
    public void setUsername(String un){
        unTB.sendKeys(un);
    }
    public void setPassword(String pw){
        pwTB.sendKeys(pw);
    }
}