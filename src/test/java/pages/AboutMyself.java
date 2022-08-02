package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutMyself {
    protected static WebDriver webDriver;

    @FindBy(xpath = "//input[@name='fname']")
    private WebElement name;
    @FindBy(xpath = "//input[@name='lname']")
    private WebElement surname ;


    public AboutMyself(WebDriver webDriver) {
        AboutMyself.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public String getName(){
        return name.getAttribute("value");
    }

    public String getSurname(){
        return surname.getAttribute("value");
    }

}