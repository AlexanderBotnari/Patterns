package Singleton;

public class Box {
      
	private static Box value = new Box();
	
	private Box() {}

	public static Box getValue() {
		return value;
	}

	public static void setValue(Box value) {
		Box.value = value;
	}

	@Override
	public String toString() {
		return "Box =["+ value +"]";
	}
    
}
