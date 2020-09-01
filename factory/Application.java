package factory;

public class Application {

	public static void main(String[] args) {
		
		SimpleCarFactory cf = new SimpleCarFactory();
		
		Car c = cf.getCar(carModels.Toyota);
		Car c1 = cf.getCar(carModels.Volvo);
		Car c2 = cf.getCar(carModels.Mercedes);
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
	
	}

}
