package factory;

public class SimpleCarFactory {

	public Car getCar(carModels models) {
		
		Car car = null;
		
		   switch(models) {
		   
		          case Toyota : car = new ToyotaCar();
		          break;
		          
		          case Volvo : car = new VolvoCar();
		          break;
		          
		          case Mercedes : car = new MercedesCar();
		          break;
		          
		          default: System.out.println("Model does not exist!");
		     }
		return car;
		
	}
}
