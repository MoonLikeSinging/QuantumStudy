package com.quantum.common;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ws.WSTestCase;
import org.apache.log4j.Logger;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

public class Base extends WebDriverTestCase {
    Logger logger = Logger.getLogger(Base.class);
    public void threadWait(int seconds){

        try {
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException ie){
            logger.error("Get Interrupted Exception when thread sleep " + seconds + "seconds");
        }
    }
}
