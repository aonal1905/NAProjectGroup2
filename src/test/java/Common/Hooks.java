package Common;


import cucumber.api.java.After;

public class Hooks extends Base {
    @After
    public void closeDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
 }




}
