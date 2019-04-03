package simple.factory;

public class SimpleFactory {

	public static Fruite getInstance(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		if(type.equalsIgnoreCase("apple")){
//			return (Fruite)Apple.class.newInstance();
//		}else if(type.equalsIgnoreCase("banana")){
//			return (Fruite)Banana.class.newInstance();
//		}else {
//			return null;
//		}
		//这种方式需要传入类全名
		Class forName = Class.forName(type);
		return (Fruite)forName.newInstance();
	}
	
	
}

