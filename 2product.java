package pages;

import org.openqa.selenium.By;

public class product {
    public By logo=By.xpath("//div[@class='app_logo']");
    public By button=By.xpath("//button[contains(@id,'react-burger-menu')]");
    public By cart=By.xpath("//div[contains(@id,'shopping')]");
    public By img=By.xpath("//div[@class='peek']");
    public By product=By.xpath("//div[@class='product_label']");
    public By select=By.xpath("//select[contains(@class,'product')]");
    public By backPack=By.xpath("//img[@alt='Sauce Labs Backpack']");
    public By text=By.xpath("//div[text()='Sauce Labs Backpack']");
    public By desc=By.xpath("//div[contains(text(),'carry')]");
    public By twitter=By.xpath("//a[contains(@href,'twitter')]");
    public By facebook=By.xpath("//a[contains(@href,'facebook')]");
    public By linkedin=By.xpath("//a[contains(@href,'linkedin')]");
    public By footer=By.xpath("//div[@class='footer_copy']");
    public By img1=By.xpath("//img[contains(@alt,'Footer')]");
}
