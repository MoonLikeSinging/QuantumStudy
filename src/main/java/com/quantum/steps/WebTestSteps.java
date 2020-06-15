package com.quantum.steps;

import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.util.Validator;
import com.quantum.common.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;




@QAFTestStepProvider
public class WebTestSteps extends Base {

    @When("^I open browser to web page$")
    public void iOpenBrowserToWebPage() {

        System.out.println("********" + getProps().getString("env.baseurl"));
        System.out.println(getProps().getString("user.pwd"));

        getDriver().get("/");
        threadWait(20);

        Validator.verifyThat("Validate", "actual", Matchers.equalTo("Expected"));

    }

    @Then("^I save the text into db$")
    public void iSaveTheTextIntoDb() {
    }

}
