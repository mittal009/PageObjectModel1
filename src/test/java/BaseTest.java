import org.testng.annotations.BeforeMethod;

public class BaseTest extends BrowserManager
{

    @BeforeMethod
    public void setup()
    {openBrowser();}

//   @AfterMethod
//     public void tearDown()
//   {closeBrowser();}
}
