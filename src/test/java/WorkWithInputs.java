import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import pages.BaseFunc;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SecondRegistrationPage;


public class WorkWithInputs {
    BaseFunc baseFunc = new BaseFunc();

    private final Logger LOGGER = LogManager.getLogger(WorkWithInputs.class);
    private final String IIN = "900822311875";
    private final String EMAIL = "Ыстамбақы.Нысынбай85@hotmail.com";
    private final String PHONE = "701123456";
    private final String PASSWORD = "Toropishka2019";
    private String URL = "https://staging.koke.kz";

    @Test
    public void useInputsWithoutAttributes() {
        LOGGER.info("Opening home page");
        baseFunc.openPage(URL);

        HomePage homePage= new HomePage(baseFunc);
        LOGGER.info("Clicking on Get loan btn");
        RegistrationPage registrationPage = homePage.clickOnLoan();

        LOGGER.info("Inserting IIN and e-mail");
        registrationPage.fillPersonalData(IIN, EMAIL);
        LOGGER.info("Inserting phone number");
        registrationPage.fillPhoneData(PHONE);
        LOGGER.info("Inserting password");
        registrationPage.fillPassword(PASSWORD);
        LOGGER.info("Clicking agreement checkbox");
        registrationPage.agreeRules();
        LOGGER.info("Clicking next step btn");
        SecondRegistrationPage secondRegistrationPage = registrationPage.pressNextStepBtn();
    }

}
