


public class SimpleDice {
	final static int MAX = 6;
	private int faceValue;
	static int count = 0;

	public void setFaceValue(int faceValue) {
		int val = faceValue;
		if(val < 1) val = 1;
		else if (val > this.MAX) val = MAX;
		this.faceValue = val;
	}
	
	public int  getFaceValue() {
		return this.faceValue;
	}


	public SimpleDice() {
		//this.faceValue = 1;
		//this.roll();
		this(1);
		// default constructor
	}
	public SimpleDice(int faceValue) {
		// faceValue = value
		this.faceValue = faceValue;
	}

	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}
	
	public String toString() {
		return "face value is "+this.faceValue;
	}
	
	public boolean equals(Object o) {
		SimpleDice other = (SimpleDice) o ;
		return (this.faceValue == other.faceValue);
	}
}
