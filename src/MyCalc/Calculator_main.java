package MyCalc;

public class Calculator_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		int sum =obj.add(10, 50);
		System.out.println(sum);
		
		int min =obj.sub(10, 50);
		System.out.println(min);
		int mul =obj.multi(10, 50);
		System.out.println(mul);
		int divi =obj.div(10, 50);
		System.out.println(divi);
		
		

	}

}
