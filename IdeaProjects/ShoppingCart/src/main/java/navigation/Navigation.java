package navigation;

import driver.DriverRepository;
import org.openqa.selenium.WebDriver;


public class Navigation {
    private WebDriver Driver;

    public Navigation(){
        Driver = DriverRepository.DRIVERS.get();
    }

    public void NavigateToURL(String URL){
        Driver.get(URL);
        Driver.manage().window().maximize();
    }
}
