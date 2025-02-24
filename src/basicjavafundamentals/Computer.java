package basicjavafundamentals;

public class Computer {
	
	//method overloading concepts
	public int info(int x,int y) {
		if (x>5 && y<10) {
			return (x+y);
		}
		else {
			return x;
		}
		
	}
	
	public String info(String x,char y) {
		String data=x+" "+y;
		return data ;
	}
	
	public static boolean info(boolean z) {
		return z ;
	}
	
	public static double info(float a,double b) {
		return a+b ;
	}
	
	public static void main(String [] args) {
		
		Computer c=new Computer();
		System.out.println(c.info(6, 9));
		
		System.out.println(c.info("dell", 'd'));
		System.out.println(Computer.info(true));
		System.out.println(Computer.info(2.5f, 2.5));
	
	}

}
