import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils
{

    public void verifyUserRegisterSuccessfully()
    {
        String actualRegistrationMessage= getTextFromElement(By.className("result"));
        Assert.assertEquals(actualRegistrationMessage, expectedRegisterSuccessMessage, "not correct message");

    }
    public void verifyUserSendMessageSuccessfully()
    {
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), "Your message has been sent.", "Your message has been sent.");
//        //verify the message sent
    }
}
