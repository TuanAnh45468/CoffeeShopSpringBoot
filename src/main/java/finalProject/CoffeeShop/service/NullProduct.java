package finalProject.CoffeeShop.service;

public class NullProduct extends AbstractProduct{

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Product in database is empty";
	}
	
	
}
