package basicjavafundamentals;

public class JavaOperations {

	static int marks=84;
	static int num=2;
	static String result;
	 static int day=4;
	 static int num1=3;
	
	public static void main(String[] args) {
	
		//conditions 
		if(marks > 90 & marks <= 100) {
			System.out.println("first");
		}else if((marks > 80 && marks <=90 )||(marks >70 && marks <=80 )) {
			System.out.println("second");
		}else {
			System.out.println("fail");
		}

		
		//ternary operator
		result=num%2==0 ? "even":"odd";
		
		System.out.println(result);
		
		
		//switch case
		switch(day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		default:
			System.out.println("saurday");
			
		}
		
		//for loops
		for( int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		
		//while loop
		while(num <= 5){
			System.out.println(num);
			num++;
			
			
		};
		
//		do-while loop
		
		do {
			
			System.out.println(num1);
			num1++;
		}while(num1 < 5);
		
		
		//nested for loops
		for( int i=1;i<=5;i++) {
			System.out.println("day"+i);
			for( int j=1;j<=10;j++) {
				System.out.println(" "+j+"-"+5);
			}
		}
		
		
	}
	
	
	
	

}
