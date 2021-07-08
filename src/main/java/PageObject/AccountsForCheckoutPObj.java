package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsForCheckoutPObj extends PageObject {

    @FindBy(xpath = "//div[@id='contextSelector']//span[@class='c-radiobtn__check']")
    private WebElement myAccountRadioBox;

    @FindBy(xpath = "//div[@id='digitalAccountFormSubmitID']//button[@id='digitalAccountFormSubmit']")
    private WebElement continueButton;


    public AccountsForCheckoutPObj(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccountRadioBox() {
        myAccountRadioBox.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }


}
