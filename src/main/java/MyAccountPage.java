import org.openqa.selenium.By;

public class MyAccountPage extends Utils

{
    public  void clickOnElectronicsCategoryButton()
    {
        clickOnElement(By.xpath("//div[@class = 'header-menu']/ul[contains(@class,'notmobile')]/li/a[@href='/electronics']"));
        //click on electronics categories

        clickOnElement(By.xpath("//img[@alt='Picture for category Camera & photo']"));
        //click on camera and photo categories
        clickOnElement(By.xpath("//img[@alt='Picture of Leica T Mirrorless Digital Camera']"));
        //click on item image to go in to details of that product
        clickOnElement(By.xpath("//button[@class='button-2 email-a-friend-button']"));
        //click on email to friend button to share with friend
        typeText(By.id("FriendEmail"), "abc0001@yahoo.com");
        //enter friend email address
        System.out.println(email);
      typeText(By.id("YourEmailAddress"), email);
        //enter my email address
        typeText(By.id("PersonalMessage"), "hi siri look what i found on demo.ecommerce website grabe this AmazingDeal");
        //type message  want to share
        clickOnElement(By.xpath("//button[@class='button-1 send-email-a-friend-button']"));
        //click on email button to share
//       Assert.assertEquals(getTextFromElement(By.xpath("//div[@class=\"result\"]")), "Your message has been sent.", "Your message has been sent.");
//        //verify the message sent


    }





}
