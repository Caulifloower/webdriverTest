package tests;

import java.lang.reflect.Method;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.ExtentReports.ExtentTestManager;
import utils.Listeners.TestListener;

@Listeners({TestListener.class})
@Epic("epic description")
@Feature("feature description")
public class LoginTest extends BaseTest {

    @Test(description = "Open google test")
    @Severity(SeverityLevel.BLOCKER)
    @Story("base test story")
    public void invalidLoginTest_InvalidUserNameInvalidPassword(Method method) {
        ExtentTestManager.startTest(method.getName(), "Open google test");

        homePage.openGoogle();
    }
}