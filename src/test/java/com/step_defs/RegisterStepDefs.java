package com.step_defs;

import com.pages.RegisterPage;
import io.cucumber.java.en.When;

public class RegisterStepDefs {

    RegisterPage registerPage=new RegisterPage();


    @When("the user should go to the Register page")
    public void the_user_should_go_to_the_register_page() {
    registerPage.changeTab();
    }
    @When("the user should enter valid {string}, {string} and {string}")
    public void the_user_should_enter_valid_and(String email, String password, String reTypePassword) {
    registerPage.enterEmailPassword(email, password, reTypePassword);
    }

    @When("the user should upload upload resume")
    public void the_user_should_upload_upload_resume() {
        registerPage.uploadResume();
    }
    @When("the user should enter personal information")
    public void the_user_should_enter_personal_information() {

    }

}
