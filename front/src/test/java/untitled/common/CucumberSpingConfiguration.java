package untitled.common;


import untitled.FrontApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { FrontApplication.class })
public class CucumberSpingConfiguration {
    
}
