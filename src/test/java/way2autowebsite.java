import common.DriverHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.tablepage;

public class way2autowebsite extends DriverHandler {

    String name = getProp().getProperty("name");
    String surname = getProp().getProperty("surname");
    String username = getProp().getProperty("username");
    String password = getProp().getProperty("password");
    String email = getProp().getProperty("email");
    String cellphone = getProp().getProperty("cellphone");

    String name2 = getProp().getProperty("name2");
    String surname2 = getProp().getProperty("surname2");
    String username2 = getProp().getProperty("username2");
    String password2 = getProp().getProperty("password2");
    String email2 = getProp().getProperty("email2");
    String cellphone2 = getProp().getProperty("cellphone2");

    tablepage tableWebsite;

    @BeforeMethod
    public void setup()
    {
        startBrowser();
        tableWebsite = new tablepage();
    }

    @Test (priority = 1)
    public void assertPage()
    {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Protractor practice website - WebTables");
        tableWebsite.closeBrowser();

    }

    @Test (priority = 2)
    public void addUser1()
    {
        tableWebsite.clickAddUserIcon();
        tableWebsite.enterFirstname(name);
        tableWebsite.enterLastname(surname);
        tableWebsite.enterUsername(username);
        tableWebsite.SelectRadioButton1();
        tableWebsite.selectadminrole();
        tableWebsite.enterPassword(password);
        tableWebsite.enterEmail(email);
        tableWebsite.enterCellphone(cellphone);
        tableWebsite.ClickSaveButton();
        tableWebsite.closeBrowser();
    }

    @Test (priority = 3)
    public void addUser2()
    {
        tableWebsite.clickAddUserIcon();
        tableWebsite.enterFirstname(name2);
        tableWebsite.enterLastname(surname2);
        tableWebsite.enterUsername(username2);
        tableWebsite.SelectRadioButton2();
        tableWebsite.selectcustomerrole();
        tableWebsite.enterPassword(password2);
        tableWebsite.enterEmail(email2);
        tableWebsite.enterCellphone(cellphone2);
        tableWebsite.ClickSaveButton();
        tableWebsite.closeBrowser();
    }

}
