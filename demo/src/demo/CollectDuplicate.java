package demo;

import java.util.Arrays;
import java.util.List;

public class CollectDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> c= Arrays.asList("helloworld".split("")).stream().distinct().toList();

System.out.println(c);
	}

}
