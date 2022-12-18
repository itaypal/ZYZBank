import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class XYZ_Bank {

@Test
    public void BalanceTest(){
        String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/";
        //Selector
        String CustomerLogin = "body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button";
        String YourName = "#userSelect";
        String HarryPotter = "#userSelect";
        String Login = "body > div > div > div.ng-scope > div > form > button";
        String Deposit = "body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)";
        String Withdrawal = "body > div > div > div.ng-scope > div > div:nth-child(5) > button.btn.btn-lg.tab.btn-primary";
        String Balance = "body > div > div > div.ng-scope > div > div:nth-child(3)";
        String Amount_Deposited = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input";
        String Amount_Withdrawal = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input";
        String Deposit_instruction ="body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button";
        String withdrawal_instruction = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button";
        String Deposit_result = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > span";
        //input
        String Amount_depositInput = "1000";
        String Amount_withdrawalInput = "250";

        DOMselenium selenium = new DOMselenium();
        selenium.driver.get(url);
        selenium.getElement(CustomerLogin).click();
        selenium.getElement(YourName).click();
        selenium.getElement(YourName).sendKeys(Keys.ARROW_DOWN);
        selenium.getElement(YourName).sendKeys(Keys.ARROW_DOWN);
        selenium.getElement(Login).click();
        selenium.getElement(Deposit).click();
        selenium.getElement(Amount_Deposited).click();
        selenium.getElement(Amount_Deposited).sendKeys(Amount_depositInput);
        selenium.getElement(Deposit_instruction);
        String ActualValue = selenium.getElement(Deposit_result).getText();
        String expected = "Deposit Successful";
        Assert.assertEquals(expected,ActualValue);



    }
}





