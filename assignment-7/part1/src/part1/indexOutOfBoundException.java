package part1;

public class indexOutOfBoundException {

	public static void main(String[] args) {
		int index = 10;
		int lowerBound = 0;
		int upperBound = 9;
		try {
			indexInput.checkInput(lowerBound, upperBound, index);
		}
		catch(MyIndexOutOfBoundException e) {
		}
	}
}
