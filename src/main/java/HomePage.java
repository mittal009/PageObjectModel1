import org.openqa.selenium.By;

public class HomePage extends Utils
{

  public void clickOnRegisterButton()
  {
      clickOnElement(By.linkText("Register"));
  }

}
