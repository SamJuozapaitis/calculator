import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		//ArrayList<String> array = CheckExpression.CheckExp("3+4*2/(1-5)^2^3");
		ArrayList<String> array = CheckExpression.CheckExp("8 / (8");
		System.out.println(array);
		System.out.println(CheckExpression.doMath(array));
		
		System.out.println("Done");
	}

}
