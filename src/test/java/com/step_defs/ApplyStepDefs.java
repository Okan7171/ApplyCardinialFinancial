package com.step_defs;

import com.pages.ApplyPage;
import com.pages.RegisterPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ApplyStepDefs {

    ApplyPage applyPage=new ApplyPage();

    @Given("the user should go to the Cardinalfinancial page")
    public void the_user_should_go_to_the_cardinalfinancial_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @Then("the user should validate the correct page")
    public void the_user_should_validate_the_correct_page() {
        Assert.assertEquals(applyPage.phoneNumber.getText(), "855.561.4944");

    }

    @Given("the user should go to the {string} module")
    public void the_user_should_go_to_the_module(String module) {
    applyPage.selectCareers(module);

    }
    @When("the user should go to the Find Your Career secondary module")
    public void the_user_should_go_to_the_secondary_module() {
    applyPage.findYourCareer.click();

    }
    @And("the user should go to the {string} sub-branch")
    public void the_user_should_go_to_the_sub_branch(String module) {
    applyPage.selectJobType(module);

    }
    @And("the user should go to the Apply For This Position secondary sub-branch")
    public void the_user_should_go_to_the_secondary_sub_branch() {
    applyPage.applyForThisPosition.click();

    }



}
