package part1;

public class indexInput{
	public static void checkInput(int lowerBound, int upperBound, int index)throws MyIndexOutOfBoundException{
		if(lowerBound <= index && upperBound >= index) {
			System.out.println("correct input!");
		}
		else {
			throw new MyIndexOutOfBoundException(lowerBound, upperBound, index);
		}
	}
}
