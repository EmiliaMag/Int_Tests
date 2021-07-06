import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPagePObj extends PageObject {
    @FindBy(xpath = "//div[@class='item__description']//div[@class='item__ISBN']")
    private WebElement itemISBN;

    @FindBy(xpath = "//div[@class='c-cart-voucher js-voucher-respond']//em")
    private WebElement promotionCodeDescription;

    @FindBy(xpath = "//div[@class='col-xs-12 notice']//em")
    private WebElement itemsSubtotalDescription;

    @FindBy(xpath = "//div[@class='col-xs-4 col-md-6 cart-totals-right text-right']")
    private WebElement itemsSubtotalPrice;

    @FindBy(xpath = "//div[@class='col-xs-5 col-md-6 cart-totals-right text-right grand-total js-total-price']")
    private WebElement estimateOrderTotalPrice;

    @FindBy(xpath = "//div[@class='c-alert__content']//p[@class='c-alert__text']")
    private WebElement quantityUpdatedMessage;

    @FindBy(xpath = "//input[@id='quantity_0']")
    private WebElement qtyField;

    @FindBy(xpath = "//div[@class='program_name']//a[@href='/store/usassessments/en/Store/Professional-Assessments/Motor-Sensory/Adolescent-Adult-Sensory-Profile/p/100000434.html']")
    private WebElement productNameCart;

    public CartPagePObj(WebDriver driver) {
        super(driver);
    }

    public void clickOnEstimateOrder() {
        estimateOrderTotalPrice.click();
    }

    public void clickOnQtyField() {
        qtyField.click();
    }

    public void deleteTheQtyFieldValue() {
        qtyField.sendKeys(Keys.BACK_SPACE);
    }

    public void typeQtyField() {
        qtyField.sendKeys("3");
    }

    public void enterValueTypedQty() {
        qtyField.sendKeys(Keys.ENTER);
    }

    public String getQuantityUpdatedMessage() {
        return quantityUpdatedMessage.getText();
    }

    public String getProductNameFromCart() {
        return productNameCart.getText();
    }
}
