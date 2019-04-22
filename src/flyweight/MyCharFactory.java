package flyweight;

import java.util.HashMap;
import java.util.Map;

public class MyCharFactory {

	private static Map<Character, MyCharacter> pool = new HashMap<>();;
	
	public static MyCharacter getCharacter(Character myCharacter) {
		if(pool.get(myCharacter) == null){
			pool.put(myCharacter, new MyCharacter(myCharacter));
		}
		return pool.get(myCharacter);
	}
}
