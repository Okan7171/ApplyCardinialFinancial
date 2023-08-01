package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class RegisterPage extends BasePage{

    @FindBy (xpath = "//input[@id='email']")
    public WebElement inputEmail;

    @FindBy (xpath = "(//input[@type='file'])[3]")
    public WebElement enterUploadResume;

    public void changeTab (){
        String currentWindow = Driver.get().getWindowHandle();
        Set<String> windowHandles = Driver.get().getWindowHandles();

        for (String windowHandle : windowHandles) {
            if(!currentWindow.equals(windowHandle)){
                Driver.get().switchTo().window(windowHandle);
            }
        }
    }

    public void enterEmailPassword(String email, String password,String reTypePassword){
        Actions actions=new Actions(Driver.get());
        actions.click(inputEmail)
                .sendKeys(email + Keys.TAB)
                .sendKeys(password + Keys.TAB)
                .sendKeys(reTypePassword + Keys.TAB + Keys.TAB +Keys.ENTER)
                .perform();

    }

    public void uploadResume (){
    String projePath = System.getProperty("user.dir");
    String filePath= "src/test/resources/OlcayERResume.pdf";
    String fullPath= projePath + "/" + filePath;

    enterUploadResume.sendKeys(fullPath);

    }
}
