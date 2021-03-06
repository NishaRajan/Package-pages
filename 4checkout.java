package pages;

import org.openqa.selenium.By;

public class checkout {
    public By logo=By.xpath("//div[@class='app_logo']");
    public By button=By.xpath("//button[contains(@id,'react-burger-menu')]");
    public By cart=By.xpath("//div[contains(@id,'shopping')]");
    public By header=By.xpath("//div[@class='subheader']");
    public By firstName=By.xpath("//input[@id='first-name']");
    public By lastName=By.xpath("//input[@id='last-name']");
    public By postal=By.xpath("//input[@id='postal-code']");
    public By cancel=By.xpath("//a[text()='CANCEL']");
    public By continues=By.xpath("//input[@value='CONTINUE']");
    public By twitter=By.xpath("//a[contains(@href,'twitter')]");
    public By facebook=By.xpath("//a[contains(@href,'facebook')]");
    public By linkedin=By.xpath("//a[contains(@href,'linkedin')]");
    public By footer=By.xpath("//div[@class='footer_copy']");
    public By img1=By.xpath("//img[contains(@alt,'Footer')]");
}
