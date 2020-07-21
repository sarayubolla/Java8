package stream;
import java.util.*;
import java.util.stream.DoubleStream;


public class avg_num {
	public static void main(String args[]) {
		List<Integer> dou=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		double avg=dou.stream().
		mapToInt(i->i).
		average().orElse(-1);
		System.out.println("Average of numbers is: "+avg);
		
	}

}
