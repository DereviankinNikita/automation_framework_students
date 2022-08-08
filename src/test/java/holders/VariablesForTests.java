package holders;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class VariablesForTests  {

    public String mainUrl;
    public String shopCartUrl;
    public String cheapPCPage;
    public String bookPage;
    public  String checkoutPage;



    public void setConfigFromPropertyFile() {
        Properties prop = new Properties();
        InputStream input = null;
        String configFile = "src/main/resources/config.properties";
        try {
            input = new FileInputStream(configFile);
            prop.load(input);
            String envValue = System.getProperty("env");
            if (envValue == null || envValue.equals("stage") || envValue.isEmpty()) {
                mainUrl = prop.getProperty("mainUrl");
                shopCartUrl = prop.getProperty("shopCartUrl");
                cheapPCPage = prop.getProperty("cheapPCPage");
                bookPage = prop.getProperty("bookPage");
                checkoutPage = prop.getProperty("checkoutPage");
            }

        } catch (IOException ex) {


        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {

                }
            }
        }

    }
}
