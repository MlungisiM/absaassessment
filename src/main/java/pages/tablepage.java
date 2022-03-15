package pages;

import common.DriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class tablepage extends DriverHandler {



//    @FindBy(xpath = "/html/body/table/thead/tr[2]/td/button")
//    WebElement adduser;

    @FindBy(xpath = "/html/body/table/thead/tr[2]/td/button")
    WebElement adduser;

    @FindBy(name = "FirstName")
    WebElement firstname;

    @FindBy(name = "LastName")
    WebElement lastname;

    @FindBy(name = "UserName")
    WebElement username;

    @FindBy(name = "Password")
    WebElement password;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]")
    WebElement customer;

    @FindBy(name = "RoleId")
    WebElement role;

    @FindBy(name = "Email")
    WebElement email;

    @FindBy(name = "Mobilephone")
    WebElement phone;

    @FindBy(xpath = "/html/body/div[3]/div[3]/button[2]")
    WebElement save;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")
    WebElement radiobutton1;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]/input")
    WebElement radiobutton2;



    WebDriverWait wait;

    //Initialize Page Objects
    public tablepage() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

        public void clickAddUserIcon() {
            wait.until(ExpectedConditions.elementToBeClickable(adduser)).click();
    }

    public void enterFirstname(String name) {
        wait.until(ExpectedConditions.visibilityOf(firstname)).sendKeys(name);
    }
    public void enterLastname(String Lastname) {
        wait.until(ExpectedConditions.visibilityOf(lastname)).sendKeys(Lastname);
    }
    public void enterUsername(String Username) {
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(Username);
    }
    public void enterPassword(String Password) {
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(Password);
    }
    public void SelectRadioButton1() {
        wait.until(ExpectedConditions.visibilityOf(radiobutton1)).click();
    }
    public void SelectRadioButton2() {
        wait.until(ExpectedConditions.visibilityOf(radiobutton2)).click();
    }
    public void enterEmail(String Email) {
        wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(Email);
    }
    public void enterCellphone(String Cellphone) {
        wait.until(ExpectedConditions.visibilityOf(phone)).sendKeys(Cellphone);
    }
    public void selectadminrole() {
        Select dropdown = new Select(role);
        dropdown.selectByVisibleText("Admin");
    }

    public void selectcustomerrole() {
        Select dropdown = new Select(role);
        dropdown.selectByVisibleText("Customer");
    }

    public void ClickSaveButton()
    {
        save.click();
    }


}
