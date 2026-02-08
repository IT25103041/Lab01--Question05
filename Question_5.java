public class Question_5{
	//Add two numbers
	static int add(int A,int B){
		return A+B;
	}
	
	//multiply two numbers
	static int multiply(int X,int Y){
		return 	X*Y;
	}
	
	//multiplying the number by itself
	static int square(int Z){
		return Z*Z;
	}
	
	public static void main(String[] args){
		
		//calculate the expression
		int expression_1=square(add(multiply(3,4),multiply(5,7)));
		int expression_2=add(square(add(4,7)),square(add(8,3)));
		
		//Display the result
		System.out.println("(3*4+5*7)^2-->" +expression_1);
		System.out.println("(4+7)^2+(8+3)^2--" +expression_2);
	
	}
}
