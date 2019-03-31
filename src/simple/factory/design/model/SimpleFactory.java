package simple.factory.design.model;

public class SimpleFactory {

	public static Fruite getInstance(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		if(type.equalsIgnoreCase("apple")){
//			return (Fruite)Apple.class.newInstance();
//		}else if(type.equalsIgnoreCase("banana")){
//			return (Fruite)Banana.class.newInstance();
//		}else {
//			return null;
//		}
		
		Class forName = Class.forName(type);
		return (Fruite)forName.newInstance();
	}
	
	
}

