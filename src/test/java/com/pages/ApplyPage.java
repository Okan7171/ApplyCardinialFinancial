package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplyPage extends BasePage {

    @FindBy (xpath = "//a[text()='Find Your Career']")
    public WebElement findYourCareer;

    @FindBy (xpath = "//a[text()='Apply For This Position']")
    public WebElement applyForThisPosition;

    public void selectJobType(String module){
        Driver.get().findElement(By.xpath("//p[.='"+module+"']")).click();
    }

}
