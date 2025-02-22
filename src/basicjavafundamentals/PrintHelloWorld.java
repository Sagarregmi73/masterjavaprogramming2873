package basicjavafundamentals;

public class PrintHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//implicit type cast or automatic promotion
		int num1=HelloWorld.num1;
		
		//explicit type cast
		int num2= (int) HelloWorld.d;
		
		HelloWorld obj1=new HelloWorld();
		obj1.name="sagar";
		HelloWorld.num=10;
		
		System.out.println(obj1.name);
		System.out.println(HelloWorld.num);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(HelloWorld.c);
		System.out.println(HelloWorld.d);
		System.out.println(HelloWorld.f);
		System.out.println(HelloWorld.l);
		System.out.println(HelloWorld.a);
		
	}

}
