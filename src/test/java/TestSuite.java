import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();


    @Test
    public void userShouldAbleTORegisterSuccessfully() {
        //click on registration button
        homePage.clickOnRegisterButton();
//verify user is on register page
        registerPage.verifyUserIsOnRegisterPage();
//enter registration details
        registerPage.enterRegistrationDetails();
        //verify user registered successfully;
        registerResultPage.verifyUserRegisterSuccessfully();
    }
    @Test
    public void userShouldAbleToLoginSuccessfully()
    {
        loginPage.clickOnLoginButton();
        loginPage.LoginDetails();}

    @Test
    public void verifyRegisteredUserShouldAbleToReferProductToFriendSuccessfully()
    {
    //click on registration button
    homePage.clickOnRegisterButton();
    //verify user is on register page
     registerPage.verifyUserIsOnRegisterPage();
    //enter registration details
    registerPage.enterRegistrationDetails();
    //verify user registered successfully;
    registerResultPage.verifyUserRegisterSuccessfully();
    loginPage.clickOnLoginButton();
    loginPage.LoginDetails();
    myAccountPage.clickOnElectronicsCategoryButton();
    registerResultPage.verifyUserSendMessageSuccessfully();
    }

}