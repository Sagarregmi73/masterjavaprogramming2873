package basicjavafundamentals.funcionalinterface.lambda.expression;

@FunctionalInterface
interface A {

	void show(int a);
	
	//void display(); //we can't define more abstract methods if we give annotation functional interface
}

public class Demo{
	public static void main(String [] args) {
		/**A obj=new A() {
			public void show(){
				System.out.println("hello");
			}
		};**/
		
		//lambda expression can be used with functional interface only
		A obj=i->System.out.println("hello"+" "+i);
		obj.show(5);
	}
	

}