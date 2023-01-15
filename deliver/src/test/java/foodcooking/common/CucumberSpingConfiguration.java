package foodcooking.common;


import foodcooking.DeliverApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliverApplication.class })
public class CucumberSpingConfiguration {
    
}
