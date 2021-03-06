package pages;

import org.openqa.selenium.By;

public class cart {
    public By logo=By.xpath("//div[@class='app_logo']");
    public By button=By.xpath("//button[contains(@id,'react-burger-menu')]");
    public By cart=By.xpath("//div[contains(@id,'shopping')]");
    public By yourCart=By.xpath("//div[@class='subheader']");
    public By qty=By.xpath("//div[@class='cart_quantity_label']");
    public By descp=By.xpath("//div[@class='cart_desc_label']");
    public By cartQty=By.xpath("//div[@class='cart_quantity']");
    public By text=By.xpath("//div[text()='Sauce Labs Backpack']");
    public By desc=By.xpath("//div[contains(text(),'carry')]");
    public By remove=By.xpath("//button[contains(@class,'cart_button')]");
    public By continues=By.xpath("//a[@class='btn_secondary']");
    public By checkOut=By.xpath("//a[text()='CHECKOUT']");
    public By twitter=By.xpath("//a[contains(@href,'twitter')]");
    public By facebook=By.xpath("//a[contains(@href,'facebook')]");
    public By linkedin=By.xpath("//a[contains(@href,'linkedin')]");
    public By footer=By.xpath("//div[@class='footer_copy']");
    public By img1=By.xpath("//img[contains(@alt,'Footer')]");
}
