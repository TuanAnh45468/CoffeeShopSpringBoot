package finalProject.CoffeeShop.Controller.Maker;

import finalProject.CoffeeShop.Controller.AboutUs;
import finalProject.CoffeeShop.Controller.ControllerInterface;

public class ControllerMaker {
	private ControllerInterface aboutUs;
	
	public ControllerMaker() {
		aboutUs = new AboutUs();
	}
	
	public void redirectToAboutus() {
		aboutUs.redirect();
	}
}
