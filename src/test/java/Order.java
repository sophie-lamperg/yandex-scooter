import PageObject.OrderPage;
import org.junit.Test;

public class Order extends Main {

    @Test
    public void successOrderHeaderButton()  {
        OrderPage order = new OrderPage(driver);
        order.clickOnHeaderButton();
        order.setFields();
    }
    @Test
    public void successOrderContentButton()  {
        OrderPage order = new OrderPage(driver);
        order.scrollDown();
        order.clickOnContentButton();
        order.setFields();
    }
}