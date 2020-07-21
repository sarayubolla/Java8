package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class string_check {
	public static void main(String args[]) {
		List<String> list=Arrays.asList("and","ant","bat","mat","dark","lazy","cozy");
		List<String> valid=filterValidStrings(list,(String str)->(str.charAt(0)=='a' && str.length()==3));
		System.out.println(valid);
	}
	public  static List<String> filterValidStrings(List<String> list, Predicate<String> predicate) {
		List<String> m=new ArrayList<>();
		for(String str:list) {
			if(predicate.test(str)) {
				m.add(str);
			}
		}
		return m;
	}
	

}
