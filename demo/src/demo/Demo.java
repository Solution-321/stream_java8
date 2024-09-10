package demo;


import java.util.*;
import java.util.stream.Collectors;

public class Demo {

	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,2,3,2,4,3,3,3,4,5,6);
		
		List<Integer> collect=list.stream().distinct().collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
