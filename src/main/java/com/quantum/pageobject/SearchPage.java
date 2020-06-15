package com.quantum.pageobject;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends WebDriverTestBase {

    @FindBy(id = "kw")
    private QAFWebElement searchBox;

    @FindBy(id = "su")
    private QAFWebElement searchSubmit;


}
