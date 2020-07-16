package Singleton;

public class Box {
      
	    private Object value;

	    private Box (){}

	    public Object getValue() {
	        return value;
	    }

	    public void setValue(Object value) {
	        this.value = value;
	    }

	    @Override
	    public String toString() {
	        return "value = " + value ;
	    }

	    private static class Singlenton {
	        private static final Box INSTANCE = new Box();

	    }

	    public static Box getInstance(){
	        return  Singlenton.INSTANCE;
	    }
    
}
