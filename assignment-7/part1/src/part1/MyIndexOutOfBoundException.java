package part1;

class MyIndexOutOfBoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6957858603817621408L;
	private final int lowerBound;
	private final int upperBound;
	private final int index;
	
	public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.index = index;
		
		System.out.println("```“Error Message: Index: " + index + ", but Lower bound: " + lowerBound +", Upper bound: " + upperBound + "”```");
		
		}

	public int getLowerBound() {
		return lowerBound;
		}

	public int getUpperBound() {
		return upperBound;
		}

	public int getIndex() {
		return index;
		}
}
