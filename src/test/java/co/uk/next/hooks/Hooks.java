package co.uk.next.hooks;

import co.uk.next.commons.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Browsers {

    private String chromeBrowser = "Chrome";
    @Before
    public void setUp(){
        launchBrowser(chromeBrowser);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
