package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//div[text()='855.561.4944']")
    public WebElement phoneNumber;

    public void selectCareers (String module){
        Driver.get().findElement(By.xpath("//a[text()='"+module+"']")).click();
    }

}
