package finalProject.CoffeeShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import finalProject.CoffeeShop.Controller.Maker.ControllerMaker;

@SpringBootApplication
public class FinalProjectSoftwareEngineeringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectSoftwareEngineeringApplication.class, args);
		ControllerMaker controllerMaker = new ControllerMaker();
		controllerMaker.redirectToAboutus();
	}

}
