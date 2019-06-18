import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Pujitha";
		System.out.println("Hashcode"+s1.hashCode());
		Map<String,Integer> map1= new HashMap<>();
		map1.put("JESU", 1);
		map1.put("KASHIF", 1);
		map1.put("SIBANI", 1);
		map1.put("GOURI", 1);
		System.out.println("Kashif is a good boy");
	}

}
