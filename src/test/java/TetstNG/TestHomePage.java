package TetstNG;

import Holder.DriverHolder;
import org.testng.annotations.Test;

public class TestHomePage extends TestInit {

    @Test
    public void check()
    {
        DriverHolder driverHolder = new DriverHolder(driver);
        gotoHome();
    }
}
