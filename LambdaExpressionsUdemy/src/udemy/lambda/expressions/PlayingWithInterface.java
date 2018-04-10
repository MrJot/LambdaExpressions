package udemy.lambda.expressions;

import java.util.List;
import java.util.ArrayList;

public class PlayingWithInterface {
	
	public static void main(String[] args) {
		
//		int addingResult = addTwoNumbers(new MathOperations() {
//			
////			@Override
////			public int multipleTwoNubers(int a, int b) {
////				return a+b;
////			}
//			
//			@Override
//			public int addingTwoNumber(int a, int b) {
//				return a*b;
//			}
//		}, 2, 4);
//		
//		System.out.println(addingResult);
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		
		MathOperations m = (array, firstNumber)->{
			for (int n:firstNumber){
				array.add(n);
			};
			return array;
		};//why I must give return statement (	BECAUSE I USED BRACKETS )
		
		
		
		//why I must give return statement
		
		System.out.println(numberList);
		

		
		
	
		
	}
	
	
//	public static int addTwoNumbers(MathOperations m, int firstNumber, int secondNumber) {
//		return m.addingTwoNumber(firstNumber, secondNumber);
//	}
	
	public static ArrayList<Integer> addStufftoList(MathOperations m, ArrayList<Integer>array, int...firstNumber) {
		return m.loopThroughAray(array, firstNumber);
	}
	
	

	
	

}
