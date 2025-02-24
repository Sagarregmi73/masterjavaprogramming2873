package streamApi;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List <Integer> data= Arrays.asList(4,6,2,7,6,9,1,2,7);

	int result=data.stream()
			.filter(n->n%2==1)
			.map(n->n*2)
			.reduce(0,(a,b)->a+b);
	System.out.println(result);
	}

}
